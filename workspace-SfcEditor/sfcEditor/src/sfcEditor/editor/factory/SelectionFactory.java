package sfcEditor.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sfcmodel.model.SFCFactory;
import sfcmodel.model.Selection;

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