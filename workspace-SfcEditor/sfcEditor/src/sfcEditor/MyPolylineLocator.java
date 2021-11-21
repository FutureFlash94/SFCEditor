package sfcEditor;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

/*
 * This class represents a Locator for PolylineConnections.
 * @author: Filip Humaj
 */
public class MyPolylineLocator implements Locator {
	
	private int absolutePointX;
	private int absolutePointY;
	private IFigure reference;
	
	/**
	 * Constructs 
	 */
	public MyPolylineLocator(IFigure reference, int absolutePointX, int absolutePointY) {
		setReferenceFigure(reference);
		this.absolutePointX = absolutePointX;
		this.absolutePointY = absolutePointY;
	}
	
	protected IFigure getReferenceFigure() {
		return reference;
	}
	public void setReferenceFigure(IFigure reference) {
		this.reference = reference;
	}
	
	protected Rectangle getReferenceBox() {
		return getReferenceFigure().getBounds();
	}
	
	@Override
	public void relocate(IFigure target) {
		IFigure reference = getReferenceFigure();
		Rectangle targetBounds = new PrecisionRectangle(
				getReferenceBox().getResized(-1, -1));
		
		reference.translateToAbsolute(targetBounds);
		target.translateToRelative(targetBounds);
		targetBounds.resize(1, 1);

		Dimension targetSize = target.getPreferredSize();

		targetBounds.x = absolutePointX;
		targetBounds.y = absolutePointY;
		targetBounds.setSize(targetSize);
		target.setBounds(targetBounds);
	}
}
