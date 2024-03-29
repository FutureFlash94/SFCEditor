package sfcEditor.editor.policy;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import sfcEditor.action.ShowNameAction;
import sfcEditor.action.ShowNameQualifierAction;
import sfcEditor.action.ShowNameQualifierIndicatorAction;
import sfcEditor.action.ShowNameQualifierIndicatorInstructionsAction;
import sfcEditor.editor.command.ActionChangeConstraintCommand;
import sfcEditor.editor.command.ActionDeleteCommand;
import sfcEditor.editor.part.ActionEditPart;
import sfcmodel.model.Action;
import sfcmodel.model.ActionType;

public class ActionComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		ActionDeleteCommand actionDeleteCommand = new ActionDeleteCommand();
		actionDeleteCommand.setAction((Action) getHost().getModel());
		return actionDeleteCommand;
	}

    private ActionChangeConstraintCommand createShowNameCommand() {
        ActionEditPart host = (ActionEditPart) getHost();
        Action action = (Action) host.getModel();
        
        ActionChangeConstraintCommand command = new ActionChangeConstraintCommand();
        action.setActionType(ActionType.NAME);
        command.setModel(action);
        return command;
    }
    
    private ActionChangeConstraintCommand createShowNameQualifierActionCommand() {
        ActionEditPart host = (ActionEditPart) getHost();
        Action action = (Action) host.getModel();
        
        ActionChangeConstraintCommand command = new ActionChangeConstraintCommand();
        action.setActionType(ActionType.NAME_QUALIFIER);
        command.setModel(action);
        return command;
    }
    
    private ActionChangeConstraintCommand createShowNameQualifierIndicatorActionCommand() {
        ActionEditPart host = (ActionEditPart) getHost();
        Action action = (Action) host.getModel();
        
        ActionChangeConstraintCommand command = new ActionChangeConstraintCommand();
        action.setActionType(ActionType.NAME_QUALIFIER_INDICATOR);
        command.setModel(action);
        return command;
    }
    
    private ActionChangeConstraintCommand createShowNameQualifierIndicatorInstructionsActionCommand() {
        ActionEditPart host = (ActionEditPart) getHost();
        Action action = (Action) host.getModel();
        
        ActionChangeConstraintCommand command = new ActionChangeConstraintCommand();
        action.setActionType(ActionType.NAME_QUALIFIER_INDICATOR_INSTRUCTIONS);
        command.setModel(action);
        return command;
    }
 
    @Override
    public Command getCommand(Request request) {
    	Object requestType = request.getType();
    	
        if(requestType.equals(ShowNameAction.REQ_SHOW_NAME)) {
            return createShowNameCommand();
        }
        if(requestType.equals(ShowNameQualifierAction.REQ_SHOW_NAME_QUALIFIER)) {
            return createShowNameQualifierActionCommand();
        }
        if(requestType.equals(ShowNameQualifierIndicatorAction.REQ_SHOW_NAME_QUALIFIER_INDICATOR)) {
            return createShowNameQualifierIndicatorActionCommand();
        }
        if(requestType.equals(ShowNameQualifierIndicatorInstructionsAction.REQ_SHOW_NAME_QUALIFIER_INDICATOR_INSTRUCTIONS)) {
            return createShowNameQualifierIndicatorInstructionsActionCommand();
        }
        return super.getCommand(request);
    }
}
