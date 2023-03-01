/**
 */
package sfcmodel.model;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sfc Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.SfcObject#getName <em>Name</em>}</li>
 *   <li>{@link sfcmodel.model.SfcObject#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link sfcmodel.model.SfcObject#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link sfcmodel.model.SfcObject#getSfc <em>Sfc</em>}</li>
 * </ul>
 *
 * @see sfcmodel.model.SFCPackage#getSfcObject()
 * @model
 * @generated
 */
public interface SfcObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sfcmodel.model.SFCPackage#getSfcObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sfcmodel.model.SfcObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point</em>' attribute.
	 * @see #setStartPoint(Point)
	 * @see sfcmodel.model.SFCPackage#getSfcObject_StartPoint()
	 * @model dataType="sfcmodel.model.Point"
	 * @generated
	 */
	Point getStartPoint();

	/**
	 * Sets the value of the '{@link sfcmodel.model.SfcObject#getStartPoint <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point</em>' attribute.
	 * @see #getStartPoint()
	 * @generated
	 */
	void setStartPoint(Point value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(Point)
	 * @see sfcmodel.model.SFCPackage#getSfcObject_EndPoint()
	 * @model dataType="sfcmodel.model.Point"
	 * @generated
	 */
	Point getEndPoint();

	/**
	 * Sets the value of the '{@link sfcmodel.model.SfcObject#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Sfc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sfcmodel.model.SequentialFunctionChart#getSfcObjects <em>Sfc Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sfc</em>' container reference.
	 * @see #setSfc(SequentialFunctionChart)
	 * @see sfcmodel.model.SFCPackage#getSfcObject_Sfc()
	 * @see sfcmodel.model.SequentialFunctionChart#getSfcObjects
	 * @model opposite="sfcObjects" transient="false"
	 * @generated
	 */
	SequentialFunctionChart getSfc();

	/**
	 * Sets the value of the '{@link sfcmodel.model.SfcObject#getSfc <em>Sfc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sfc</em>' container reference.
	 * @see #getSfc()
	 * @generated
	 */
	void setSfc(SequentialFunctionChart value);

} // SfcObject
