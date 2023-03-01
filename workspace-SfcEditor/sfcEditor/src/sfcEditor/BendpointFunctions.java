package sfcEditor;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

import sfcmodel.model.*;

/*
 * This class help you to move all bendpoints, actions and simultaneous lines to the right position.
 * @author: Filip Humaj
 */
public class BendpointFunctions extends EditorFunctions implements ConstantParameters {
	
	static Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
	
	// This method remove the bendpoint (at the index) of the connection c and set it to the new position
  	private static void refreshConnectionBendpoint(Connection c, int index, int newPosX, int newPosY) {
  		if(c.getBendpoints().size() >= index+1) {
  			c.getBendpoints().remove(index);
  			c.getBendpoints().add(index, new Point(newPosX, newPosY));
  		}
  		else {
  			c.getBendpoints().add(index, new Point(newPosX, newPosY));
  		}
  	}
  	
  	// Set bendpoints of step to transition connection
  	private static void refreshBendpointsFromStepToTransition(Connection con, Step s, Transition t) {
		// case: step is under transition but not directly
  		if(s.getEndPoint().y < t.getStartPoint().y) {
  			if(s.getEndPoint().x != t.getStartPoint().x) {
		    	refreshConnectionBendpoint(con, bendpoint1Index, s.getEndPoint().x, s.getEndPoint().y+(t.getStartPoint().y-s.getEndPoint().y)/2);
		    	refreshConnectionBendpoint(con, bendpoint2Index, t.getStartPoint().x, s.getEndPoint().y+(t.getStartPoint().y-s.getEndPoint().y)/2);
    	
  			}
  		}	
  		// case: step is above transition
    	else {
    		//int middle = s.getEndPoint().x+(t.getStartPoint().x-s.getEndPoint().x)/2;
    		int maxright = Math.max(s.getEndPoint().x, t.getEndPoint().x);
    		
	    	refreshConnectionBendpoint(con, bendpoint1Index, s.getEndPoint().x, s.getEndPoint().y+10);
	    	refreshConnectionBendpoint(con, bendpoint2Index, maxright + BACKWARD_CONNECTION_DISTANCE_TOOTHERS, s.getEndPoint().y+10);
	    	refreshConnectionBendpoint(con, bendpoint3Index, maxright + BACKWARD_CONNECTION_DISTANCE_TOOTHERS, t.getStartPoint().y-10);
	    	refreshConnectionBendpoint(con, bendpoint4Index, t.getStartPoint().x, t.getStartPoint().y-10);
    	}
  	}

  	// Set bendpoints of transition to step connection
  	private static void refreshBendpointsFromTransitionToStep(Connection con, Step s, Transition t) {
  		// case: transition is under step but not directly
  		if(t.getEndPoint().y < s.getStartPoint().y) {
    		if(t.getEndPoint().x != s.getStartPoint().x) {
    			refreshConnectionBendpoint(con, bendpoint1Index, t.getEndPoint().x, t.getEndPoint().y+(s.getStartPoint().y-t.getEndPoint().y)/2);
    			refreshConnectionBendpoint(con, bendpoint2Index, s.getStartPoint().x, t.getEndPoint().y+(s.getStartPoint().y-t.getEndPoint().y)/2);
    		}
  		}
  		// case: transition is above step
    	else {
    		int dist;
    		int offset;
    		if(s instanceof InitialStep) {
    			dist = getRight(s.getSfc());
    			offset = BACKWARD_CONNECTION_DISTANCE_TOINITSTEP;
    		} 
    		else {
        		dist = Math.max(s.getEndPoint().x, t.getEndPoint().x);
        		offset = BACKWARD_CONNECTION_DISTANCE_TOOTHERS;
    		}
    		
	    	refreshConnectionBendpoint(con, bendpoint1Index, t.getEndPoint().x, t.getEndPoint().y+10);
	    	refreshConnectionBendpoint(con, bendpoint2Index, dist + offset, t.getEndPoint().y+10);
	    	refreshConnectionBendpoint(con, bendpoint3Index, dist + offset, s.getStartPoint().y-10);
	    	refreshConnectionBendpoint(con, bendpoint4Index, s.getStartPoint().x, s.getStartPoint().y-10);
    	}
  	}
  	
  	// Create a connection with 2 or 4 bendpoints
  	private static void refreshBendpoints(Step s) {
  		for(Connection connFromStepToTransition : s.getOutgoingConnections()) {
  			if(connFromStepToTransition.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
	    		Transition t = connFromStepToTransition.getTransitionOut();
		    	connFromStepToTransition.getBendpoints().clear();
		    	refreshBendpointsFromStepToTransition(connFromStepToTransition, s, t);
  			}
	    }
  		for(Connection con : s.getIncomingConnections()) {
  			if(con.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
		    	Transition t = con.getTransitionIn();
		    	con.getBendpoints().clear();
		    	refreshBendpointsFromTransitionToStep(con, s, t);
  			}
	    }
  	}
  	
  	// Create a connection with 2 or 4 bendpoints
  	private static void refreshBendpoints(Transition t) {
  		for(Connection connFromTransitionToStep : t.getOutgoingConnections()) {
  			if(connFromTransitionToStep.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
	    		Step s = connFromTransitionToStep.getStepOut();
		    	connFromTransitionToStep.getBendpoints().clear();
		    	refreshBendpointsFromTransitionToStep(connFromTransitionToStep, s, t);
  			}
	    }
  		for(Connection connFromStepToTransition : t.getIncomingConnections()) {
  			if(connFromStepToTransition.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
  	  			Step s = connFromStepToTransition.getStepIn();
  		    	connFromStepToTransition.getBendpoints().clear();
  		    	refreshBendpointsFromStepToTransition(connFromStepToTransition, s, t);
  			}
	    }
  	}
  	
  	// Go to previous and next step/transition and move bendpoints of all 
  	// other connections to create a vertical line for all connections
  	private static void refreshOtherBendpoints(Step s) {
  		// move all incoming connections to a horizontal line
    	int ymin = -1; // get yvalue of highest bendpoint
    	for(Connection connFromTransitionToStep: s.getIncomingConnections()) {
    		if(connFromTransitionToStep.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
    			for(Connection connFromTransitionToStep2: connFromTransitionToStep.getTransitionIn().getOutgoingConnections()) {
    				if(connFromTransitionToStep2.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP &&
    						connFromTransitionToStep2.getBendpoints().size() == 2) {
		    			if(ymin == -1) {
		    				ymin = connFromTransitionToStep2.getBendpoints().get(bendpoint1Index).y();
		    			}
		    			else if(connFromTransitionToStep2.getBendpoints().get(bendpoint1Index).y() < ymin) {
		    				ymin = connFromTransitionToStep2.getBendpoints().get(bendpoint1Index).y();
		    			}
    				}
    			}
    		}
    	}
    	for(Connection connFromTransitionToStep: s.getIncomingConnections()) {
    		if(connFromTransitionToStep.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
    			for(Connection connFromTransitionToStep2: connFromTransitionToStep.getTransitionIn().getOutgoingConnections()) {
    				if(connFromTransitionToStep2.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP &&
    						connFromTransitionToStep2.getBendpoints().size() == 2 && ymin != -1) {
    					refreshConnectionBendpoint(connFromTransitionToStep2, bendpoint1Index, 
    							connFromTransitionToStep2.getBendpoints().get(bendpoint1Index).x(), ymin);
    					refreshConnectionBendpoint(connFromTransitionToStep2, bendpoint2Index, 
    							connFromTransitionToStep2.getBendpoints().get(bendpoint2Index).x(), ymin);
    				}
    			}
    		}
    	}
    	
    	// move all outgoing connections to a horizontal line
    	int ymax = -1;	// get yvalue of lowest bendpoint
    	for(Connection connFromStepToTransition: s.getOutgoingConnections()) {
    		if(connFromStepToTransition.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
    			for(Connection connFromStepToTransition2: connFromStepToTransition.getTransitionOut().getIncomingConnections()) {	
    				if(connFromStepToTransition2.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION &&
    						connFromStepToTransition2.getBendpoints().size() == 2) {
		    			if(ymax == -1) {
		    				ymax = connFromStepToTransition2.getBendpoints().get(bendpoint1Index).y();
		    			}
		    			else if(connFromStepToTransition2.getBendpoints().get(bendpoint1Index).y() > ymax) {
		    				ymax = connFromStepToTransition2.getBendpoints().get(bendpoint1Index).y();
		    			}
    				}
    			}
    		}
    	}
    	for(Connection connFromStepToTransition: s.getOutgoingConnections()) {
    		if(connFromStepToTransition.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
				for(Connection connFromStepToTransition2: connFromStepToTransition.getTransitionOut().getIncomingConnections()) {	
    				if(connFromStepToTransition2.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION &&
    						connFromStepToTransition2.getBendpoints().size() == 2 && ymax != -1) {
    					refreshConnectionBendpoint(connFromStepToTransition2, bendpoint1Index, 
    							connFromStepToTransition2.getBendpoints().get(bendpoint1Index).x(), ymax);
    					refreshConnectionBendpoint(connFromStepToTransition2, bendpoint2Index, 
    							connFromStepToTransition2.getBendpoints().get(bendpoint2Index).x(), ymax);
    				}
				}
    		}
    	}
  	}
  	
  	// Move other bendpoints to create a vertical line for all connections
  	private static void refreshOtherBendpoints(Transition t) {
  		// move all incoming connections to a horizontal line
    	// get yvalue of highest bendpoint
    	int ymin = -1;
    	for(Connection connFromStepToTransition: t.getIncomingConnections()) {
    		if(connFromStepToTransition.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
    			for(Connection connFromStepToTransition2: connFromStepToTransition.getStepIn().getOutgoingConnections()) {
    	    		if(connFromStepToTransition2.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION &&
    	    				connFromStepToTransition2.getBendpoints().size() == 2) {
		    			if(ymin == -1) {
		    				ymin = connFromStepToTransition2.getBendpoints().get(bendpoint1Index).y();
		    			}
		    			else if(connFromStepToTransition2.getBendpoints().get(bendpoint1Index).y() < ymin) {
		    				ymin = connFromStepToTransition2.getBendpoints().get(bendpoint1Index).y();
		    			}
		    		}
    			}
    		}
    	}
		for(Connection connFromStepToTransition: t.getIncomingConnections()) {
    		if(connFromStepToTransition.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
				for(Connection connFromStepToTransition2: connFromStepToTransition.getStepIn().getOutgoingConnections()) {
		    		if(connFromStepToTransition2.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION &&
		    				connFromStepToTransition2.getBendpoints().size() == 2 && ymin != -1) {
    					refreshConnectionBendpoint(connFromStepToTransition2, bendpoint1Index, 
							connFromStepToTransition2.getBendpoints().get(bendpoint1Index).x(), ymin);
    					refreshConnectionBendpoint(connFromStepToTransition2, bendpoint2Index, 
							connFromStepToTransition2.getBendpoints().get(bendpoint2Index).x(), ymin);
    				}
	    		}
    		}
		}
    	
    	// move all outgoing connections to a horizontal line
    	// get yvalue of lowest bendpoint
    	int ymax = -1;
    	for(Connection connFromTransitionToStepFrom: t.getOutgoingConnections()) {
    		if(connFromTransitionToStepFrom.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
    			for(Connection connFromTransitionToStepFrom2: connFromTransitionToStepFrom.getStepOut().getIncomingConnections()) {
    	    		if(connFromTransitionToStepFrom2.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP &&
    	    				connFromTransitionToStepFrom2.getBendpoints().size() == 2) {
		    			if(ymax == -1) {
		    				ymax = connFromTransitionToStepFrom2.getBendpoints().get(bendpoint1Index).y();
		    			}
		    			else if(connFromTransitionToStepFrom2.getBendpoints().get(bendpoint1Index).y() > ymax) {
		    				ymax = connFromTransitionToStepFrom2.getBendpoints().get(bendpoint1Index).y();
		    			}
    	    		}
    			}
			}
    	}
    	for(Connection connFromTransitionToStep: t.getOutgoingConnections()) {
    		if(connFromTransitionToStep.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
    			for(Connection connFromTransitionToStep2: connFromTransitionToStep.getStepOut().getIncomingConnections()) {
    	    		if(connFromTransitionToStep2.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP &&
    	    				connFromTransitionToStep2.getBendpoints().size() == 2 && ymax != -1) {
    	    			refreshConnectionBendpoint(connFromTransitionToStep2, bendpoint1Index, 
    	    					connFromTransitionToStep2.getBendpoints().get(bendpoint1Index).x(), ymax);
    	    			refreshConnectionBendpoint(connFromTransitionToStep2, bendpoint2Index, 
    	    					connFromTransitionToStep2.getBendpoints().get(bendpoint2Index).x(), ymax);		
    	    		}
    			}
    		}
    	}
  	}

  	// Add images to a connection between bendpoint1 & bendpoint2
	private static void setImageToCon(Connection conn, String path) {
  		int x1 = conn.getBendpoints().get(bendpoint1Index).x;
  		int x2 = conn.getBendpoints().get(bendpoint2Index).x;
  		int y = conn.getBendpoints().get(bendpoint1Index).y;
  		
  		int imgSizeX = 25;
  		int imgSizeY = 5;
  		
  		long length = Math.abs(x1-x2);
		long num = Math.round(length/imgSizeX)+1;
		
		// Delete all added figures of the connection
		conn.getPolylineConnection().removeAll();
		
		for(int i=0; i<=num; i++) {
			MyPolylineLocator loc;
			ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(bundle.getEntry(path));
			IFigure simultaneousLine =  new ImageFigure(imageDescriptor.createImage());
			
			if(i!=num) {
				// x1+(i+1)*imgSizeX < x2 prevent additionally drawing overhanging lines
				if(x1 < x2 && x1+(i+1)*imgSizeX < x2) {
					loc = new MyPolylineLocator(simultaneousLine, x1+i*imgSizeX, y-imgSizeY/2);
				}
				else if(x2 < x1 && x2+(i+1)*imgSizeX < x1) {
					loc = new MyPolylineLocator(simultaneousLine, x2+i*imgSizeX, y-imgSizeY/2);
				}
				else {
					continue;
				}
			}
			// prevent additionally drawing overhanging lines
			else {
				if(x1 < x2) {
					loc = new MyPolylineLocator(simultaneousLine, x2-imgSizeX, y-imgSizeY/2);
				}
				else {
					loc = new MyPolylineLocator(simultaneousLine, x1-imgSizeX, y-imgSizeY/2);
				}
			}	
			conn.getPolylineConnection().add(simultaneousLine, loc);
		}
  	}

	// Add/Remove User priority numbers for selection connection
	public static void refreshSelectionLine(Selection selection) {
		selection.getPolylineConnection().removeAll();
		if(selection.getUserPriorityEnabled() == Boolean.TRUE) {
	    	ConnectionEndpointLocator targetLocator =
	    			new ConnectionEndpointLocator(selection.getPolylineConnection(), true);
	    	if(selection.getUserPriorities() != null)
	    		selection.getPolylineConnection().add(new Label(selection.getUserPriorities().toString()), targetLocator);
	    } 
	}
	
	// Add/Remove User priority numbers for selection connections
	public static void refreshSelectionLine(Step s) {
		if(s != null) {
			for(Connection conn : s.getIncomingConnections()) {
				if(conn instanceof Selection) {
					refreshSelectionLine((Selection)conn);
				}
			}
		}
	}
	
	// Add/Remove User priority numbers for selection connections
	public static void refreshSelectionLine(Transition t) {
		if(t != null) {
			for(Connection conn : t.getIncomingConnections()) {
				if(conn instanceof Selection) {
					refreshSelectionLine((Selection)conn);
				}
			}
		}
	}
	
  	// Draw simultaneous lines to incoming and outgoing simultaneous connections
  	public static void refreshSimultaneousLines(Step s) {
  		if(s != null) {
	  		for(Connection con1: s.getIncomingConnections()) {
	    		if(con1 instanceof Simultaneous && con1.getTransitionIn() != null) {
		    		for(Connection con: con1.getTransitionIn().getOutgoingConnections()) {
		    			// Delete all added figures of the connection
		    			if (con.getPolylineConnection() != null) {
		    				con.getPolylineConnection().removeAll();
				    		if(con.getBendpoints().size() == 2) {
				    			setImageToCon(con, "icons/simultaneousLine.png");
				    		}
	    				}
		    		}
	    		}
	    	}
	  		for(Connection con1: s.getOutgoingConnections()) {
	    		if(con1 instanceof Simultaneous && con1.getTransitionIn() != null) {
		    		for(Connection con: con1.getTransitionOut().getIncomingConnections()) {
		    			// Delete all added figures of the connection
		    			if (con.getPolylineConnection() != null) {
		    				con.getPolylineConnection().removeAll();
				    		if(con.getBendpoints().size() == 2) {
				    			setImageToCon(con, "icons/simultaneousLine.png");
				    		}
	    				}
		    		}
	    		}
	    	}
  		}
  	}
  	
  	// Draw simultaneous lines to incoming and outgoing simultaneous connections
  	public static void refreshSimultaneousLines(Transition t) {
  		if(t != null) {
	    	for(Connection con1: t.getIncomingConnections()) {
	    		if(con1 instanceof Simultaneous && con1.getStepIn() != null) {
		    		for(Connection con: con1.getStepIn().getOutgoingConnections()) {
		    			// Delete all added figures of the connection
		    			if (con.getPolylineConnection() != null) {
		    				con.getPolylineConnection().removeAll();
				    		if(con.getBendpoints().size() == 2) {
				    			setImageToCon(con, "icons/simultaneousLine.png");
				    		}
	    				}
		    		}
	    		}
	    	}
	
	    	for(Connection con1: t.getOutgoingConnections()) {
	    		if(con1 instanceof Simultaneous && con1.getStepOut() != null) {
	    			for(Connection con: con1.getStepOut().getIncomingConnections()) {
	    				// Delete all added figures of the connection
	    				if (con.getPolylineConnection() != null) {
		    				con.getPolylineConnection().removeAll();
		    				if(con.getBendpoints().size() == 2) {
		    					setImageToCon(con, "icons/simultaneousLine.png");
		    				}
	    				}
	    			}
	    		}
		    		
	    	}
  		}
  	}
  	
  	// Move actions to right positions
  	public static void moveActionsToRightPos(Action action) {
		if(action.getIncomingConnections().size() > 0) {
			if(action.getIncomingConnections().get(0).getStepIn() != null) {
				Step s = action.getIncomingConnections().get(0).getStepIn();
				Point startPointFirst = null;
				int yRectOffset = 0;
				int xRect = 0;
				
				action.getConstraintsRectangle().setY(s.getStartPoint().y+STEP_CONN_LENGTH);
				action.setStartPoint(new Point(action.getConstraintsRectangle().x, 
						action.getConstraintsRectangle().y+ACTION_QUALIFIER_HEIGHT/2));
				
				for(Connection connFromStepToAction : s.getOutgoingConnections()) {
					if(connFromStepToAction.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) {
						Action a = connFromStepToAction.getAction();
						
						connFromStepToAction.getBendpoints().clear();
						// first action (only action with only one bendpoint)
						if(startPointFirst == null) {
							startPointFirst = a.getStartPoint();
							
							a.getStartPoint().setLocation(startPointFirst);
							refreshConnectionBendpoint(connFromStepToAction, bendpoint1Index, 
									startPointFirst.x,
									startPointFirst.y);
							xRect = a.getConstraintsRectangle().x;
							yRectOffset = a.getConstraintsRectangle().y;
						}
						// each other action (with two bendppoints)
						else {
							a.getConstraintsRectangle().setX(xRect);
							a.getConstraintsRectangle().setY(yRectOffset);
							
							a.setStartPoint(new Point(xRect, a.getConstraintsRectangle().y+ACTION_QUALIFIER_HEIGHT/2));
							
							refreshConnectionBendpoint(connFromStepToAction, bendpoint1Index, 
									startPointFirst.x,
									startPointFirst.y);
							refreshConnectionBendpoint(connFromStepToAction, bendpoint2Index, 
									a.getStartPoint().x,
									a.getStartPoint().y);
						}
						yRectOffset += a.getConstraintsRectangle().height;
					}
				}
			}
		}
  	}
  	
  	// refresh direct and indirect connections bendpoints (use after object created/changed)
  	public static void refreshConnectionBendpoints(Step s) {
  		if(s != null) {
	  		refreshBendpoints(s);
	  		refreshOtherBendpoints(s);
	  		refreshSimultaneousLines(s);
	  		refreshSelectionLine(s);
	  		for(Connection con : s.getOutgoingConnections()) {
	  			if(con.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) { 
	  				moveActionsToRightPos(con.getAction());
	  			}
	  		}
  		}
  	}

  	// refresh direct and indirect connections bendpoints (use after object created/changed)
  	public static void refreshConnectionBendpoints(Transition t) {
  		if(t != null) {
	  		refreshBendpoints(t);
	  		refreshOtherBendpoints(t);
	  		refreshSimultaneousLines(t);
	  		refreshSelectionLine(t);
  		}
  	}
  	
   	// move actions connected to a s to the right position and set bendpoints correctly
   	public static void refreshAction(Action action) {
   		if(action != null) {
   			moveActionsToRightPos(action);
   		}
   	}
}
