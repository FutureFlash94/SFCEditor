package sfcEditor.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import sfcEditor.ConstantParameters;
import sfcEditor.extras.SmartLabelFigure;
import sfcmodel.model.ActionType;
import sfcmodel.model.Qualifiers;

public class ActionFigure extends Figure implements ConstantParameters {
	
	private Label nameLabel;
	private Label qualifierLabel;
	private Label qualifierTimeLabel;
	private Label indicatorLabel;
	private SmartLabelFigure instructionLabel;
	private RectangleFigure nameRectangle;
	private RectangleFigure qualifierRectangle;
	private RectangleFigure instructionRectangle;
	private RectangleFigure indicatorRectangle;
	
	private Point startPoint;
	private boolean qualifierTimeLabelEnabled;
	private ActionType actionType;
	private Qualifiers actionQualifier;
	private ConnectionAnchor connectionAnchor;
	
	public ActionFigure() {
		setLayoutManager(new XYLayout());
		nameRectangle = new RectangleFigure();
		qualifierRectangle = new RectangleFigure();
		instructionRectangle = new RectangleFigure();
		indicatorRectangle = new RectangleFigure();
	    add(nameRectangle);
	    add(qualifierRectangle);
	    add(instructionRectangle);
	    add(indicatorRectangle);
	    nameLabel = new Label();
	    qualifierLabel = new Label();
	    qualifierTimeLabel = new Label();
	    instructionLabel = new SmartLabelFigure(2);
	    indicatorLabel = new Label();
	    add(nameLabel);
	    add(qualifierLabel);
	    add(qualifierTimeLabel);
	    add(instructionLabel);
	    add(indicatorLabel);
	    startPoint = new Point();
	    qualifierTimeLabelEnabled = false;
	}
 
	@Override
	protected void paintFigure(Graphics graphics) {
	    Rectangle r = getBounds().getCopy();
	    
		// reset constraints 
		setConstraint(nameLabel, new Rectangle(0, 0, 0, 0));
		setConstraint(qualifierLabel, new Rectangle(0, 0, 0, 0));
		setConstraint(qualifierTimeLabel, new Rectangle(0, 0, 0, 0));
		setConstraint(instructionLabel, new Rectangle(0, 0, 0, 0));
		setConstraint(indicatorLabel, new Rectangle(0, 0, 0, 0));
		setConstraint(nameRectangle, new Rectangle(0, 0, 0, 0));
		setConstraint(qualifierRectangle, new Rectangle(0, 0, 0, 0));
		setConstraint(instructionRectangle, new Rectangle(0, 0, 0, 0));
		setConstraint(indicatorRectangle, new Rectangle(0, 0, 0, 0));
		
		// draw constraints
		if(this.actionType == ActionType.NAME || this.actionQualifier == Qualifiers.NONE) {
			setConstraint(nameLabel, new Rectangle(0, 0, ACTION_WIDTH, ACTION_NAME_HEIGHT));
		    setConstraint(nameRectangle, new Rectangle(0, 0, ACTION_WIDTH, ACTION_NAME_HEIGHT));
		} else if(this.actionType == ActionType.NAME_QUALIFIER ) {
			if(qualifierTimeLabelEnabled == false) {
				setConstraint(qualifierLabel, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			    setConstraint(qualifierRectangle, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			} else {
				setConstraint(qualifierLabel, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT/2));
			    setConstraint(qualifierTimeLabel, new Rectangle(0, ACTION_QUALIFIER_HEIGHT/2, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT/2));
			    setConstraint(qualifierRectangle, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			}
	
		    setConstraint(nameLabel, new Rectangle(ACTION_QUALIFIER_WIDTH, 0, ACTION_NAME_WIDTH+ACTION_INDICATOR_WIDTH, ACTION_NAME_HEIGHT));
		    setConstraint(nameRectangle, new Rectangle(ACTION_QUALIFIER_WIDTH, 0, ACTION_NAME_WIDTH+ACTION_INDICATOR_WIDTH, ACTION_NAME_HEIGHT));
		} else if(this.actionType == ActionType.NAME_QUALIFIER_INDICATOR_INSTRUCTIONS) {
			if(qualifierTimeLabelEnabled == false) {
				setConstraint(qualifierLabel, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			    setConstraint(qualifierRectangle, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			} else {
				setConstraint(qualifierLabel, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT/2));
			    setConstraint(qualifierTimeLabel, new Rectangle(0, ACTION_QUALIFIER_HEIGHT/2, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT/2));
			    setConstraint(qualifierRectangle, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			}
			
		    setConstraint(nameLabel, new Rectangle(ACTION_QUALIFIER_WIDTH, 0, ACTION_NAME_WIDTH, ACTION_NAME_HEIGHT));
		    setConstraint(nameRectangle, new Rectangle(ACTION_QUALIFIER_WIDTH, 0, ACTION_NAME_WIDTH, ACTION_NAME_HEIGHT));

		    setConstraint(indicatorLabel, new Rectangle(ACTION_QUALIFIER_WIDTH+ACTION_NAME_WIDTH, 0, ACTION_INDICATOR_WIDTH, ACTION_INDICATOR_HEIGHT));
		    setConstraint(indicatorRectangle, new Rectangle(ACTION_QUALIFIER_WIDTH+ACTION_NAME_WIDTH, 0, ACTION_INDICATOR_WIDTH, ACTION_INDICATOR_HEIGHT));
		    
		    setConstraint(instructionLabel, new Rectangle(0, ACTION_QUALIFIER_HEIGHT, ACTION_INSTRUCTION_WIDTH, r.height-ACTION_QUALIFIER_HEIGHT));
		    setConstraint(instructionRectangle, new Rectangle(0, ACTION_QUALIFIER_HEIGHT, ACTION_INSTRUCTION_WIDTH, r.height-ACTION_QUALIFIER_HEIGHT));
		} else if(this.actionType == ActionType.NAME_QUALIFIER_INDICATOR) {
			if(qualifierTimeLabelEnabled == false) {
				setConstraint(qualifierLabel, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			    setConstraint(qualifierRectangle, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			} else {
				setConstraint(qualifierLabel, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT/2));
			    setConstraint(qualifierTimeLabel, new Rectangle(0, ACTION_QUALIFIER_HEIGHT/2, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT/2));
			    setConstraint(qualifierRectangle, new Rectangle(0, 0, ACTION_QUALIFIER_WIDTH, ACTION_QUALIFIER_HEIGHT));
			}

		    setConstraint(nameLabel, new Rectangle(ACTION_QUALIFIER_WIDTH, 0, ACTION_NAME_WIDTH, ACTION_NAME_HEIGHT));
		    setConstraint(nameRectangle, new Rectangle(ACTION_QUALIFIER_WIDTH, 0, ACTION_NAME_WIDTH, ACTION_NAME_HEIGHT));

		    setConstraint(indicatorLabel, new Rectangle(ACTION_QUALIFIER_WIDTH+ACTION_NAME_WIDTH, 0, ACTION_INDICATOR_WIDTH, ACTION_INDICATOR_HEIGHT));
		    setConstraint(indicatorRectangle, new Rectangle(ACTION_QUALIFIER_WIDTH+ACTION_NAME_WIDTH, 0, ACTION_INDICATOR_WIDTH, ACTION_INDICATOR_HEIGHT));
		}
		
	    // Add source line to an action
	    this.startPoint = new Point(0, ACTION_QUALIFIER_HEIGHT/2);
	    
	    qualifierLabel.invalidate();
	    qualifierTimeLabel.invalidate();
	    qualifierRectangle.invalidate();
	    nameLabel.invalidate();
	    nameRectangle.invalidate();
	    indicatorLabel.invalidate();
	    indicatorRectangle.invalidate();
	    instructionLabel.invalidate();
	    instructionRectangle.invalidate();
	}
	
	public Label getNameLabel() {
		return nameLabel;
	}
  	
  	public Label getQualifierLabel() {
  		return this.qualifierLabel;
  	}

  	public void setQualifierTimeLabelEnabled(boolean enabled) {
  		this.qualifierTimeLabelEnabled = enabled;
  	} 

  	public Label getQualifierTimeLabel() {
  		return this.qualifierTimeLabel;
  	}

  	public SmartLabelFigure getIstructionLabel() {
  		return this.instructionLabel;
  	}
  	
  	public Label getIndicatorLabelLabel() {
  		return this.indicatorLabel;
  	}
  	
  	public Point getStartPoint() {
  		return this.startPoint;
  	}

  	public void setActionType(ActionType actionType) {
  		this.actionType = actionType;
  	}
  	
  	public void setQualifier(Qualifiers qualifier) {
  		this.actionQualifier = qualifier;
  	}
  	
	public ConnectionAnchor getConnectionAnchor() {
	    if (connectionAnchor == null) {
	      connectionAnchor = new ChopboxAnchor(this);
	    }
	    return connectionAnchor;
	}
}
