package sfcEditor;

/*
 * This class contains useful constants for the SFC Editor
 * @author: Filip Wagner
 */
public interface ConstantParameters {
	// Step parameters 
	// Note: Height of the whole step is STEP_HEIGHT + 2 * STEP_CONN_LENGTH
	public static Boolean STEP_RESIZE_ENABLED = Boolean.TRUE;
	public static int STEP_HEIGHT = 30;			// Height of step box
	public static int STEP_WIDTH = 60;			// Width of step box
	public static int STEP_CONN_LENGTH = 10;	// Connector length (vertical)
	
	// Transition parameters  
	// Note: Height of the whole transition is TRANSITION_HEIGHT + 2 * TRANSITION_CONN_LENGTH
	//			and the width of the whole transition is TRANSITION_NAME_WIDTH + TRANSITION_WIDTH + TRANSITION_COND_WIDTH
	public static Boolean TRANSITiON_RESIZE_ENABLED = Boolean.TRUE;
	public static int TRANSITION_HEIGHT = 5;		// Height of transition box
	public static int TRANSITION_WIDTH = 20;		// Width of transition box
	public static int TRANSITION_NAME_HEIGHT = 20;	// Height of transition name box
	public static int TRANSITION_NAME_WIDTH = 40;	// Width of transition name box
	public static int TRANSITION_COND_HEIGHT = 20;	// Height of transition condition box
	public static int TRANSITION_COND_WIDTH = 40;	// Width of transition condition box
	public static int TRANSITION_CONN_LENGTH = 10;	// Connector length (vertical)
	public static int TRANSITION_DIRECT_EDIT = 1;	// 0 = Name Label
													// sonst = Condition Label
	// Action parameters
	public static int ACTION_QUALIFIER_HEIGHT = 30;		// Height of action qualifier
	public static int ACTION_QUALIFIER_WIDTH = 50;		// Width of action qualifier
	public static int ACTION_NAME_HEIGHT = 30;			// Height of action name
	public static int ACTION_NAME_WIDTH = 80;			// Width of action name
	public static int ACTION_INDICATOR_HEIGHT = 30;		// Height of action indicator
	public static int ACTION_INDICATOR_WIDTH = 50;		// Width of action indicator
	public static int ACTION_INSTRUCTION_HEIGHT = 30;	// Height of action instruction block
	public static int ACTION_INSTRUCTION_WIDTH = 
			ACTION_QUALIFIER_WIDTH+ACTION_NAME_WIDTH+ACTION_INDICATOR_WIDTH;	// Width of action instruction block
	public static int ACTION_HEIGHT = 
			ACTION_QUALIFIER_HEIGHT+ACTION_INSTRUCTION_HEIGHT;	// Height of action
	public static int ACTION_WIDTH = ACTION_INSTRUCTION_WIDTH;	// Width of action
	public static int ACTION_STEP_DISTANCE = 40;		// Length of distance where action will be placed automatically 
														// when user place the action under a step (auto-connect step and action)
	
	// Backward connection
	public static int BACKWARD_CONNECTION_DISTANCE_TOINITSTEP = 60;
	public static int BACKWARD_CONNECTION_DISTANCE_TOOTHERS = 50;
	
	// Points
	// bendpoint1 & 2 for a connection between
	// two sfc elements where the source is above the target or
	// a connection between a step and an action
	public static int bendpoint1Index = 0;
	public static int bendpoint2Index = 1;
	// bendpoint1, 2, 3 & 4 for a connection between
	// two sfc elements where the source is under the target
	public static int bendpoint3Index = 2;
	public static int bendpoint4Index = 3;
}
