package sfcEditor.editor.command;

import org.eclipse.gef.commands.Command;

import sfcmodel.model.*;

public class StepRenameCommand extends Command {
	private String oldName, newName;
	private Step model;

	@Override 
	public void execute() {
	    oldName = model.getName();
	    model.setName(newName);
  	}
	
	@Override 
	public void undo() {
	    model.setName(oldName);
	}
	
  	public void setNewName(String newName) {
	    this.newName = newName;
  	}
	
  	public void setModel(Step model) {
	    this.model = model;
	}
}
