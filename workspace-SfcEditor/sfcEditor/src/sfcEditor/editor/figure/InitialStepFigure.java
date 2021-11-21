package sfcEditor.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import sfcEditor.ConstantParameters;

public class InitialStepFigure extends Figure implements ConstantParameters {
	private Label nameLabel;
	private RectangleFigure rectangle;
	private Polyline lineSource;
	private Polyline lineTarget;
	private Polyline lineLeft;
	private Polyline lineRight;
	private Point startPoint;
	private Point endPoint;
	private ConnectionAnchor connectionAnchor;
	
	public InitialStepFigure() {
		setLayoutManager(new XYLayout());
	    rectangle = new RectangleFigure();
	    add(rectangle);
	    nameLabel = new Label();
	    add(nameLabel);
	    lineSource = new Polyline();
	    lineTarget = new Polyline();
	    lineLeft = new Polyline();
	    lineRight = new Polyline();
	    add(lineSource);
	    add(lineTarget);
	    add(lineLeft);
	    add(lineRight);
	    startPoint = new Point();
	    endPoint = new Point();
	}
 
	@Override
	protected void paintFigure(Graphics graphics) {
	    Rectangle r = getBounds().getCopy();
	    setConstraint(rectangle, new Rectangle(0, STEP_CONN_LENGTH, 
	    		r.width, r.height-2*STEP_CONN_LENGTH));
	    setConstraint(nameLabel, new Rectangle(0+r.width/5, STEP_CONN_LENGTH, r.width-2*r.width/5, r.height-2*STEP_CONN_LENGTH));
	    
	    // Add source line to a step
	    lineSource.removeAllPoints();
	    this.startPoint = new Point(r.x+r.width/2, r.y);
	    lineSource.setStart(this.startPoint);
	    lineSource.addPoint(new Point(r.x+r.width/2, r.y+STEP_CONN_LENGTH));
	    add(lineSource);
	    
	    // Add target line to a step
	    lineTarget.removeAllPoints();
	    this.endPoint = new Point(r.x+r.width/2, r.y+r.height);
	    lineTarget.addPoint(new Point(r.x+r.width/2, r.y+r.height-STEP_CONN_LENGTH));
	    lineTarget.setEnd(this.endPoint);
	    add(lineTarget);
	    
	    // Add line to left side in rectangle
	    lineLeft.removeAllPoints();
	    lineLeft.addPoint(new Point(r.x+r.width/5, r.y+STEP_CONN_LENGTH));
	    lineLeft.addPoint(new Point(r.x+r.width/5, r.y+r.height-STEP_CONN_LENGTH));
	    add(lineLeft);
	    
	    // Add line to right side in rectangle
	    lineRight.removeAllPoints();
	    lineRight.addPoint(new Point(r.x+r.width*4/5, r.y+STEP_CONN_LENGTH));
	    lineRight.addPoint(new Point(r.x+r.width*4/5, r.y+r.height-STEP_CONN_LENGTH));
	    add(lineRight);
	    
	    nameLabel.invalidate();
	    rectangle.invalidate();
	}
	
	public Label getNameLabel() {
		return nameLabel;
	}
  	
  	public Point getStartPoint() {
  		return this.startPoint;
  	}
  	
  	public Point getEndPoint() {
  		return this.endPoint;
  	}
  	
	public ConnectionAnchor getConnectionAnchor() {
	    if (connectionAnchor == null) {
	      connectionAnchor = new ChopboxAnchor(this);
	    }
	    return connectionAnchor;
	}
}
