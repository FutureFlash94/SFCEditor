package sfcEditor.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sfcmodel.model.*;

public class SelectionFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return SFCFactory.eINSTANCE.createSelection();
	}

	@Override
	public Object getObjectType() {
		return Selection.class;
	}
}