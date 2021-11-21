package sfcEditor.editor.command;

import sfcmodel.model.Step;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;

public class StepChangeConstraintCommand extends Command implements ConstantParameters {
	private Step step;
	private Rectangle oldConstraintRectangle;
	private Rectangle newConstraintRectangle;
	private Point startPoint;
	private Point endPoint;
	
  	@Override
  	public void execute() {
  		if(this.oldConstraintRectangle == null) {
  			this.oldConstraintRectangle = this.step.getConstraintsRectangle();
	    }
  		this.step.setConstraintsRectangle(this.newConstraintRectangle);
	    this.step.setStartPoint(this.startPoint);
	    this.step.setEndPoint(this.endPoint);
	    BendpointFunctions.refreshConnectionBendpoints(this.step);
  	}
	
  	@Override
  	public void undo() {
  		this.step.setConstraintsRectangle(this.oldConstraintRectangle);
	    setStartAndEndPoint(this.oldConstraintRectangle);
	    BendpointFunctions.refreshConnectionBendpoints(this.step);
  	}
	
  	@Override
  	public void redo() {
  		this.step.setConstraintsRectangle(this.newConstraintRectangle);
	    setStartAndEndPoint(this.newConstraintRectangle);
	    BendpointFunctions.refreshConnectionBendpoints(this.step);
  	}
  	
  	public void setModel(Step step) {
  		this.step = step;
  	}	
	
  	public void setNewConstraint(Rectangle newConstraint) {
	    this.newConstraintRectangle = newConstraint;
	    setStartAndEndPoint(newConstraint);
  	}
  	
  	private void setStartAndEndPoint(Rectangle constraintRectangle) {
  		this.startPoint = new Point(constraintRectangle.x+constraintRectangle.width/2, constraintRectangle.y);
  		this.endPoint = new Point(constraintRectangle.x+constraintRectangle.width/2, constraintRectangle.y+constraintRectangle.height);
  		this.step.setStartPoint(this.startPoint);
  		this.step.setEndPoint(this.endPoint);
  	}
}
