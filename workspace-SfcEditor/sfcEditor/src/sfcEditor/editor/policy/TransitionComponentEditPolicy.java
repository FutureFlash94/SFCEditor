package sfcEditor.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import sfcEditor.editor.command.TransitionDeleteCommand;
import sfcmodel.model.Transition;

public class TransitionComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		TransitionDeleteCommand transitionDeleteCommand = new TransitionDeleteCommand();
		transitionDeleteCommand.setTransition((Transition) getHost().getModel());
		return transitionDeleteCommand;
	}
}
