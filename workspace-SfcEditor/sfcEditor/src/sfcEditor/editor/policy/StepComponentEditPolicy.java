package sfcEditor.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import sfcEditor.editor.command.StepDeleteCommand;
import sfcmodel.model.*;

public class StepComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		StepDeleteCommand stepDeleteCommand = new StepDeleteCommand();
		stepDeleteCommand.setStep((Step) getHost().getModel());
		return stepDeleteCommand;
	}
}
