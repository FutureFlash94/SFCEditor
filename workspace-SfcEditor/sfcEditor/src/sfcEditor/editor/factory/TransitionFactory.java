package sfcEditor.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sfcmodel.model.*;

public class TransitionFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return SFCFactory.eINSTANCE.createTransition();
	}

	@Override
	public Object getObjectType() {
		return Transition.class;
	}

}
