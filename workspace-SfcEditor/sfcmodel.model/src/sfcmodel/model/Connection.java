/**
 */
package sfcmodel.model;

import org.eclipse.draw2d.PolylineConnection;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.Connection#getStepIn <em>Step In</em>}</li>
 *   <li>{@link sfcmodel.model.Connection#getTransitionIn <em>Transition In</em>}</li>
 *   <li>{@link sfcmodel.model.Connection#getStepOut <em>Step Out</em>}</li>
 *   <li>{@link sfcmodel.model.Connection#getTransitionOut <em>Transition Out</em>}</li>
 *   <li>{@link sfcmodel.model.Connection#getAction <em>Action</em>}</li>
 *   <li>{@link sfcmodel.model.Connection#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link sfcmodel.model.Connection#getPolylineConnection <em>Polyline Connection</em>}</li>
 *   <li>{@link sfcmodel.model.Connection#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link sfcmodel.model.Connection#getSfc <em>Sfc</em>}</li>
 * </ul>
 *
 * @see sfcmodel.model.SFCPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Step In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Step#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step In</em>' reference.
	 * @see #setStepIn(Step)
	 * @see sfcmodel.model.SFCPackage#getConnection_StepIn()
	 * @see sfcmodel.model.Step#getOutgoingConnections
	 * @model opposite="outgoingConnections"
	 * @generated
	 */
	Step getStepIn();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Connection#getStepIn <em>Step In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step In</em>' reference.
	 * @see #getStepIn()
	 * @generated
	 */
	void setStepIn(Step value);

	/**
	 * Returns the value of the '<em><b>Transition In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Transition#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition In</em>' reference.
	 * @see #setTransitionIn(Transition)
	 * @see sfcmodel.model.SFCPackage#getConnection_TransitionIn()
	 * @see sfcmodel.model.Transition#getOutgoingConnections
	 * @model opposite="outgoingConnections"
	 * @generated
	 */
	Transition getTransitionIn();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Connection#getTransitionIn <em>Transition In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition In</em>' reference.
	 * @see #getTransitionIn()
	 * @generated
	 */
	void setTransitionIn(Transition value);

	/**
	 * Returns the value of the '<em><b>Step Out</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Step#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Out</em>' reference.
	 * @see #setStepOut(Step)
	 * @see sfcmodel.model.SFCPackage#getConnection_StepOut()
	 * @see sfcmodel.model.Step#getIncomingConnections
	 * @model opposite="incomingConnections"
	 * @generated
	 */
	Step getStepOut();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Connection#getStepOut <em>Step Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Out</em>' reference.
	 * @see #getStepOut()
	 * @generated
	 */
	void setStepOut(Step value);

	/**
	 * Returns the value of the '<em><b>Transition Out</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Transition#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Out</em>' reference.
	 * @see #setTransitionOut(Transition)
	 * @see sfcmodel.model.SFCPackage#getConnection_TransitionOut()
	 * @see sfcmodel.model.Transition#getIncomingConnections
	 * @model opposite="incomingConnections"
	 * @generated
	 */
	Transition getTransitionOut();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Connection#getTransitionOut <em>Transition Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Out</em>' reference.
	 * @see #getTransitionOut()
	 * @generated
	 */
	void setTransitionOut(Transition value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Action#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see sfcmodel.model.SFCPackage#getConnection_Action()
	 * @see sfcmodel.model.Action#getIncomingConnections
	 * @model opposite="incomingConnections"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Connection#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sfcmodel.model.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see sfcmodel.model.ConnectionType
	 * @see #setConnectionType(ConnectionType)
	 * @see sfcmodel.model.SFCPackage#getConnection_ConnectionType()
	 * @model
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Connection#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see sfcmodel.model.ConnectionType
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Polyline Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline Connection</em>' attribute.
	 * @see #setPolylineConnection(PolylineConnection)
	 * @see sfcmodel.model.SFCPackage#getConnection_PolylineConnection()
	 * @model dataType="sfcmodel.model.PolylineConnection"
	 * @generated
	 */
	PolylineConnection getPolylineConnection();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Connection#getPolylineConnection <em>Polyline Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polyline Connection</em>' attribute.
	 * @see #getPolylineConnection()
	 * @generated
	 */
	void setPolylineConnection(PolylineConnection value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see sfcmodel.model.SFCPackage#getConnection_Bendpoints()
	 * @model dataType="sfcmodel.model.Point"
	 * @generated
	 */
	EList<Point> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Sfc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.SequentialFunctionChart#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sfc</em>' container reference.
	 * @see #setSfc(SequentialFunctionChart)
	 * @see sfcmodel.model.SFCPackage#getConnection_Sfc()
	 * @see sfcmodel.model.SequentialFunctionChart#getConnections
	 * @model opposite="connections" transient="false"
	 * @generated
	 */
	SequentialFunctionChart getSfc();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Connection#getSfc <em>Sfc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sfc</em>' container reference.
	 * @see #getSfc()
	 * @generated
	 */
	void setSfc(SequentialFunctionChart value);

} // Connection
