package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;
import sfcmodel.model.Transition;

public class TransitionChangeConstraintCommand extends Command implements ConstantParameters {
	private Transition transition;
	private Rectangle oldConstraintRectangle;
	private Rectangle newConstraintRectangle;
	private Point startPoint;
	private Point endPoint;
	   
  	@Override 
  	public void execute() {
  		if(this.oldConstraintRectangle == null) {
  			this.oldConstraintRectangle = this.transition.getConstraintsRectangle();
	    }
  		this.transition.setConstraintsRectangle(this.newConstraintRectangle);
	    this.transition.setStartPoint(this.startPoint);
	    this.transition.setEndPoint(this.endPoint);
	    BendpointFunctions.refreshConnectionBendpoints(this.transition);
  	}
	
  	@Override 
  	public void undo() {
  		this.transition.setConstraintsRectangle(this.oldConstraintRectangle);
	    setStartAndEndPoint(this.oldConstraintRectangle);
	    BendpointFunctions.refreshConnectionBendpoints(this.transition);
  	}	
  	
  	@Override
  	public void redo() {
  		this.transition.setConstraintsRectangle(this.newConstraintRectangle);
	    setStartAndEndPoint(this.newConstraintRectangle);
	    BendpointFunctions.refreshConnectionBendpoints(this.transition);
  	}
	
  	public void setModel(Transition transition) {
  		this.transition = transition;
  	}	

  	public void setNewConstraint(Rectangle newConstraint) {
	    this.newConstraintRectangle = newConstraint;
	    setStartAndEndPoint(newConstraint);
  	}	
  	
  	private void setStartAndEndPoint(Rectangle constraintRectangle) {
  		this.startPoint = new Point(constraintRectangle.x+constraintRectangle.width/2, constraintRectangle.y);
  		this.endPoint = new Point(constraintRectangle.x+constraintRectangle.width/2, constraintRectangle.y+constraintRectangle.height);
  		this.transition.setStartPoint(this.startPoint);
  		this.transition.setEndPoint(this.endPoint);
  	}
}
