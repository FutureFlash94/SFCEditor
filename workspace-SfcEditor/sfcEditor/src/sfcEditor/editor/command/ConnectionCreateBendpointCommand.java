package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import sfcmodel.model.Connection;

/**
 * Command used to create a new bendpoint in a {@linkplain Connection}.
 * This class is declared final since it has a very specific functionality.
 */
public final class ConnectionCreateBendpointCommand extends Command {
	/** Index on which the new bendpoint is added. */
    private int index;
    /** Location of new bendpoint. */
    private Point location;
    /** Connection to which the bendpoint is added. */
    private Connection connection;
    
    @Override 
    public void execute() {
    	connection.getBendpoints().add(index, location);
    }
 
    @Override
    public void undo() {
    	connection.getBendpoints().remove(index);
    }

    /**
     * Set the index on which the bendpoint is added.
     * @param index Index on which the bendpoint should be added.
     */
    public void setIndex(final int index) {
        this.index = index;
        //TODO:validation checks.
    }
 
    /**
     * Set the location where the new bendpoint is added.
     * @param location point in the diagram where the new bendpoint
     * is added.
     */
    public void setLocation(final Point location) {
        this.location = location;
    }
 
    /**
     * Set the connection on which the new bendpoint is added.
     * @param connection connection on which the bendpoint is added.
     */
    public void setConnection(final Connection connection) {
        this.connection = connection;
    }
}
