package sfcEditor.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
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
import org.eclipse.jface.viewers.TextCellEditor;

import sfcEditor.ConstantParameters;
import sfcEditor.editor.figure.TransitionFigure;
import sfcEditor.editor.policy.SfcObjectGraphicalNodeEditPolicy;
import sfcEditor.editor.policy.TransitionComponentEditPolicy;
import sfcEditor.editor.policy.TransitionDirectEditPolicy;
import sfcmodel.model.Connection;
import sfcmodel.model.Transition;

public class TransitionEditPart extends AbstractGraphicalEditPart implements NodeEditPart, ConstantParameters{
	
	private TransitionAdapter adapter;
	
	public TransitionEditPart() {
	    super();
	    adapter = new TransitionAdapter();
	}

	@Override
	protected IFigure createFigure() {
		return new TransitionFigure();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new TransitionDirectEditPolicy());
	    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new SfcObjectGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new TransitionComponentEditPolicy());
		installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}
	
	@Override 
	protected List<Connection> getModelSourceConnections() {
		Transition model = (Transition)getModel();
	    return model.getOutgoingConnections();
	}
	
	@Override 
	protected List<Connection> getModelTargetConnections() {
		Transition model = (Transition)getModel();
	    return model.getIncomingConnections();
	}
	
	@Override 
	protected void refreshVisuals() {
		TransitionFigure figure = (TransitionFigure)getFigure();
	    Transition model = (Transition)getModel();
	    SequentialFunctionChartEditPart parent = (SequentialFunctionChartEditPart) getParent();
	    
	    figure.getNameLabel().setText(model.getName());
	    figure.getConditionLabel().setText(model.getCondition());
	    parent.setLayoutConstraint(this, figure, model.getConstraintsRectangle());
	}

	@Override 
	public void activate() {
		if(!isActive()) {
			((Transition)getModel()).eAdapters().add(adapter);
	    }
	    super.activate();
	}
	
	@Override 
	public void deactivate() {
	    if(isActive()) {
	    	((Transition)getModel()).eAdapters().remove(adapter);
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
		Label label;
		if(TRANSITION_DIRECT_EDIT == 0) {
			label = ((TransitionFigure)getFigure()).getNameLabel();
		}
		else {
			label = ((TransitionFigure)getFigure()).getConditionLabel();
		}
	    TransitionDirectEditManager manager = new TransitionDirectEditManager(this, TextCellEditor.class, new TransitionCellEditorLocator(label), label);
	    manager.show();
	}
	
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
	    return ((TransitionFigure)getFigure()).getConnectionAnchor();
	}
	 
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
	    return ((TransitionFigure)getFigure()).getConnectionAnchor();
	}
	 
	@Override 
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	    return ((TransitionFigure)getFigure()).getConnectionAnchor();
	}
	 
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
	    return ((TransitionFigure)getFigure()).getConnectionAnchor();
	} 
	
	/**
	 * Currently the class only adapts to create a {@link SnapToHelper}
	 * when the editor is in snapping mode (either to grid or to shapes).
	 */
	@Override public Object getAdapter(Class key) {
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
	
	public class TransitionAdapter implements Adapter {
		 
	    // Adapter interface
	    @Override public void notifyChanged(Notification notification) {
	    	refreshVisuals();
	    	refreshSourceConnections();
			refreshTargetConnections();
	    }
	 
	    @Override public Notifier getTarget() {
	    	return (Transition)getModel();
	    }
	 
	    @Override public void setTarget(Notifier newTarget) {
	    	// Do nothing.
	    }
	 
	    @Override public boolean isAdapterForType(Object type) {
	    	return type.equals(Transition.class);
	    }
	}
}
