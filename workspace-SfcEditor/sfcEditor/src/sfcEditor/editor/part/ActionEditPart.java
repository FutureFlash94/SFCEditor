package sfcEditor.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;

import sfcmodel.model.*;
import sfcEditor.editor.figure.ActionFigure;
import sfcEditor.editor.policy.*;

public class ActionEditPart extends AbstractGraphicalEditPart implements NodeEditPart {
	
	private ActionAdapter adapter;
	private ActionType actionType;
	private Qualifiers actionQualifier;
	
	public ActionEditPart() {
	    super();
	    adapter = new ActionAdapter();
	}
	
	@Override
	protected IFigure createFigure() {
		return new ActionFigure();
	}
	
	@Override
	protected void createEditPolicies() {
		//installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ActionDirectEditPolicy());
	    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new SfcObjectGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ActionComponentEditPolicy());
		installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}

	@Override 
	protected List<Connection> getModelTargetConnections() {
		Action model = (Action)getModel();
	    return model.getIncomingConnections();
	}

	@Override 
	protected void refreshVisuals() {
		Action action = (Action)getModel();
	    SequentialFunctionChartEditPart parent = (SequentialFunctionChartEditPart) getParent();
	    this.actionType = action.getActionType();
	    this.actionQualifier = action.getQualifier();
	    
	    ActionFigure figure = (ActionFigure)getFigure();
	    figure.setActionType(this.actionType);
	    figure.setQualifier(actionQualifier);
	    
	    if(action.getQualifier() == Qualifiers.L || action.getQualifier() == Qualifiers.D || 
	    		action.getQualifier() == Qualifiers.SD || action.getQualifier() == Qualifiers.DS || 
	    		action.getQualifier() == Qualifiers.SL) {
	    	figure.setQualifierTimeLabelEnabled(true);
	    	figure.getQualifierLabel().setText(action.getQualifier().toString());
	    	figure.getQualifierTimeLabel().setText("t#" + action.getQualifierTime()+"s");
		} else {
	    	figure.setQualifierTimeLabelEnabled(false);
			figure.getQualifierLabel().setText(action.getQualifier().toString());
		}
    	figure.getNameLabel().setText(action.getName());
	    figure.getIndicatorLabelLabel().setText(action.getIndicatorVariable());
	    figure.getIstructionLabel().setText(action.getInstructionBlock());
	    
	    parent.setLayoutConstraint(this, figure, action.getConstraintsRectangle());
	}
	
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		return ((ActionFigure)getFigure()).getConnectionAnchor();
	}
	 
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		return ((ActionFigure)getFigure()).getConnectionAnchor();
	}
	 
	@Override 
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return ((ActionFigure)getFigure()).getConnectionAnchor();
	}
	 
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((ActionFigure)getFigure()).getConnectionAnchor();
	} 
	
	@Override 
	public void activate() {
		if(!isActive()) {
			((Action)getModel()).eAdapters().add(adapter);
	    }
	    super.activate();
	}
	 
	@Override 
	public void deactivate() {
	    if(isActive()) {
	    	((Action)getModel()).eAdapters().remove(adapter);
	    }
	    super.deactivate();
	} 
	
	@Override 
	public void performRequest(Request req) {
	    if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
	    	performDirectEditing();
	    }
	}
	
	private void performDirectEditing() {
	    //Label label = ((ActionFigureAll)getFigure()).getNameLabel();
	    //ActionDirectEditManager manager = new ActionDirectEditManager(this, TextCellEditor.class, new StepCellEditorLocator(label), label);
	    //manager.show();
	}
	
	/**
	 * Currently the class only adapts to create a {@link SnapToHelper}
	 * when the editor is in snapping mode (either to grid or to shapes).
	 */
	@Override 
	public Object getAdapter(Class key) {
	    if (key == SnapToHelper.class) {
	        List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
	        if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
	            helpers.add(new SnapToGeometry(this));
	        }
	        if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
	            helpers.add(new SnapToGrid(this));
	        }
	        if(helpers.size()==0) {
	            return null;
	        } else {
	            return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
	        }
	    }
	    return super.getAdapter(key);
	} 
	
	public class ActionAdapter implements Adapter {
		 
		// Adapter interface
		@Override public void notifyChanged(Notification notification) {
			refreshVisuals();
			refreshSourceConnections();
			refreshTargetConnections();
	    }
	 
	    @Override public Notifier getTarget() {
	    	return (Action)getModel();
	    }
	 
	    @Override public void setTarget(Notifier newTarget) {
	    	// Do nothing.
	    }
	 
	    @Override public boolean isAdapterForType(Object type) {
	    	return type.equals(Action.class);
	    }
	}
}
