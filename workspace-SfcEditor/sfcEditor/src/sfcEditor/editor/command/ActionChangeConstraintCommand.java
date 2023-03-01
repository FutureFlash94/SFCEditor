package sfcEditor.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import sfcEditor.BendpointFunctions;
import sfcEditor.ConstantParameters;
import sfcmodel.model.Action;
import sfcmodel.model.ActionType;

public class ActionChangeConstraintCommand extends Command implements ConstantParameters {
	private Action action;
	private Rectangle oldConstraintRectangle;
	private Rectangle newConstraintRectangle;
	private Point startPoint;
	private ActionType actionType;
	
  	@Override
  	public void execute() {
  		if(this.oldConstraintRectangle == null) {
  			this.oldConstraintRectangle = this.action.getConstraintsRectangle();
	    }
  		if(this.newConstraintRectangle != null) {
  			this.action.setConstraintsRectangle(this.newConstraintRectangle);
  		}
  		this.action.setActionType(this.actionType);
  		
  		// if action is connected to a step, set rectangle.y of action to rectange.y of step
	    if(action.getIncomingConnections().size() > 0) {
    		if(action.getIncomingConnections().get(0).getStepIn() != null) {
    			action.getConstraintsRectangle().setY(
    					action.getIncomingConnections().get(0).getStepIn().getStartPoint().y+STEP_CONN_LENGTH);
    	  		this.newConstraintRectangle = action.getConstraintsRectangle();
    			setStartPoint(this.newConstraintRectangle);
    		}
	    }
	    BendpointFunctions.refreshAction(this.action);
  	}
	
  	@Override
  	public void undo() {
  		this.action.setConstraintsRectangle(this.oldConstraintRectangle);
  		setStartPoint(this.oldConstraintRectangle);
	    BendpointFunctions.refreshAction(this.action);
  	}
	
  	@Override
  	public void redo() {
  		this.action.setConstraintsRectangle(this.newConstraintRectangle);
  		setStartPoint(this.newConstraintRectangle);
	    BendpointFunctions.refreshAction(this.action);
  	}
  	
  	public void setModel(Action action) {
  		this.action = action;

  		// if action type changed, change constraint height/width
  		if(this.actionType != action.getActionType()) {
			this.newConstraintRectangle = action.getConstraintsRectangle();
			
  			if(action.getActionType() == ActionType.NAME) {
  				this.newConstraintRectangle.height = ACTION_NAME_HEIGHT;
  				this.newConstraintRectangle.width = ACTION_WIDTH;
  			} else if(action.getActionType() == ActionType.NAME_QUALIFIER) {
  				this.newConstraintRectangle.height = ACTION_NAME_HEIGHT;
  				this.newConstraintRectangle.width = ACTION_WIDTH;
  			} else if(action.getActionType() == ActionType.NAME_QUALIFIER_INDICATOR) {
  				this.newConstraintRectangle.height = ACTION_NAME_HEIGHT;
  				this.newConstraintRectangle.width = ACTION_WIDTH;
  			} else if(action.getActionType() == ActionType.NAME_QUALIFIER_INDICATOR_INSTRUCTIONS) {
  				this.newConstraintRectangle.height = ACTION_HEIGHT;
  				this.newConstraintRectangle.width = ACTION_WIDTH;
  			}
  		}
  	}
	
  	public void setNewConstraint(Rectangle newConstraint) {
	    this.newConstraintRectangle = newConstraint;
	    setStartPoint(newConstraint);
  	}

  	private void setStartPoint(Rectangle constraintRectangle) {
  		this.startPoint = new Point(constraintRectangle.x, constraintRectangle.y+ACTION_QUALIFIER_HEIGHT/2);
	    this.action.setStartPoint(this.startPoint);
  	}
}
