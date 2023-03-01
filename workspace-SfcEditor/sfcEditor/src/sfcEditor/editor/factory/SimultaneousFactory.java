package sfcEditor.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sfcmodel.model.SFCFactory;
import sfcmodel.model.Simultaneous;

public class SimultaneousFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return SFCFactory.eINSTANCE.createSimultaneous();
	}

	@Override
	public Object getObjectType() {
		return Simultaneous.class;
	}
}