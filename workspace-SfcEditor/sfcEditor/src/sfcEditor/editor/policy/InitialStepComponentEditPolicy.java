package sfcEditor.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import sfcEditor.editor.command.InitialStepDeleteCommand;
import sfcmodel.model.InitialStep;

public class InitialStepComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		InitialStepDeleteCommand initialStepDeleteCommand = new InitialStepDeleteCommand();
		initialStepDeleteCommand.setInitialStep((InitialStep) getHost().getModel());
		return initialStepDeleteCommand;
	}
}
