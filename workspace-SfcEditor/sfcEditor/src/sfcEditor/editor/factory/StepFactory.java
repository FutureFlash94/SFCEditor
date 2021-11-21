package sfcEditor.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sfcmodel.model.*;

public class StepFactory implements CreationFactory {
	
	@Override public Object getNewObject() {
		return SFCFactory.eINSTANCE.createStep();
	}
	
	@Override public Object getObjectType() {
		return Step.class;
	}
}
