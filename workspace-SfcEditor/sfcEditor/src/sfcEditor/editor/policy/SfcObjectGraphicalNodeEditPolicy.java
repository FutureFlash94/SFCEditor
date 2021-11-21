package sfcEditor.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
 
import sfcEditor.editor.command.SelectionCreateCommand;
import sfcEditor.editor.command.SimultaneousCreateCommand;
import sfcmodel.model.*;

public class SfcObjectGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
	
	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
        if(request.getNewObject() instanceof Selection) {
        	SelectionCreateCommand result = new SelectionCreateCommand();
			result.setConnectionInput((SfcObject)getHost().getModel());
			result.setSelection((Selection) request.getNewObject());
			result.setSequentialFunctionChart(((SfcObject)getHost().getModel()).getSfc());
			request.setStartCommand(result);
			return result;
        } else {
        	SimultaneousCreateCommand result = new SimultaneousCreateCommand();
			result.setConnectionInput((SfcObject)getHost().getModel());
			result.setSimultaneous((Simultaneous) request.getNewObject());
			result.setSequentialFunctionChart(((SfcObject)getHost().getModel()).getSfc());
			request.setStartCommand(result);
			return result;
        } 
	}
	
	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		if(request.getNewObject() instanceof Selection) {
			SelectionCreateCommand result = (SelectionCreateCommand) request.getStartCommand();
			result.setConnectionOutput((SfcObject) getHost().getModel());
		    return result;
		}
		else {
			SimultaneousCreateCommand result = (SimultaneousCreateCommand) request.getStartCommand();
			result.setConnectionOutput((SfcObject) getHost().getModel());
		    return result;
		}
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
