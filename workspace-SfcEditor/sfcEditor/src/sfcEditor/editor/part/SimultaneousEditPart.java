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
import sfcEditor.editor.policy.SimultaneousConnectionEditPolicy;
import sfcmodel.model.ConnectionType;
import sfcmodel.model.Simultaneous;

public class SimultaneousEditPart extends AbstractConnectionEditPart {

	private SimultaneousAdapter adapter;
	private PolylineConnection conn;
	
	public SimultaneousEditPart() {
		super();
	    adapter = new SimultaneousAdapter();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new SimultaneousConnectionEditPolicy());
	    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new ConnectionBendpointEditPolicy());
	}

	@Override 
	protected IFigure createFigure() {
		this.conn = new PolylineConnection();
		this.conn.setConnectionRouter(new BendpointConnectionRouter());
		((Simultaneous)getModel()).setPolylineConnection(this.conn);
		return this.conn;
	}
	
	@Override
	protected void refreshVisuals() {
	    Connection connection = getConnectionFigure();
	    Simultaneous line = ((Simultaneous)getModel());
	    List<Point> modelConstraint = (line.getBendpoints());
	    List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
	    
	    for (Point p : modelConstraint) {
	    	figureConstraint.add(new AbsoluteBendpoint(p));
	    }
	    connection.setRoutingConstraint(figureConstraint);
	    
	    // Create simultaneous lines
	    if(line.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
			BendpointFunctions.refreshSimultaneousLines(line.getStepIn());
		    BendpointFunctions.refreshSimultaneousLines(line.getTransitionOut());
	    }
	    else {
		    BendpointFunctions.refreshSimultaneousLines(line.getTransitionIn());
		    BendpointFunctions.refreshSimultaneousLines(line.getStepOut());
	    }
	}
	
	@Override 
	public void activate() {
	    if(!isActive()) {
	      ((Simultaneous)getModel()).eAdapters().add(adapter);
	    }
	    super.activate();
	}
	 
	@Override 
	public void deactivate() {
	    if(isActive()) {
	      ((Simultaneous)getModel()).eAdapters().remove(adapter);
	    }
	    super.deactivate();
	} 
	
	public class SimultaneousAdapter implements Adapter {
		  
		@Override 
		public void notifyChanged(Notification notification) {
		      refreshVisuals();
	    }
		 
	    @Override 
	    public Notifier getTarget() {     
		      return (Simultaneous)getModel();
	    }
		 
	    @Override 
	    public void setTarget(Notifier newTarget) {
		      // Do nothing.
	    }
		 
	    @Override 
	    public boolean isAdapterForType(Object type) {
		      return type.equals(Simultaneous.class);
	    }
	}
}
