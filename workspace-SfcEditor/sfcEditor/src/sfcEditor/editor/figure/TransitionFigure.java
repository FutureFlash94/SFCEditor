package sfcEditor.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import sfcEditor.ConstantParameters;

public class TransitionFigure extends Figure implements ConstantParameters {
	private Label nameLabel;
	private Label conditionLabel;
	private RectangleFigure rectangle;
	private Polyline lineSource;
	private Polyline lineTarget;
	private Point startPoint;
	private Point endPoint;
	private ConnectionAnchor connectionAnchor;
   
	public TransitionFigure() {
		setLayoutManager(new XYLayout());
	    rectangle = new RectangleFigure();
	    rectangle.setBackgroundColor(ColorConstants.black);
	    add(rectangle);
	    nameLabel = new Label();
	    add(nameLabel);
	    conditionLabel = new Label();
	    add(conditionLabel);
	    lineSource = new Polyline();
	    lineTarget = new Polyline();
	    add(lineSource);
	    add(lineTarget);
	}
 
	@Override 
	protected void paintFigure(Graphics graphics) {
	    Rectangle r = getBounds().getCopy();
	    setConstraint(nameLabel, new Rectangle(0, r.height/2-TRANSITION_NAME_HEIGHT/2 , 
	    		TRANSITION_NAME_WIDTH, TRANSITION_NAME_HEIGHT));
	    setConstraint(rectangle, new Rectangle(TRANSITION_NAME_WIDTH, 
	    		TRANSITION_CONN_LENGTH, TRANSITION_WIDTH, TRANSITION_HEIGHT));
	    setConstraint(conditionLabel, new Rectangle((TRANSITION_NAME_WIDTH+TRANSITION_WIDTH), 
	    		r.height/2-TRANSITION_COND_HEIGHT/2, TRANSITION_COND_WIDTH, TRANSITION_COND_HEIGHT));
	    
	    // Add source line to a step
	    lineSource.removeAllPoints();
	    this.startPoint = new Point(r.x+TRANSITION_NAME_WIDTH+TRANSITION_WIDTH/2, r.y);
	    lineSource.setStart(this.startPoint);
	    lineSource.addPoint(new Point(r.x+TRANSITION_NAME_WIDTH+TRANSITION_WIDTH/2, r.y+TRANSITION_CONN_LENGTH));
	    add(lineSource);
	    
	    // Add target line to a step
	    lineTarget.removeAllPoints();
	    this.endPoint = new Point(r.x+TRANSITION_NAME_WIDTH+TRANSITION_WIDTH/2, r.y+r.height);
	    lineTarget.addPoint(new Point(r.x+TRANSITION_NAME_WIDTH+TRANSITION_WIDTH/2, r.y+r.height-TRANSITION_CONN_LENGTH));
	    lineTarget.setEnd(this.endPoint);
	    add(lineTarget);
	    
	    // Set text align for name and condition
	    nameLabel.setTextAlignment(PositionConstants.RIGHT);
	    conditionLabel.setTextAlignment(PositionConstants.LEFT);
	    
	    nameLabel.invalidate();
	    conditionLabel.invalidate();
	    rectangle.invalidate();
	}
	
	public Label getNameLabel() {
		return nameLabel;
	}
	
	public Label getConditionLabel() {
		return conditionLabel;
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
