package sfcEditor.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import sfcmodel.model.*;
import sfcEditor.editor.command.*;
import sfcEditor.editor.figure.StepFigure;

public class StepDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
	    StepRenameCommand command = new StepRenameCommand();
	    command.setModel((Step) getHost().getModel());
	    command.setNewName((String) request.getCellEditor().getValue());
	    return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
	    String value = (String) request.getCellEditor().getValue();
	    ((StepFigure)getHostFigure()).getNameLabel().setText(value);  
	}

}
