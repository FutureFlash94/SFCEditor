/**
 */
package sfcmodel.model;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.Action#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link sfcmodel.model.Action#getQualifierTime <em>Qualifier Time</em>}</li>
 *   <li>{@link sfcmodel.model.Action#getInstructionBlock <em>Instruction Block</em>}</li>
 *   <li>{@link sfcmodel.model.Action#getIndicatorVariable <em>Indicator Variable</em>}</li>
 *   <li>{@link sfcmodel.model.Action#getConstraintsRectangle <em>Constraints Rectangle</em>}</li>
 *   <li>{@link sfcmodel.model.Action#getActionType <em>Action Type</em>}</li>
 *   <li>{@link sfcmodel.model.Action#getIncomingConnections <em>Incoming Connections</em>}</li>
 * </ul>
 *
 * @see sfcmodel.model.SFCPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends SfcObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * The literals are from the enumeration {@link sfcmodel.model.Qualifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see sfcmodel.model.Qualifiers
	 * @see #setQualifier(Qualifiers)
	 * @see sfcmodel.model.SFCPackage#getAction_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	Qualifiers getQualifier();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Action#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see sfcmodel.model.Qualifiers
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Qualifiers value);

	/**
	 * Returns the value of the '<em><b>Qualifier Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Time</em>' attribute.
	 * @see #setQualifierTime(double)
	 * @see sfcmodel.model.SFCPackage#getAction_QualifierTime()
	 * @model
	 * @generated
	 */
	double getQualifierTime();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Action#getQualifierTime <em>Qualifier Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Time</em>' attribute.
	 * @see #getQualifierTime()
	 * @generated
	 */
	void setQualifierTime(double value);

	/**
	 * Returns the value of the '<em><b>Instruction Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Block</em>' attribute.
	 * @see #setInstructionBlock(String)
	 * @see sfcmodel.model.SFCPackage#getAction_InstructionBlock()
	 * @model
	 * @generated
	 */
	String getInstructionBlock();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Action#getInstructionBlock <em>Instruction Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Block</em>' attribute.
	 * @see #getInstructionBlock()
	 * @generated
	 */
	void setInstructionBlock(String value);

	/**
	 * Returns the value of the '<em><b>Indicator Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicator Variable</em>' attribute.
	 * @see #setIndicatorVariable(String)
	 * @see sfcmodel.model.SFCPackage#getAction_IndicatorVariable()
	 * @model
	 * @generated
	 */
	String getIndicatorVariable();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Action#getIndicatorVariable <em>Indicator Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator Variable</em>' attribute.
	 * @see #getIndicatorVariable()
	 * @generated
	 */
	void setIndicatorVariable(String value);

	/**
	 * Returns the value of the '<em><b>Constraints Rectangle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints Rectangle</em>' attribute.
	 * @see #setConstraintsRectangle(Rectangle)
	 * @see sfcmodel.model.SFCPackage#getAction_ConstraintsRectangle()
	 * @model dataType="sfcmodel.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraintsRectangle();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Action#getConstraintsRectangle <em>Constraints Rectangle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints Rectangle</em>' attribute.
	 * @see #getConstraintsRectangle()
	 * @generated
	 */
	void setConstraintsRectangle(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sfcmodel.model.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see sfcmodel.model.ActionType
	 * @see #setActionType(ActionType)
	 * @see sfcmodel.model.SFCPackage#getAction_ActionType()
	 * @model
	 * @generated
	 */
	ActionType getActionType();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Action#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see sfcmodel.model.ActionType
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link sfcmodel.model.Connection}.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Connection#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see sfcmodel.model.SFCPackage#getAction_IncomingConnections()
	 * @see sfcmodel.model.Connection#getAction
	 * @model opposite="action"
	 * @generated
	 */
	EList<Connection> getIncomingConnections();

} // Action
