package sfcEditor.editor.figure;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Insets;

import sfcEditor.SimultaneousPolylineConnectionLocator;

public class SimultaneousPolylineConnection extends PolylineConnection {

	private static int LINE_HEIGHT = 5;
	private static int LINE_BORDER_HEIGHT = 1;
	private Figure figure;
	
	public SimultaneousPolylineConnection() {
		this.setConnectionRouter(new BendpointConnectionRouter());
	}
	
	public void addSimulatnousLine(int x1, int x2, int y) {
		int x = Math.min(x1, x2);
		int width = Math.abs(x1 - x2) + 1;
		IFigure simultaneousLine = getSimulaneousLine(width);
		this.add(simultaneousLine, new SimultaneousPolylineConnectionLocator(this, x, y - (LINE_HEIGHT / 2), width));
	}
	
	private IFigure getSimulaneousLine(int width) {
		if (this.figure == null) {
			this.figure = new Figure();
			this.figure.setBackgroundColor(ColorConstants.white);
			this.figure.setBorder(new MyAbstractBorder());
			this.figure.setOpaque(true);
			this.figure.setSize(width, LINE_HEIGHT);
		}
		return this.figure;
	}

	public IFigure getSimulaneousLine() {
		return this.figure;
	}
	
	private class MyAbstractBorder extends LineBorder {

		public MyAbstractBorder() {
			super(ColorConstants.black, LINE_BORDER_HEIGHT);
		}
		
		@Override
		public Insets getInsets(IFigure figure) {
			return new Insets(getWidth(), 0, getWidth(), 0);
		}
		
		@Override
		public void paint(IFigure figure, Graphics graphics, Insets insets) {
			tempRect.setBounds(getPaintRectangle(figure, insets));
			if (getWidth() % 2 == 1) {
				tempRect.height--;
			}
			tempRect.shrink(getWidth() / 2, 0);
			
			graphics.setLineWidth(getWidth());
			if (getColor() != null)
				graphics.setForegroundColor(getColor());
			
			graphics.popState();
			graphics.drawLine(tempRect.getTopLeft(), tempRect.getTopRight());
			graphics.drawLine(tempRect.getBottomLeft(), tempRect.getBottomRight());
			graphics.pushState();
		}
	}
}
