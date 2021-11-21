package sfcEditor.editor.policy;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import sfcEditor.editor.command.ConnectionCreateBendpointCommand;
import sfcEditor.editor.command.ConnectionDeleteBendpointCommand;
import sfcEditor.editor.command.ConnectionMoveBendpointCommand;
import sfcmodel.model.Connection;

public class ConnectionBendpointEditPolicy extends BendpointEditPolicy {

	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected Command getCreateBendpointCommand(final BendpointRequest request) {
	    ConnectionCreateBendpointCommand command = new ConnectionCreateBendpointCommand();
	    Point p = request.getLocation();

	    command.setConnection((Connection) request.getSource().getModel());
	    command.setLocation(p);
	    command.setIndex(request.getIndex());
	    
	    return command;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getMoveBendpointCommand(final BendpointRequest request) {
		ConnectionMoveBendpointCommand command = new ConnectionMoveBendpointCommand();
		Point p = request.getLocation();
		
	    command.setConnection((Connection)request.getSource().getModel());
	    command.setLocation(p);
	    command.setIndex(request.getIndex());
	    
	    return command;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getDeleteBendpointCommand(final BendpointRequest request) {
		ConnectionDeleteBendpointCommand command = new ConnectionDeleteBendpointCommand();
		
	    command.setConnection((Connection)request.getSource().getModel());
	    command.setIndex(request.getIndex());
	    return command;
	}
}
