package sfcEditor.editor.command;

import org.eclipse.gef.commands.Command;

import sfcmodel.model.*;
 

public class SelectionDeleteCommand extends Command {
	
	/** selection to be deleted. */
    private Selection selection;
    
    /** SFC that owns the selection. */
    private SequentialFunctionChart sfc;
    
    /** source of the selection. */
    private SfcObject source;
    
    /** target of the selection. */
    private SfcObject target;
    
    /**
     * {@inheritDoc}
     */
    @Override public boolean canExecute() {
        return selection != null;
    }
    
    /**
     * Disconnect link from source and target things and remove
     * from owner OPD.
     */
    @Override public void execute() {
        sfc = selection.getSfc();
        
        // Source is a step or a transition
        if(selection.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
            source = selection.getStepIn();
            target = selection.getTransitionOut();
            selection.setStepIn(null);
            selection.setTransitionOut(null);
        }
        else if(selection.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
        	source = selection.getTransitionIn();
            target = selection.getStepOut();
            selection.setStepOut(null);
            selection.setTransitionIn(null);
        } else {
        	source = selection.getStepIn();
        	target = selection.getAction();
        	selection.setStepIn(null);
        	selection.setAction(null);
        }
        selection.getPolylineConnection().removeAll();
        selection.setSfc(null);
    }
    
    /**
     * Reconnect the selection to the source and target and add
     * it to the owner OPD.
     */
    @Override 
    public void undo() {
    	if(selection.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
    		selection.setStepIn((Step)source);
        	selection.setTransitionOut((Transition)target);
    	}
    	else if(selection.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
        	selection.setTransitionIn((Transition)source);
    		selection.setStepOut((Step)target);
    	} else {
    		selection.setStepIn((Step)source);
    		selection.setAction((Action)target);
    	}
    	selection.setSfc(sfc);
    }
    
    /**
     * Set the selection that will be delete from the diagram.
     * @param selection the selection to delete from the diagram.
     */
    public void setSelection(final Selection selection) {
    	this.selection = selection;
    }
}
