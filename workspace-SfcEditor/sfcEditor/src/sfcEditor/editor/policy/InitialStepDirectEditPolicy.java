package sfcEditor.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import sfcEditor.editor.command.StepRenameCommand;
import sfcEditor.editor.figure.InitialStepFigure;
import sfcmodel.model.InitialStep;

public class InitialStepDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
	    StepRenameCommand command = new StepRenameCommand();
	    command.setModel((InitialStep) getHost().getModel());
	    command.setNewName((String) request.getCellEditor().getValue());
	    return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
	    String value = (String) request.getCellEditor().getValue();
	    ((InitialStepFigure)getHostFigure()).getNameLabel().setText(value);  
	}

}
