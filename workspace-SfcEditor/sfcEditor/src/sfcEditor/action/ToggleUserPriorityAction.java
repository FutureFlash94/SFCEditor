package sfcEditor.action;

import java.util.List;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import sfcEditor.editor.part.SelectionEditPart;

public class ToggleUserPriorityAction extends SelectionAction {

	public static final String TOGGLE_USER_PRIORITY = "Toggle user priority";
    public static final String REQ_TOGGLE_USER_PRIORITY = "Toggle user priority";
 
    Request request;

	public ToggleUserPriorityAction(IWorkbenchPart part) {
		super(part);
		setId(TOGGLE_USER_PRIORITY);
        setText("Toggle user priority of selection");
        request = new Request(REQ_TOGGLE_USER_PRIORITY);
	}
	
    @Override
    public void run() {
        @SuppressWarnings("unchecked") List<SelectionEditPart> editParts = getSelectedObjects();
        CompoundCommand compoundCommand = new CompoundCommand();
        for(SelectionEditPart actionEditPart : editParts) {
            compoundCommand.add(actionEditPart.getCommand(request));
        }
        execute(compoundCommand);
    }

    @Override
    protected boolean calculateEnabled() {
        if(getSelectedObjects().isEmpty()) {
            return false;
        }
        for(Object selectedObject : getSelectedObjects()) {
            if(!(selectedObject instanceof SelectionEditPart)) {
                return false;
            }
        }
        return true;
    }
}
