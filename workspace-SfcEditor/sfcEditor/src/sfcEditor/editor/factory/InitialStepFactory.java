package sfcEditor.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sfcmodel.model.*;

public class InitialStepFactory implements CreationFactory {
	
	@Override public Object getNewObject() {
		return SFCFactory.eINSTANCE.createInitialStep();
	}
	
	@Override public Object getObjectType() {
		return InitialStep.class;
	}
}
