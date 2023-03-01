/**
 */
package sfcmodel.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sfcmodel.model.Connection;
import sfcmodel.model.SFCPackage;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.SfcObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Function Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.impl.SequentialFunctionChartImpl#getSfcObjects <em>Sfc Objects</em>}</li>
 *   <li>{@link sfcmodel.model.impl.SequentialFunctionChartImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequentialFunctionChartImpl extends MinimalEObjectImpl.Container implements SequentialFunctionChart {
	/**
	 * The cached value of the '{@link #getSfcObjects() <em>Sfc Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfcObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<SfcObject> sfcObjects;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialFunctionChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SFCPackage.Literals.SEQUENTIAL_FUNCTION_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SfcObject> getSfcObjects() {
		if (sfcObjects == null) {
			sfcObjects = new EObjectContainmentWithInverseEList<SfcObject>(SfcObject.class, this, SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS, SFCPackage.SFC_OBJECT__SFC);
		}
		return sfcObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS, SFCPackage.CONNECTION__SFC);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSfcObjects()).basicAdd(otherEnd, msgs);
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS:
				return ((InternalEList<?>)getSfcObjects()).basicRemove(otherEnd, msgs);
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS:
				return getSfcObjects();
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS:
				return getConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS:
				getSfcObjects().clear();
				getSfcObjects().addAll((Collection<? extends SfcObject>)newValue);
				return;
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS:
				getSfcObjects().clear();
				return;
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS:
				getConnections().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS:
				return sfcObjects != null && !sfcObjects.isEmpty();
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS:
				return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequentialFunctionChartImpl
