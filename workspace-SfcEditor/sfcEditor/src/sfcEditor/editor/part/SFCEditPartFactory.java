package sfcEditor.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import sfcmodel.model.Action;
import sfcmodel.model.InitialStep;
import sfcmodel.model.Selection;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.Simultaneous;
import sfcmodel.model.Step;
import sfcmodel.model.Transition;

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
