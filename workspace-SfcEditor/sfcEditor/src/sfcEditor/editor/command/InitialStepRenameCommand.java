package sfcEditor.editor.command;

import org.eclipse.gef.commands.Command;

import sfcmodel.model.*;

public class InitialStepRenameCommand extends Command {
	private String oldName, newName;
	private InitialStep model;

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
	
  	public void setModel(InitialStep model) {
	    this.model = model;
	}
}
