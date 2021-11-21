package sfcEditor.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sfcmodel.model.*;

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