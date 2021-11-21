package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.gef.commands.Command;
 
import sfcmodel.model.*;
import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;

public class StepCreateCommand extends Command implements ConstantParameters {
	private static final Dimension defaultDimension = 
			new Dimension(STEP_WIDTH, STEP_HEIGHT+2*STEP_CONN_LENGTH);
	private static final String defaultName = "S1";
	private Step step;
  	private Rectangle constraintsRectangle;
	private Point startPoint;
	private Point endPoint;
  	private SequentialFunctionChart sfc;
	
  	@Override
  	public void execute() {
  		this.step.setName(defaultName);
  		if(this.constraintsRectangle != null) {
  			this.step.setConstraintsRectangle(this.constraintsRectangle);
  		}
  		this.step.setStartPoint(this.startPoint);
  		this.step.setEndPoint(this.endPoint);
  		this.step.setX(Boolean.FALSE);
  		this.step.setT(0.0);
  		this.step.setSfc(this.sfc);
	    BendpointFunctions.refreshConnectionBendpoints(this.step);
  	}
 
  	@Override
  	public void undo() {
  		this.step.setSfc(null);
	    BendpointFunctions.refreshConnectionBendpoints(this.step);
  	}

  	public void setStep(Step step) {
  		this.step = step;
  	}
  	
  	public void setLocation(Point location) {
  		this.constraintsRectangle = new Rectangle(location, defaultDimension);
  		this.startPoint = new Point(constraintsRectangle.x+constraintsRectangle.width/2, constraintsRectangle.y);
  		this.endPoint = new Point(constraintsRectangle.x+constraintsRectangle.width/2, constraintsRectangle.y+constraintsRectangle.height);
  	}
  	
  	public void setParent(SequentialFunctionChart sfc) {
  		this.sfc = sfc;
  	}
 
}
