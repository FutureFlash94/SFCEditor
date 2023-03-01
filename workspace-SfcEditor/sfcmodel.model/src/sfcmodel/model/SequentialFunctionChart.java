/**
 */
package sfcmodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Function Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.SequentialFunctionChart#getSfcObjects <em>Sfc Objects</em>}</li>
 *   <li>{@link sfcmodel.model.SequentialFunctionChart#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see sfcmodel.model.SFCPackage#getSequentialFunctionChart()
 * @model
 * @generated
 */
public interface SequentialFunctionChart extends EObject {
	/**
	 * Returns the value of the '<em><b>Sfc Objects</b></em>' containment reference list.
	 * The list contents are of type {@link sfcmodel.model.SfcObject}.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.SfcObject#getSfc <em>Sfc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sfc Objects</em>' containment reference list.
	 * @see sfcmodel.model.SFCPackage#getSequentialFunctionChart_SfcObjects()
	 * @see sfcmodel.model.SfcObject#getSfc
	 * @model opposite="sfc" containment="true"
	 * @generated
	 */
	EList<SfcObject> getSfcObjects();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link sfcmodel.model.Connection}.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.Connection#getSfc <em>Sfc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see sfcmodel.model.SFCPackage#getSequentialFunctionChart_Connections()
	 * @see sfcmodel.model.Connection#getSfc
	 * @model opposite="sfc" containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // SequentialFunctionChart
