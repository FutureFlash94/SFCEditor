package sfcEditor.editor.part;

import sfcmodel.model.*;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class SFCEditPartFactory implements EditPartFactory {
	
	@Override 
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
	    
		if(model instanceof SequentialFunctionChart) {
			part = new SequentialFunctionChartEditPart();
	    } else if(model instanceof InitialStep) {
	    	part = new InitialStepEditPart();
	    } else if(model instanceof Action) {
	    	part = new ActionEditPart();
	    } else if(model instanceof Step) {
	    	part = new StepEditPart();
	    } else if(model instanceof Transition) {
	    	part = new TransitionEditPart();
	    } else if(model instanceof Selection) {
    		part = new SelectionEditPart();
        } else if(model instanceof Simultaneous) {
    		part = new SimultaneousEditPart();
        }
	    
	    if(part != null) {
	      part.setModel(model);
	    }
	    
	    return part;
	}
}
