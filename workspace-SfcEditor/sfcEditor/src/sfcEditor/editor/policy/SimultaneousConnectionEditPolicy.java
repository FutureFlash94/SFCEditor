package sfcEditor.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import sfcEditor.editor.command.SimultaneousDeleteCommand;
import sfcmodel.model.Simultaneous;

public class SimultaneousConnectionEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		SimultaneousDeleteCommand command = new SimultaneousDeleteCommand();
	    command.setSimultaneous((Simultaneous) getHost().getModel());
	    return command;
	}
}
