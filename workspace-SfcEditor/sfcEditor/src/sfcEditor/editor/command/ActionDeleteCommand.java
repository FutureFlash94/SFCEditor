package sfcEditor.editor.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import sfcEditor.BendpointFunctions;
import sfcmodel.model.Action;
import sfcmodel.model.Connection;
import sfcmodel.model.ConnectionType;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.SfcObject;
import sfcmodel.model.Step;

public final class ActionDeleteCommand extends Command {
	
	private Action action;

	/* index where the action was */
	private int index;
	
	/* incoming connections. */
	private List<Connection> connections;
	
	/* sources for the connections that start at a step. */
	private Map<Connection, SfcObject> connectionSources;

	/* targets for the connections that end at this action. */
	private Map<Connection, SfcObject> connectionTargets;
	
	private SequentialFunctionChart sfc;
	
	@Override
	public void execute() {
	    detachconnections();
		action.setSfc(null);
	}
	
	@Override
	public void undo() {
	    reattachconnections();
		action.setSfc(sfc);
	}
	
	/*
	 * Detach all connections from the action and
	 * storing the connection information in local
	 * data structures.
	 */
	private void detachconnections() {
		connections = new ArrayList<Connection>();
	    connectionSources = new HashMap<Connection, SfcObject>();
	    connectionTargets = new HashMap<Connection, SfcObject>();
	    connections.addAll(action.getIncomingConnections());
	    
	    index = -1;
	    if(this.action.getIncomingConnections().size() > 0) {
		    Step s = this.action.getIncomingConnections().get(0).getStepIn();
		    
		    // get index of action and save it
		    int i = 0;
			for(Connection connFromStepToAction : s.getOutgoingConnections()) {
		    	if(connFromStepToAction.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) {
		    		if(connFromStepToAction.getAction() == this.action) {
		    			index = i;
		    		}
			    	i++;
		    	}
		    }
			
		    // delete action
		    for (Connection connection : connections) {
		    	if(connection.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) {
			    	connectionSources.put(connection, connection.getStepIn());
			    	connectionTargets.put(connection, connection.getAction());
			    	connection.setStepIn(null);
			    	connection.setAction(null);
		    	}
		    }
		    
		    //refresh other actions
		    for(Connection connFromStepToAction : s.getOutgoingConnections()) {
		    	if(connFromStepToAction.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) {
		    		BendpointFunctions.refreshAction(connFromStepToAction.getAction());
		    	}
		    }
	    }
	}
	
	/**
	 * Reattach all connections from the step to the action
	 */
	private void reattachconnections() {
		
		// add action to step again
		for (Connection connection : connections) {
			connection.setStepIn((Step)connectionSources.get(connection));
			connection.setAction((Action)connectionTargets.get(connection));
			connection.setConnectionType(ConnectionType.FROM_STEP_TO_ACTION);
			connection.setSfc(sfc);
	    }
		
		if(index != -1) {
			// count actions of step
			int i = 0;
			int total = 0;
		    Step s = this.action.getIncomingConnections().get(0).getStepIn();
		    for(Connection connFromStepToAction : s.getOutgoingConnections()) {
		    	if(connFromStepToAction.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) {
		    		total++;
		    	}
		    }
		    
		    // move action to right position
		    for(Connection connFromStepToAction : s.getOutgoingConnections()) {
		    	if(connFromStepToAction.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) {
		    		if(connFromStepToAction.getAction() == this.action && index != i && total>=index+1) {
		    			s.getOutgoingConnections().move(index+1, connFromStepToAction);
		    		}
		    		BendpointFunctions.refreshAction(connFromStepToAction.getAction());
		    		i++;
		    	}
		    }
		}
	}
	
	public void setAction(Action action) {
		this.action = action;
		this.sfc = action.getSfc();
	}
}
