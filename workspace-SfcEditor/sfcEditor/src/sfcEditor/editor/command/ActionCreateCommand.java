package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateConnectionRequest;

import sfcmodel.model.*;
import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;
import sfcEditor.editor.factory.SelectionFactory;

public class ActionCreateCommand extends Command implements ConstantParameters {
	private static final Dimension defaultDimension = 
			new Dimension(ACTION_WIDTH, ACTION_HEIGHT);
	private static final Qualifiers defaultQualifier = Qualifiers.N;
	private static final String defaultName = "A1";
	private static final String defaultIndicator = "I1";
	private static final String defaultInstructions = "<...>";
	private Action action;
  	private Rectangle constraintsRectangle;
	private Point startPoint;
  	private SequentialFunctionChart sfc;
	
  	@Override
  	public void execute() {
  		this.action.setQualifier(defaultQualifier);
  		this.action.setName(defaultName);
  		this.action.setIndicatorVariable(defaultIndicator);
  		this.action.setInstructionBlock(defaultInstructions);
  		if(this.constraintsRectangle != null) {
  			this.action.setConstraintsRectangle(this.constraintsRectangle);
  		}
  		this.action.setStartPoint(this.startPoint);
  		this.action.setActionType(ActionType.NAME_QUALIFIER_INDICATOR_INSTRUCTIONS);
  		this.action.setSfc(this.sfc);
  		

  		//	If action is under step
  		//		move action 50 pixels to the right 
  		//		create selection connection 
  		for(SfcObject sfcObject : this.sfc.getSfcObjects()) {
  			if(sfcObject instanceof Step) {
  				Step s = ((Step)sfcObject);
  				Rectangle stepRect = s.getConstraintsRectangle();
  				Point location = this.action.getConstraintsRectangle().getLocation();
  				
  				if(stepRect.contains(location)) {
  					//move action
  					this.constraintsRectangle.setX(stepRect.getLocation().x + STEP_WIDTH + ACTION_STEP_DISTANCE);
  					this.constraintsRectangle.setY(stepRect.getLocation().y + STEP_CONN_LENGTH);
  					
  					// create connection between step and action
  			  		SelectionCreateCommand result = new SelectionCreateCommand();
  					result.setConnectionInput(s);
  					result.setConnectionOutput(this.action);
  					CreateConnectionRequest request = new CreateConnectionRequest();
  					request.setFactory(new SelectionFactory());
  					result.setSelection((Selection) request.getNewObject());
  					result.setSequentialFunctionChart(this.sfc);
  					request.setStartCommand(result);
  					result.execute();
  				}
  			}
  		}
  		
	    BendpointFunctions.refreshAction(this.action);
  	}
 
  	@Override
  	public void undo() {
  		this.action.setSfc(null);
  	}

  	public void setAction(Action action) {
  		this.action = action;
  	}
  	
  	public void setLocation(Point location) {
  		this.constraintsRectangle = new Rectangle(location, defaultDimension);
  		this.startPoint = new Point(constraintsRectangle.x, constraintsRectangle.y+ACTION_QUALIFIER_HEIGHT/2);
  	}
 
  	public void setParent(SequentialFunctionChart sfc) {
  		this.sfc = sfc;
  	}
}
