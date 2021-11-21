package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import sfcmodel.model.Connection;

/**
 * Move a link bendpoint.
 * This class is declared final since it has a very specific functionality.
 */
public final class ConnectionMoveBendpointCommand extends Command {
	/** Old location of the moved bendpoint. */
	private Point oldLocation;
  	/** New location of the moved bendpoint. */
	private Point newLocation;
	/** Index of the bendpoint in the connection's bendpoint list. */
	private int index;
	/** Connection that contains the bendpoint. */
	private Connection connection;
	
	/** Move the bendpoint to the new location. */
	@Override
	public void execute() {
	    if(oldLocation == null) {
	    	oldLocation = connection.getBendpoints().get(index);
	    }
	    connection.getBendpoints().set(index, newLocation);
	}

	/** Restore the old location of the bendpoint. */
	@Override
	public void undo() {
		connection.getBendpoints().set(index, oldLocation);
	}
	
	/** 
	 * Set the index where the bendpoint is located in the bendpoint list.
	 * @param index the index where the bendpoint is located. 
	 */
	public void setIndex(final int index) {
	    this.index = index;
	}
	
	/**
	 * Set the link where the bendpoint is located. 
	 * @param link the link where the bendpoint is located. 
	 */
	public void setConnection(final Connection connection) {
		this.connection = connection;
	}	
	   
	/**
	 * Set the new location of the bendpoint. 
	 * @param newLocation the new location of the bendpoint. 
	 */
	public void setLocation(final Point newLocation) {
		this.newLocation = newLocation;
	}
}
