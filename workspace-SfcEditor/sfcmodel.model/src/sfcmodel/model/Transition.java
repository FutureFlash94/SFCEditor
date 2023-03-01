/**
 */
package sfcmodel.model;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link sfcmodel.model.Transition#getConstraintsRectangle <em>Constraints Rectangle</em>}</li>
 *   <li>{@link sfcmodel.model.Transition#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link sfcmodel.model.Transition#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @see sfcmodel.model.SFCPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends SfcObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see sfcmodel.model.SFCPackage#getTransition_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Transition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Constraints Rectangle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints Rectangle</em>' attribute.
	 * @see #setConstraintsRectangle(Rectangle)
	 * @see sfcmodel.model.SFCPackage#getTransition_ConstraintsRectangle()
	 * @model dataType="sfcmodel.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraintsRectangle();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Transition#getConstraintsRectangle <em>Constraints Rectangle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints Rectangle</em>' attribute.
	 * @see #getConstraintsRectangle()
	 * @generated
	 */
	void setConstraintsRectangle(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link sfcmodel.model.Connection}.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Connection#getTransitionOut <em>Transition Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see sfcmodel.model.SFCPackage#getTransition_IncomingConnections()
	 * @see sfcmodel.model.Connection#getTransitionOut
	 * @model opposite="transitionOut"
	 * @generated
	 */
	EList<Connection> getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link sfcmodel.model.Connection}.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Connection#getTransitionIn <em>Transition In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see sfcmodel.model.SFCPackage#getTransition_OutgoingConnections()
	 * @see sfcmodel.model.Connection#getTransitionIn
	 * @model opposite="transitionIn"
	 * @generated
	 */
	EList<Connection> getOutgoingConnections();

} // Transition
