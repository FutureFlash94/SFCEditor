package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;
import sfcmodel.model.ConnectionType;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.SfcObject;
import sfcmodel.model.Simultaneous;
import sfcmodel.model.Step;
import sfcmodel.model.Transition;

public class SimultaneousCreateCommand extends Command implements ConstantParameters  {
	private Step stepIn;
	private Step stepOut;
	private Transition transitionIn;
	private Transition transitionOut;
	private Simultaneous simultaneous;
	private ConnectionType connectionType;
	private SequentialFunctionChart sfc;
	
	private boolean isFromStepToTransition() {
		if(stepIn != null && transitionOut != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean isFromTransitionToStep() {
		if(stepOut != null && transitionIn != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public boolean canExecute() {
	    return simultaneous != null && (isFromStepToTransition() || isFromTransitionToStep());
	}
	
	@Override
	public void execute() {
	    simultaneous.setPolylineConnection(simultaneous.getPolylineConnection());
	    
	    if(this.connectionType == ConnectionType.FROM_STEP_TO_TRANSITION) {
	    	simultaneous.setConnectionType(ConnectionType.FROM_STEP_TO_TRANSITION);
	    	simultaneous.setStepIn(stepIn);
	    	simultaneous.setTransitionOut(transitionOut);
		    //create bendpointpoints
			if(stepIn.getEndPoint().x != transitionOut.getStartPoint().x) {
				if(stepIn.getEndPoint().y < transitionOut.getStartPoint().y) {
			    	// if source thing is above the target
			    	simultaneous.getBendpoints().add(bendpoint1Index,  
			    		new Point(stepIn.getEndPoint().x, stepIn.getEndPoint().y+(transitionOut.getStartPoint().y-stepIn.getEndPoint().y)/2));
				    simultaneous.getBendpoints().add(bendpoint2Index, 
				    	new Point(transitionOut.getStartPoint().x, stepIn.getEndPoint().y+(transitionOut.getStartPoint().y-stepIn.getEndPoint().y)/2));
			    }
			    else {
			    	// if source thing is under the target
			    	simultaneous.getBendpoints().add(bendpoint1Index, 
			    		new Point(stepIn.getEndPoint().x, stepIn.getEndPoint().y+10));
			    	simultaneous.getBendpoints().add(bendpoint2Index, 
				    	new Point(stepIn.getEndPoint().x+(transitionOut.getStartPoint().x-stepIn.getEndPoint().x)/2, stepIn.getEndPoint().y+10));
			    	simultaneous.getBendpoints().add(bendpoint3Index, 
				    	new Point(stepIn.getEndPoint().x+(transitionOut.getStartPoint().x-stepIn.getEndPoint().x)/2, transitionOut.getStartPoint().y-10));
			    	simultaneous.getBendpoints().add(bendpoint4Index, 
				    	new Point(transitionOut.getStartPoint().x, transitionOut.getStartPoint().y-10));
			    }
				BendpointFunctions.refreshConnectionBendpoints(stepIn);
				BendpointFunctions.refreshConnectionBendpoints(transitionOut);
			}
	    }
	    else if(this.connectionType == ConnectionType.FROM_TRANSITION_TO_STEP) {
	    	simultaneous.setConnectionType(ConnectionType.FROM_TRANSITION_TO_STEP);
	    	simultaneous.setTransitionIn(transitionIn);
	    	simultaneous.setStepOut(stepOut);
	    	if(transitionIn.getEndPoint().x != stepOut.getStartPoint().x) {
			    //create bendpointpoints
			    if(transitionIn.getEndPoint().y < stepOut.getStartPoint().y) {
				    simultaneous.getBendpoints().add(bendpoint1Index, 
				    	new Point(transitionIn.getEndPoint().x, transitionIn.getEndPoint().y+(stepOut.getStartPoint().y-transitionIn.getEndPoint().y)/2));
				    simultaneous.getBendpoints().add(bendpoint2Index, 
				    	new Point(stepOut.getStartPoint().x, transitionIn.getEndPoint().y+(stepOut.getStartPoint().y-transitionIn.getEndPoint().y)/2));
			    }
			    else {
			    	// if source thing is under the target
			    	simultaneous.getBendpoints().add(bendpoint1Index,
			    		new Point(transitionIn.getEndPoint().x, transitionIn.getEndPoint().y+10));
			    	simultaneous.getBendpoints().add(bendpoint2Index, 
				    	new Point(transitionIn.getEndPoint().x+(stepOut.getStartPoint().x-transitionIn.getEndPoint().x)/2, transitionIn.getEndPoint().y+10));
			    	simultaneous.getBendpoints().add(bendpoint3Index, 
				    	new Point(transitionIn.getEndPoint().x+(stepOut.getStartPoint().x-transitionIn.getEndPoint().x)/2, stepOut.getStartPoint().y-10));
			    	simultaneous.getBendpoints().add(bendpoint4Index, 
				    	new Point(stepOut.getStartPoint().x, stepOut.getStartPoint().y-10));
			    }
			    BendpointFunctions.refreshConnectionBendpoints(transitionIn);
			    BendpointFunctions.refreshConnectionBendpoints(stepOut);
	    	}
	    }
	    simultaneous.setSfc(sfc);
	}
	
	@Override 
	public void undo() {
		if(simultaneous.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
			simultaneous.getStepIn().getOutgoingConnections().remove(simultaneous);
			simultaneous.getTransitionOut().getIncomingConnections().remove(simultaneous);
			simultaneous.setStepIn(null);
			simultaneous.setTransitionOut(null);
		}
		else if(simultaneous.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
			simultaneous.getTransitionIn().getOutgoingConnections().remove(simultaneous);
			simultaneous.getStepOut().getIncomingConnections().remove(simultaneous);
			simultaneous.setStepOut(null);
			simultaneous.setTransitionIn(null);
		}
		simultaneous.setConnectionType(null);
	    simultaneous.setPolylineConnection(null);
	    simultaneous.setSfc(null);
	}
	
	public void setConnectionInput(SfcObject sfcObject) {
		if(sfcObject instanceof Step) {
			this.stepIn = (Step) sfcObject;
			this.connectionType = ConnectionType.FROM_STEP_TO_TRANSITION;
		} else if(sfcObject instanceof Transition) {
			this.transitionIn = (Transition) sfcObject;
			this.connectionType = ConnectionType.FROM_TRANSITION_TO_STEP;
		}
	}
	
	public void setConnectionOutput(SfcObject sfcObject) {
		if(sfcObject instanceof Step) {
			this.stepOut = (Step) sfcObject;
		} else if(sfcObject instanceof Transition) {
			this.transitionOut = (Transition) sfcObject;
		}
	}
	
	public void setSimultaneous(Simultaneous simultaneous) {
	    this.simultaneous = simultaneous;
	}
	
	public void setSequentialFunctionChart(SequentialFunctionChart sfc) {
	    this.sfc = sfc;
	}
}
