package sfcEditor.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sfcmodel.model.*;

public class ActionFactory implements CreationFactory {
	
	@Override public Object getNewObject() {
		return SFCFactory.eINSTANCE.createAction();
	}
	
	@Override public Object getObjectType() {
		return Action.class;
	}
}
