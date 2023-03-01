/**
 */
package sfcmodel.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connection Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sfcmodel.model.SFCPackage#getConnectionType()
 * @model
 * @generated
 */
public enum ConnectionType implements Enumerator {
	/**
	 * The '<em><b>From Step To Transition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_STEP_TO_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_STEP_TO_TRANSITION(0, "FromStepToTransition", "FromStepToTransition"),

	/**
	 * The '<em><b>From Transition To Step</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_TRANSITION_TO_STEP_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_TRANSITION_TO_STEP(1, "FromTransitionToStep", "FromTransitionToStep"),

	/**
	 * The '<em><b>From Step To Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_STEP_TO_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_STEP_TO_ACTION(2, "FromStepToAction", "FromStepToAction");

	/**
	 * The '<em><b>From Step To Transition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_STEP_TO_TRANSITION
	 * @model name="FromStepToTransition"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_STEP_TO_TRANSITION_VALUE = 0;

	/**
	 * The '<em><b>From Transition To Step</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_TRANSITION_TO_STEP
	 * @model name="FromTransitionToStep"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_TRANSITION_TO_STEP_VALUE = 1;

	/**
	 * The '<em><b>From Step To Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_STEP_TO_ACTION
	 * @model name="FromStepToAction"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_STEP_TO_ACTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Connection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectionType[] VALUES_ARRAY =
		new ConnectionType[] {
			FROM_STEP_TO_TRANSITION,
			FROM_TRANSITION_TO_STEP,
			FROM_STEP_TO_ACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Connection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connection Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionType get(int value) {
		switch (value) {
			case FROM_STEP_TO_TRANSITION_VALUE: return FROM_STEP_TO_TRANSITION;
			case FROM_TRANSITION_TO_STEP_VALUE: return FROM_TRANSITION_TO_STEP;
			case FROM_STEP_TO_ACTION_VALUE: return FROM_STEP_TO_ACTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConnectionType
