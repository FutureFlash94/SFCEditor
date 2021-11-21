package sfcEditor.editor.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import sfcEditor.editor.policy.SequentialFunctionChartXYLayoutPolicy;
import sfcmodel.model.*;

public final class InitialStepDeleteCommand extends Command {
	
	/* initial step to be deleted. */
	private InitialStep initialStep;
	
	/* SFC that owns the step. */
	private SequentialFunctionChart sfc;
	
	/* incoming and outgoing connections. */
	private List<Connection> connections;
	
	/* sources for the connections that start or end at this step. */
	private Map<Connection, SfcObject> connectionSources;

	/* targets for the connections that start or end at this step. */
	private Map<Connection, SfcObject> connectionTargets;
	
	/* connection state for the connections that start or end at this step. */
	private Map<Connection, ConnectionType> connectionType;
	
	@Override
	public void execute() {
	    detachconnections();
	    initialStep.setSfc(null);
	    SequentialFunctionChartXYLayoutPolicy.setInitStepExist(false);
	}
	
	@Override
	public void undo() {
	    reattachconnections();
	    initialStep.setSfc(sfc);
	    SequentialFunctionChartXYLayoutPolicy.setInitStepExist(true);
	}
	
	/*
	 * Detach all connections from the step and from the other
	 * connecting transition, storing the connection information in local
	 * data structures.
	 */
	private void detachconnections() {
		connections = new ArrayList<Connection>();
	    connectionSources = new HashMap<Connection, SfcObject>();
	    connectionTargets = new HashMap<Connection, SfcObject>();
	    connectionType = new HashMap<Connection, ConnectionType>();
	    connections.addAll(initialStep.getIncomingConnections());
	    connections.addAll(initialStep.getOutgoingConnections());
	    for (Connection connection : connections) {
	    	
    		connectionType.put(connection, connection.getConnectionType());
    		
	    	if(connection.getConnectionType() == ConnectionType.FROM_STEP_TO_TRANSITION) {
		    	connectionSources.put(connection, connection.getStepIn());
		    	connectionTargets.put(connection, connection.getTransitionOut());
		    	connection.setStepIn(null);
		    	connection.setTransitionOut(null);
	    	}
	    	else if(connection.getConnectionType() == ConnectionType.FROM_TRANSITION_TO_STEP) {
		    	connectionSources.put(connection, connection.getTransitionIn());
		    	connectionTargets.put(connection, connection.getStepOut());
		    	connection.setTransitionIn(null);
		    	connection.setStepOut(null);
	    	}
	    	else if(connection.getConnectionType() == ConnectionType.FROM_STEP_TO_ACTION) {
		    	connectionSources.put(connection, connection.getStepIn());
		    	connectionTargets.put(connection, connection.getAction());
		    	connection.setStepIn(null);
		    	connection.setAction(null);
	    	}
	    	
	    	connection.setSfc(null);
	    }
	}
	
	/**
	 * Reattach all connections to their source and target step.
	 */
	private void reattachconnections() {
		for (Connection connection : connections) {
			
			if(connectionType.get(connection) == ConnectionType.FROM_STEP_TO_TRANSITION) {
				connection.setStepIn((Step)connectionSources.get(connection));
				connection.setTransitionOut((Transition)connectionTargets.get(connection));
			}
			else if(connectionType.get(connection) == ConnectionType.FROM_TRANSITION_TO_STEP) {
				connection.setTransitionIn((Transition)connectionSources.get(connection));
				connection.setStepOut((Step)connectionTargets.get(connection));
			}
			else if(connectionType.get(connection) == ConnectionType.FROM_STEP_TO_ACTION) {
				connection.setStepIn((Step)connectionSources.get(connection));
				connection.setAction((Action)connectionTargets.get(connection));
			}
			connection.setSfc(sfc);
	    }
	}
	
	public void setInitialStep(InitialStep initialStep) {
		this.initialStep = initialStep;
		this.sfc = initialStep.getSfc();
	}
}
