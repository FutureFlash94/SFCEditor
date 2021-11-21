package sfcEditor.editor.policy;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import sfcEditor.action.ToggleUserPriorityAction;
import sfcEditor.editor.command.SelectionChangeCommand;
import sfcEditor.editor.command.SelectionDeleteCommand;
import sfcEditor.editor.part.SelectionEditPart;
import sfcmodel.model.Selection;

public class SelectionConnectionEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		SelectionDeleteCommand command = new SelectionDeleteCommand();
	    command.setSelection((Selection) getHost().getModel());
	    return command;
	}
	
    private SelectionChangeCommand createToggleUserPriorityCommand() {
        SelectionEditPart host = (SelectionEditPart) getHost();
        Selection selection = (Selection) host.getModel();
        if(selection.getUserPriorityEnabled() == Boolean.TRUE) {
        	selection.setUserPriorityEnabled(Boolean.FALSE);
        }
        else {
        	selection.setUserPriorityEnabled(Boolean.TRUE);
        }
        
        SelectionChangeCommand command = new SelectionChangeCommand();
        command.setSelection(selection);
        command.setUserPriorityEnabled(selection.getUserPriorityEnabled());
        return command;
    }
    
    @Override
    public Command getCommand(Request request) {
        if(request.getType().equals(ToggleUserPriorityAction.REQ_TOGGLE_USER_PRIORITY)) {
            return createToggleUserPriorityCommand();
        }
        return super.getCommand(request);
    }
}
