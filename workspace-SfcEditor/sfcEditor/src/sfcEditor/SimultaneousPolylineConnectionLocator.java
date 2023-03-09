package sfcEditor;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import sfcEditor.editor.figure.SimultaneousPolylineConnection;

/*
 * This class represents a Locator for PolylineConnections.
 * @author: Filip Wagner
 */
public class SimultaneousPolylineConnectionLocator implements Locator {
	
	private SimultaneousPolylineConnection connection;
	private int x;
	private int y;
	private int width;
	
	public SimultaneousPolylineConnectionLocator(SimultaneousPolylineConnection connection, int x, int y, int width) {
		this.connection = connection;
		this.x = x;
		this.y = y;
		this.width = width;
	}
	
	@Override
	public void relocate(IFigure target) {
		Rectangle targetBounds = connection.getSimulaneousLine().getBounds();
		Dimension targetSize = target.getPreferredSize();
		targetSize.width = this.width;
		
		targetBounds.x = x;
		targetBounds.y = y;
		targetBounds.setSize(targetSize);
		target.setBounds(targetBounds);
	}
}
