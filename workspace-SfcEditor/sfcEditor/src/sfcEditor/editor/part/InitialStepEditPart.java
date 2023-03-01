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

import sfcEditor.editor.figure.InitialStepFigure;
import sfcEditor.editor.policy.InitialStepComponentEditPolicy;
import sfcEditor.editor.policy.InitialStepDirectEditPolicy;
import sfcEditor.editor.policy.SequentialFunctionChartXYLayoutPolicy;
import sfcEditor.editor.policy.SfcObjectGraphicalNodeEditPolicy;
import sfcmodel.model.Connection;
import sfcmodel.model.InitialStep;

public class InitialStepEditPart extends AbstractGraphicalEditPart implements NodeEditPart {
	
	private InitialStepAdapter adapter;
	
	public InitialStepEditPart() {
	    super();
	    adapter = new InitialStepAdapter();
	}
	
	@Override
	protected IFigure createFigure() {
		return new InitialStepFigure();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new InitialStepDirectEditPolicy());
	    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new SfcObjectGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new InitialStepComponentEditPolicy());
		installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}
	
	@Override 
	protected List<Connection> getModelSourceConnections() {
		InitialStep model = (InitialStep)getModel();
	    return model.getOutgoingConnections();
	}
	
	@Override 
	protected List<Connection> getModelTargetConnections() {
		InitialStep model = (InitialStep)getModel();
	    return model.getIncomingConnections();
	}

	@Override 
	protected void refreshVisuals() {
		InitialStepFigure figure = (InitialStepFigure)getFigure();
		InitialStep model = (InitialStep)getModel();
	    SequentialFunctionChartEditPart parent = (SequentialFunctionChartEditPart) getParent();
	    
	    figure.getNameLabel().setText(model.getName());
	    // Prevent the ability of drawing a second  init step if there was already one in the sfc after opening.
	    SequentialFunctionChartXYLayoutPolicy.setInitStepExist(true);
	    parent.setLayoutConstraint(this, figure, model.getConstraintsRectangle());
	} 
	
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
	    return ((InitialStepFigure)getFigure()).getConnectionAnchor();
	}
	 
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
	    return ((InitialStepFigure)getFigure()).getConnectionAnchor();
	}
	 
	@Override 
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	    return ((InitialStepFigure)getFigure()).getConnectionAnchor();
	}
	 
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
	    return ((InitialStepFigure)getFigure()).getConnectionAnchor();
	} 
	
	@Override 
	public void activate() {
		if(!isActive()) {
			((InitialStep)getModel()).eAdapters().add(adapter);
	    }
	    super.activate();
	}
	 
	@Override 
	public void deactivate() {
	    if(isActive()) {
	    	((InitialStep)getModel()).eAdapters().remove(adapter);
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
	    Label label = ((InitialStepFigure)getFigure()).getNameLabel();
	    InitialStepDirectEditManager manager = new InitialStepDirectEditManager(this, 
	    		TextCellEditor.class, new InitialStepCellEditorLocator(label), label);
	    manager.show();
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
	
	public class InitialStepAdapter implements Adapter {
		 
		// Adapter interface
		@Override public void notifyChanged(Notification notification) {
			refreshVisuals();
			refreshSourceConnections();
			refreshTargetConnections();
	    }
	 
	    @Override public Notifier getTarget() {
	    	return (InitialStep)getModel();
	    }
	 
	    @Override public void setTarget(Notifier newTarget) {
	    	// Do nothing.
	    }
	 
	    @Override public boolean isAdapterForType(Object type) {
	    	return type.equals(InitialStep.class);
	    }
	}
}
