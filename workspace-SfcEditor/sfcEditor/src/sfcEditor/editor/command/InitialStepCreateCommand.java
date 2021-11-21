package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.gef.commands.Command;
 
import sfcmodel.model.*;
import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;
import sfcEditor.editor.policy.SequentialFunctionChartXYLayoutPolicy;

public class InitialStepCreateCommand extends Command implements ConstantParameters {
	private static final Dimension defaultDimension = 
			new Dimension(STEP_WIDTH, STEP_HEIGHT+2*STEP_CONN_LENGTH);
	private static final String defaultName = "S1";
	private InitialStep initialStep;
  	private Rectangle constraintsRectangle;
	private Point startPoint;
	private Point endPoint;
  	private SequentialFunctionChart sfc;
	
  	@Override
  	public void execute() {
  		this.initialStep.setName(defaultName);
  		if(this.constraintsRectangle != null) {
  			this.initialStep.setConstraintsRectangle(this.constraintsRectangle);
  		}
  		this.initialStep.setStartPoint(this.startPoint);
  		this.initialStep.setEndPoint(this.endPoint);
  		this.initialStep.setX(Boolean.TRUE);
  		this.initialStep.setT(0.0);
  		this.initialStep.setSfc(this.sfc);
	    BendpointFunctions.refreshConnectionBendpoints(this.initialStep);
	    SequentialFunctionChartXYLayoutPolicy.setInitStepExist(true);
  	}
 
  	@Override
  	public void undo() {
  		this.initialStep.setSfc(null);
	    BendpointFunctions.refreshConnectionBendpoints(this.initialStep);
  	}

  	public void setInitialStep(InitialStep InitialStep) {
  		this.initialStep = InitialStep;
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
