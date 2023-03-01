package sfcEditor.editor.command;

import org.eclipse.gef.commands.Command;

import sfcmodel.model.ConnectionType;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.SfcObject;
import sfcmodel.model.Simultaneous;
import sfcmodel.model.Step;
import sfcmodel.model.Transition;
 

public class SimultaneousDeleteCommand extends Command {
	
	/** simultaneous to be deleted. */
    private Simultaneous simultaneous;
    
    /** SFC that owns the simultaneous. */
    private SequentialFunctionChart sfc;
    
    /** source of the simultaneous. */
    private SfcObject source;
    
    /** target of the simultaneous. */
    private SfcObject target;
    
    /**
     * {@inheritDoc}
     */
    @Override public boolean canExecute() {
        return simultaneous != null;
    }
    
    /**
     * Disconnect link from source and target things and remove
     * from owner SFC.
     */
    @Override public void execute() {
        sfc = simultaneous.getSfc();
        
        // Source is a step or a transition
        if(simultaneous.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
            source = simultaneous.getStepIn();
            target = simultaneous.getTransitionOut();
            simultaneous.setStepIn(null);
            simultaneous.setTransitionOut(null);
        }
        else {
        	source = simultaneous.getTransitionIn();
            target = simultaneous.getStepOut();
            simultaneous.setStepOut(null);
            simultaneous.setTransitionIn(null);
        }
        simultaneous.getPolylineConnection().removeAll();
        simultaneous.setSfc(null);
    }
    
    /**
     * Reconnect the simultaneous to the source and target and add
     * it to the owner SFC.
     */
    @Override 
    public void undo() {
    	if(simultaneous.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
    		simultaneous.setStepIn((Step)source);
        	simultaneous.setTransitionOut((Transition)target);
    	}
    	else {
        	simultaneous.setTransitionIn((Transition)source);
    		simultaneous.setStepOut((Step)target);
    	}
    	simultaneous.setSfc(sfc);
    }
    
    /**
     * Set the simultaneous that will be delete from the diagram.
     * @param simultaneous the simultaneous to delete from the diagram.
     */
    public void setSimultaneous(final Simultaneous simultaneous) {
    	this.simultaneous = simultaneous;
    }
}
