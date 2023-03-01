/**
 */
package sfcmodel.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sfcmodel.model.SFCPackage#getActionType()
 * @model
 * @generated
 */
public enum ActionType implements Enumerator {
	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(0, "Name", "Name"),

	/**
	 * The '<em><b>Name Qualifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_QUALIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	NAME_QUALIFIER(1, "NameQualifier", "NameQualifier"),

	/**
	 * The '<em><b>Name Qualifier Indicator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_QUALIFIER_INDICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	NAME_QUALIFIER_INDICATOR(2, "NameQualifierIndicator", "NameQualifierIndicator"),

	/**
	 * The '<em><b>Name Qualifier Indicator Instructions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_QUALIFIER_INDICATOR_INSTRUCTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	NAME_QUALIFIER_INDICATOR_INSTRUCTIONS(3, "NameQualifierIndicatorInstructions", "NameQualifierIndicatorInstructions");

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="Name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 0;

	/**
	 * The '<em><b>Name Qualifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_QUALIFIER
	 * @model name="NameQualifier"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_QUALIFIER_VALUE = 1;

	/**
	 * The '<em><b>Name Qualifier Indicator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_QUALIFIER_INDICATOR
	 * @model name="NameQualifierIndicator"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_QUALIFIER_INDICATOR_VALUE = 2;

	/**
	 * The '<em><b>Name Qualifier Indicator Instructions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_QUALIFIER_INDICATOR_INSTRUCTIONS
	 * @model name="NameQualifierIndicatorInstructions"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_QUALIFIER_INDICATOR_INSTRUCTIONS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionType[] VALUES_ARRAY =
		new ActionType[] {
			NAME,
			NAME_QUALIFIER,
			NAME_QUALIFIER_INDICATOR,
			NAME_QUALIFIER_INDICATOR_INSTRUCTIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType get(int value) {
		switch (value) {
			case NAME_VALUE: return NAME;
			case NAME_QUALIFIER_VALUE: return NAME_QUALIFIER;
			case NAME_QUALIFIER_INDICATOR_VALUE: return NAME_QUALIFIER_INDICATOR;
			case NAME_QUALIFIER_INDICATOR_INSTRUCTIONS_VALUE: return NAME_QUALIFIER_INDICATOR_INSTRUCTIONS;
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
	private ActionType(int value, String name, String literal) {
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
	
} //ActionType
