package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import sfcmodel.model.Connection;

/**
 * Command used to delete a bendpoint from a {@link OPMLink}
 * This class is declared final since it has a very specific functionality.
 */
public final class ConnectionDeleteBendpointCommand extends Command {

	/** Connection that contains the bendpoint. */
	private Connection connection;
	/** Index where the bendpoint is located in the link's bendpoin list. */
	private int index;
	/** Point in the diagram where the bendpoint is located. */
	private Point location;
	   
	/**
	 * Only execute is link is not null and index is valid.
	 */
	@Override
	public boolean canExecute() {
		return (connection != null) && (connection.getBendpoints().size() > index);
	}
  
	/** 
	 * Remove the bendpoint from the connection. 
	 */
	@Override
	public void execute() {
		location = connection.getBendpoints().get(index);
	    connection.getBendpoints().remove(index);
	}
	 
	/**
	 * Reinsert the bendpoint in the link.
	 */
	@Override
	public void undo() {
		connection.getBendpoints().add(index, location);
	}
	   
	/**
	 * Set the index of the bendpoint that should be removed.
	 * @param index the index of the bendpoint to remove.
	 */
	public void setIndex(final int index) {
		this.index = index;
	}
	   
	/**
	 * Set the link from which the bendpoint is removed.
	 * @param link the link from which the bendpoint is removed.
	 */
	public void setConnection(final Connection connection) {
	    this.connection = connection;
	} 
}
