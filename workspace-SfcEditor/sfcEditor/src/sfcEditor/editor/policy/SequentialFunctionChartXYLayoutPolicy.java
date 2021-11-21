package sfcEditor.editor.policy;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import sfcmodel.model.*;
import sfcEditor.editor.command.*;
import sfcEditor.ConstantParameters;

public class SequentialFunctionChartXYLayoutPolicy extends XYLayoutEditPolicy {

	// initStepExist is true if there is an init step
	private static boolean initStepExist = false;
	
	/**
	 * Command created the user requests to change the constraint (size, location) of an object that is
	 * part of a SFC.
	 */
	@Override 
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		if(child.getModel() instanceof InitialStep)  {
			InitialStepChangeConstraintCommand command = new InitialStepChangeConstraintCommand();
			command.setModel((InitialStep) child.getModel());
		    // prevent to change size
		    if(ConstantParameters.STEP_RESIZE_ENABLED == Boolean.FALSE) {
		    	((Rectangle) constraint).height = ConstantParameters.STEP_HEIGHT;
		    	((Rectangle) constraint).width = ConstantParameters.STEP_WIDTH;
		    }
		    command.setNewConstraint((Rectangle) constraint);
		    return command;
	    } else if(child.getModel() instanceof Step)  {
			StepChangeConstraintCommand command = new StepChangeConstraintCommand();
			command.setModel((Step) child.getModel());
		    // prevent to change size
		    if(ConstantParameters.STEP_RESIZE_ENABLED == Boolean.FALSE) {
		    	((Rectangle) constraint).height = ConstantParameters.STEP_HEIGHT;
		    	((Rectangle) constraint).width = ConstantParameters.STEP_WIDTH;
		    }
		    command.setNewConstraint((Rectangle) constraint);
		    return command;
	    } else if(child.getModel() instanceof Transition)  {
	    	TransitionChangeConstraintCommand command = new TransitionChangeConstraintCommand();
			command.setModel((Transition) child.getModel());
		    // prevent to change size
		    if(ConstantParameters.TRANSITiON_RESIZE_ENABLED == Boolean.FALSE) {
		    	((Rectangle) constraint).height = ConstantParameters.TRANSITION_HEIGHT;
		    	((Rectangle) constraint).width = ConstantParameters.TRANSITION_WIDTH;
		    }
		    command.setNewConstraint((Rectangle) constraint);
		    return command;
	    } else if(child.getModel() instanceof Action)  {
	    	ActionChangeConstraintCommand command = new ActionChangeConstraintCommand();
			command.setModel((Action) child.getModel());
		    command.setNewConstraint((Rectangle) constraint);
		    return command;
	    }
		return null;
	}
	
	/**
	 * Command created to add new things to the SFC.
	 */
	@Override 
	protected Command getCreateCommand(CreateRequest request) {
		Command retVal = null;
		if(request.getNewObject() instanceof InitialStep) {
			InitialStepCreateCommand command = new InitialStepCreateCommand();
			if(SequentialFunctionChartXYLayoutPolicy.initStepExist == false) {
				command.setLocation(request.getLocation());
				command.setParent((SequentialFunctionChart)(getHost().getModel()));
				command.setInitialStep((InitialStep)(request.getNewObject()));
				retVal = command;
			}
    	} else if(request.getNewObject() instanceof Step) {
			StepCreateCommand command = new StepCreateCommand();
			command.setLocation(request.getLocation());
			command.setParent((SequentialFunctionChart)(getHost().getModel()));
			command.setStep((Step)(request.getNewObject()));
			retVal = command;
    	} else if(request.getNewObject() instanceof Transition) {
			TransitionCreateCommand command = new TransitionCreateCommand();
			command.setLocation(request.getLocation());
			command.setParent((SequentialFunctionChart)(getHost().getModel()));
			command.setTransition((Transition)(request.getNewObject()));
			retVal = command;
    	} else if(request.getNewObject() instanceof Action)  {
	    	ActionCreateCommand command = new ActionCreateCommand();
			command.setParent((SequentialFunctionChart)(getHost().getModel()));
			command.setAction((Action)(request.getNewObject()));
			command.setLocation(request.getLocation());
			retVal = command;
	    }
	    return retVal;
	}
	
	public static boolean getInitStepExist() {
		return SequentialFunctionChartXYLayoutPolicy.initStepExist;
	}
	
	public static void setInitStepExist(boolean initStepExist) {
		SequentialFunctionChartXYLayoutPolicy.initStepExist = initStepExist;
	}
}
