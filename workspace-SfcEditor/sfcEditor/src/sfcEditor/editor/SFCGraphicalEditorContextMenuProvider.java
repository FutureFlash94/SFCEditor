package sfcEditor.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;

import sfcEditor.action.ShowNameAction;
import sfcEditor.action.ShowNameQualifierAction;
import sfcEditor.action.ShowNameQualifierIndicatorAction;
import sfcEditor.action.ShowNameQualifierIndicatorInstructionsAction;
import sfcEditor.action.ToggleUserPriorityAction;

public class SFCGraphicalEditorContextMenuProvider extends ContextMenuProvider {

	private ActionRegistry actionRegistry;
	
	public SFCGraphicalEditorContextMenuProvider(EditPartViewer viewer, final ActionRegistry actionRegistry) {
		super(viewer);
		setActionRegistry(actionRegistry);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
		
        IAction action;
 
        action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
        menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
        action = getActionRegistry().getAction(ActionFactory.REDO.getId());
        menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
        
        action = getActionRegistry().getAction(ShowNameAction.SHOW_NAME);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
        action = getActionRegistry().getAction(ShowNameQualifierAction.SHOW_NAME_QUALIFIER);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
        action = getActionRegistry().getAction(ShowNameQualifierIndicatorAction.SHOW_NAME_QUALIFIER_INDICATOR);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
        action = getActionRegistry().getAction(ShowNameQualifierIndicatorInstructionsAction.SHOW_NAME_QUALIFIER_INDICATOR_INSTRUCTIONS);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

        action = getActionRegistry().getAction(ToggleUserPriorityAction.TOGGLE_USER_PRIORITY);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
	}
	
	private ActionRegistry getActionRegistry() {
        return actionRegistry;
    }
 
    private void setActionRegistry(final ActionRegistry actionRegistry) {
        this.actionRegistry = actionRegistry;
    }
}
