package sfcEditor.editor.command;

import org.eclipse.gef.commands.Command;

import sfcmodel.model.Selection;

public class SelectionChangeCommand extends Command {

	private Selection selection;
	private Boolean userPriorityEnabled;
	
	@Override
  	public void execute() {
		this.selection.setUserPriorityEnabled(this.userPriorityEnabled);
	}
	
	public void setSelection(Selection selection) {
		this.selection = selection;
	}
	
	public void setUserPriorityEnabled(Boolean userPriority) {
		this.userPriorityEnabled = userPriority;
	}
}
