package sfcEditor.action;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import sfcEditor.editor.part.ActionEditPart;

public class ShowNameAction extends SelectionAction {

	public static final String SHOW_NAME = "Show Name";
    public static final String REQ_SHOW_NAME = "Show Name";
 
    Request request;

	public ShowNameAction(IWorkbenchPart part) {
		super(part);
		setId(SHOW_NAME);
        setText("Show Name");
        request = new Request(REQ_SHOW_NAME);
	}
	
    @Override
    public void run() {
        @SuppressWarnings("unchecked") List<ActionEditPart> editParts = getSelectedObjects();
        CompoundCommand compoundCommand = new CompoundCommand();
        for(ActionEditPart actionEditPart : editParts) {
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
            if(!(selectedObject instanceof ActionEditPart)) {
                return false;
            }
        }
        return true;
    }
}
