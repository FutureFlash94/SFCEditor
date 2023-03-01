package sfcEditor.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import sfcEditor.ConstantParameters;
import sfcEditor.editor.command.TransitionRenameCommand;
import sfcEditor.editor.figure.TransitionFigure;
import sfcmodel.model.Transition;

public class TransitionDirectEditPolicy extends DirectEditPolicy implements ConstantParameters{

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
	    TransitionRenameCommand command = new TransitionRenameCommand();
	    command.setModel((Transition) getHost().getModel());
	    if(TRANSITION_DIRECT_EDIT == 0) {
	    	command.setNewCondition((String) request.getCellEditor().getValue());
	    }
	    else {
	    	command.setNewCondition((String) request.getCellEditor().getValue());
	    }
	    return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
	    String value = (String) request.getCellEditor().getValue(); 
	    if(TRANSITION_DIRECT_EDIT == 0) {
	    	((TransitionFigure)getHostFigure()).getNameLabel().setText(value);  
	    }
	    else {
	    	((TransitionFigure)getHostFigure()).getConditionLabel().setText(value);  
	    }
	}

}
