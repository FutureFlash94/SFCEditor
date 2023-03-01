package sfcEditor.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import sfcEditor.BendpointFunctions;
import sfcEditor.editor.policy.ConnectionBendpointEditPolicy;
import sfcEditor.editor.policy.SelectionConnectionEditPolicy;
import sfcmodel.model.Selection;

public class SelectionEditPart extends AbstractConnectionEditPart {

	private SelectionAdapter adapter;
	private PolylineConnection conn;
	
	public SelectionEditPart() {
		super();
	    adapter = new SelectionAdapter();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new SelectionConnectionEditPolicy());
	    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new ConnectionBendpointEditPolicy());
	}

	@Override 
	protected IFigure createFigure() {
		this.conn = new PolylineConnection();
		this.conn.setConnectionRouter(new BendpointConnectionRouter());
		((Selection)getModel()).setPolylineConnection(this.conn);
		return this.conn;
	}
	
	@Override
	protected void refreshVisuals() {
	    Connection connection = getConnectionFigure();
	    Selection s = (Selection)getModel();
	    List<Point> modelConstraint = s.getBendpoints();
	    List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
	    for (Point p : modelConstraint) {
	    	figureConstraint.add(new AbsoluteBendpoint(p));
	    }
	    connection.setRoutingConstraint(figureConstraint);
	    BendpointFunctions.refreshSelectionLine(s);
	}
	
	@Override 
	public void activate() {
	    if(!isActive()) {
	      ((Selection)getModel()).eAdapters().add(adapter);
	    }
	    super.activate();
	}
	 
	@Override 
	public void deactivate() {
	    if(isActive()) {
	      ((Selection)getModel()).eAdapters().remove(adapter);
	    }
	    super.deactivate();
	}
	
	public class SelectionAdapter implements Adapter {
		  
		@Override 
		public void notifyChanged(Notification notification) {
		      refreshVisuals();
	    }
		 
	    @Override 
	    public Notifier getTarget() {     
		      return (Selection)getModel();
	    }
		 
	    @Override 
	    public void setTarget(Notifier newTarget) {
		      // Do nothing.
	    }
		 
	    @Override 
	    public boolean isAdapterForType(Object type) {
		      return type.equals(Selection.class);
	    }
	}
}
