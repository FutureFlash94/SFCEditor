package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.Transition;

public class TransitionCreateCommand extends Command implements ConstantParameters {
	private static final Dimension defaultDimension = 
			new Dimension(TRANSITION_NAME_WIDTH + TRANSITION_WIDTH + TRANSITION_COND_WIDTH, TRANSITION_HEIGHT+2*TRANSITION_CONN_LENGTH);
	private static final String defaultName = "T1";
	private static final String defaultCond = "TRUE";
	private Transition transition;
  	private Rectangle constraintsRectangle;
  	private Point startPoint;
  	private Point endPoint;
  	private SequentialFunctionChart sfc;
	
  	@Override 
  	public void execute() {
  		this.transition.setName(defaultName);
  		this.transition.setCondition(defaultCond);
  		if(constraintsRectangle != null) {
  			transition.setConstraintsRectangle(this.constraintsRectangle);
  		}
  		this.transition.setStartPoint(this.startPoint);
  		this.transition.setEndPoint(this.endPoint);
  		this.transition.setSfc(sfc);
	    BendpointFunctions.refreshConnectionBendpoints(this.transition);
  	}
 
  	@Override 
  	public void undo() {
  		this.transition.setSfc(null);
	    BendpointFunctions.refreshConnectionBendpoints(this.transition);
  	}
 
  	public void setLocation(Point location) {
  		this.constraintsRectangle = new Rectangle(location, defaultDimension);
  		this.startPoint = new Point(constraintsRectangle.x+constraintsRectangle.width/2, constraintsRectangle.y);
  		this.endPoint = new Point(constraintsRectangle.x+constraintsRectangle.width/2, constraintsRectangle.y+constraintsRectangle.height);
  	}
 
  	public void setParent(SequentialFunctionChart sfc) {
  		this.sfc = sfc;
  	}
 
  	public void setTransition(Transition transition) {
  		this.transition = transition;
  	}
}
