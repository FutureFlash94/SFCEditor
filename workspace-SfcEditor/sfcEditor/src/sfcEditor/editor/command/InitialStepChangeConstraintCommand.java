package sfcEditor.editor.command;

import sfcmodel.model.InitialStep;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;

public class InitialStepChangeConstraintCommand extends Command implements ConstantParameters {
	private InitialStep initialStep;
	private Rectangle oldConstraintRectangle;
	private Rectangle newConstraintRectangle;
	private Point startPoint;
	private Point endPoint;
	
  	@Override
  	public void execute() {
  		if(this.oldConstraintRectangle == null) {
  			this.oldConstraintRectangle = this.initialStep.getConstraintsRectangle();
	    }
  		this.initialStep.setConstraintsRectangle(this.newConstraintRectangle);
	    this.initialStep.setStartPoint(this.startPoint);
	    this.initialStep.setEndPoint(this.endPoint);
	    BendpointFunctions.refreshConnectionBendpoints(this.initialStep);
  	}
	
  	@Override
  	public void undo() {
  		this.initialStep.setConstraintsRectangle(this.oldConstraintRectangle);
	    setStartAndEndPoint(this.oldConstraintRectangle);
	    BendpointFunctions.refreshConnectionBendpoints(this.initialStep);
  	}
	
  	@Override
  	public void redo() {
  		this.initialStep.setConstraintsRectangle(this.newConstraintRectangle);
	    setStartAndEndPoint(this.newConstraintRectangle);
	    BendpointFunctions.refreshConnectionBendpoints(this.initialStep);
  	}
  	
  	public void setModel(InitialStep initialStep) {
  		this.initialStep = initialStep;
  	}	
	
  	public void setNewConstraint(Rectangle newConstraint) {
	    this.newConstraintRectangle = newConstraint;
	    setStartAndEndPoint(newConstraint);
  	}
  	
  	private void setStartAndEndPoint(Rectangle constraintRectangle) {
  		this.startPoint = new Point(constraintRectangle.x+constraintRectangle.width/2, constraintRectangle.y);
  		this.endPoint = new Point(constraintRectangle.x+constraintRectangle.width/2, constraintRectangle.y+constraintRectangle.height);
  		this.initialStep.setStartPoint(this.startPoint);
  		this.initialStep.setEndPoint(this.endPoint);
  	}
}
