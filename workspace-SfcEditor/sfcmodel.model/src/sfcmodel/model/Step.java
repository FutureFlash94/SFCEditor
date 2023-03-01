/**
 */
package sfcmodel.model;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.Step#getX <em>X</em>}</li>
 *   <li>{@link sfcmodel.model.Step#getT <em>T</em>}</li>
 *   <li>{@link sfcmodel.model.Step#getConstraintsRectangle <em>Constraints Rectangle</em>}</li>
 *   <li>{@link sfcmodel.model.Step#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link sfcmodel.model.Step#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @see sfcmodel.model.SFCPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends SfcObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Boolean)
	 * @see sfcmodel.model.SFCPackage#getStep_X()
	 * @model required="true"
	 * @generated
	 */
	Boolean getX();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Step#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Boolean value);

	/**
	 * Returns the value of the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' attribute.
	 * @see #setT(Double)
	 * @see sfcmodel.model.SFCPackage#getStep_T()
	 * @model required="true"
	 * @generated
	 */
	Double getT();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Step#getT <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' attribute.
	 * @see #getT()
	 * @generated
	 */
	void setT(Double value);

	/**
	 * Returns the value of the '<em><b>Constraints Rectangle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints Rectangle</em>' attribute.
	 * @see #setConstraintsRectangle(Rectangle)
	 * @see sfcmodel.model.SFCPackage#getStep_ConstraintsRectangle()
	 * @model dataType="sfcmodel.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraintsRectangle();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Step#getConstraintsRectangle <em>Constraints Rectangle</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Connection#getStepOut <em>Step Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see sfcmodel.model.SFCPackage#getStep_IncomingConnections()
	 * @see sfcmodel.model.Connection#getStepOut
	 * @model opposite="stepOut"
	 * @generated
	 */
	EList<Connection> getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link sfcmodel.model.Connection}.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Connection#getStepIn <em>Step In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see sfcmodel.model.SFCPackage#getStep_OutgoingConnections()
	 * @see sfcmodel.model.Connection#getStepIn
	 * @model opposite="stepIn"
	 * @generated
	 */
	EList<Connection> getOutgoingConnections();

} // Step
