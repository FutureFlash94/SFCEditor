package sfcEditor.editor.command;

import org.eclipse.gef.commands.Command;

import sfcEditor.ConstantParameters;
import sfcmodel.model.*;

public class TransitionRenameCommand extends Command implements ConstantParameters{
	private String oldName, newName;
	private String oldCondition, newCondition;
	private Transition model;

	@Override 
	public void execute() {
	    if(TRANSITION_DIRECT_EDIT == 0) {
	    	oldName = model.getName();
		    model.setName(newName);
	    }
	    else {
		    oldCondition = model.getCondition();
		    model.setCondition(newCondition);
	    }
  	}
	
	@Override 
	public void undo() {
		if(TRANSITION_DIRECT_EDIT == 0) {
			model.setName(oldName);
		}
		else {
		    model.setCondition(oldCondition);
		}
	}
	
  	public void setNewName(String newName) {
	    this.newName = newName;
  	}
	
  	public void setNewCondition(String newCondition) {
	    this.newCondition = newCondition;
  	}
  	
  	public void setModel(Transition model) {
	    this.model = model;
	}
}
