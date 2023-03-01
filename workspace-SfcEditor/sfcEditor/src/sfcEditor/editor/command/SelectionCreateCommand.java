package sfcEditor.editor.command;

import org.eclipse.gef.commands.Command;

import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;
import sfcmodel.model.Action;
import sfcmodel.model.ConnectionType;
import sfcmodel.model.Selection;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.SfcObject;
import sfcmodel.model.Step;
import sfcmodel.model.Transition;

public class SelectionCreateCommand extends Command implements ConstantParameters {
	private Step stepIn;
	private Step stepOut;
	private Transition transitionIn;
	private Transition transitionOut;
	private Action action;
	private Selection selection;
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
	
	private boolean isFromStepToAction() {
		if(stepIn != null && action != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public boolean canExecute() {
	    return selection != null && (isFromStepToTransition() || isFromTransitionToStep() || isFromStepToAction());
	}
	
	@Override
	public void execute() {
	    selection.setPolylineConnection(selection.getPolylineConnection());
	    
	    if( this.connectionType == ConnectionType.FROM_STEP_TO_TRANSITION ) {
	    	selection.setConnectionType(ConnectionType.FROM_STEP_TO_TRANSITION);
	    	selection.setStepIn(stepIn);
	    	selection.setTransitionOut(transitionOut);
	    	
			BendpointFunctions.refreshConnectionBendpoints(this.stepIn);
			BendpointFunctions.refreshConnectionBendpoints(this.transitionOut);
	    }
	    else if( this.connectionType == ConnectionType.FROM_TRANSITION_TO_STEP ) {
	    	selection.setConnectionType(ConnectionType.FROM_TRANSITION_TO_STEP);
	    	selection.setTransitionIn(transitionIn);
	    	selection.setStepOut(stepOut);
	    	
	    	BendpointFunctions.refreshConnectionBendpoints(this.transitionIn);
			BendpointFunctions.refreshConnectionBendpoints(this.stepOut);
	    }
	    else if( this.connectionType == ConnectionType.FROM_STEP_TO_ACTION ) {
	    	selection.setConnectionType(ConnectionType.FROM_STEP_TO_ACTION);
	    	selection.setStepIn(stepIn);
	    	selection.setAction(action);
	    	
			BendpointFunctions.refreshConnectionBendpoints(this.stepIn);
			BendpointFunctions.refreshAction(this.action);
	    }
	    selection.setUserPriorityEnabled(Boolean.FALSE);
	    selection.setSfc(sfc);
	}
	
	@Override 
	public void undo() {
		if(selection.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
			selection.getStepIn().getOutgoingConnections().remove(selection);
			selection.getTransitionOut().getIncomingConnections().remove(selection);
			selection.setStepIn(null);
			selection.setTransitionOut(null);
		}
		else if(selection.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
			selection.getTransitionIn().getOutgoingConnections().remove(selection);
			selection.getStepOut().getIncomingConnections().remove(selection);
			selection.setStepOut(null);
			selection.setTransitionIn(null);
		}
		else if(selection.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) {
			selection.getStepIn().getOutgoingConnections().remove(selection);
			selection.getAction().getIncomingConnections().remove(selection);
			selection.setStepIn(null);
			selection.setAction(null);
		}
		selection.setConnectionType(null);
	    selection.setPolylineConnection(null);
	    selection.setUserPriorityEnabled(null);
	    selection.setSfc(null);
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
		} else if(sfcObject instanceof Action) {
			this.connectionType = ConnectionType.FROM_STEP_TO_ACTION;
			this.action = (Action) sfcObject;
		}
	}
	
	public void setSelection(Selection selection) {
	    this.selection = selection;
	}
	
	public void setSequentialFunctionChart(SequentialFunctionChart sfc) {
	    this.sfc = sfc;
	}
}
