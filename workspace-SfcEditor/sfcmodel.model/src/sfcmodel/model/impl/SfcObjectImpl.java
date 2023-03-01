/**
 */
package sfcmodel.model.impl;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sfcmodel.model.SFCPackage;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.SfcObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sfc Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.impl.SfcObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link sfcmodel.model.impl.SfcObjectImpl#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link sfcmodel.model.impl.SfcObjectImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link sfcmodel.model.impl.SfcObjectImpl#getSfc <em>Sfc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SfcObjectImpl extends MinimalEObjectImpl.Container implements SfcObject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Point START_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected Point startPoint = START_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Point END_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected Point endPoint = END_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SfcObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SFCPackage.Literals.SFC_OBJECT;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.SFC_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getStartPoint() {
		return startPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartPoint(Point newStartPoint) {
		Point oldStartPoint = startPoint;
		startPoint = newStartPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.SFC_OBJECT__START_POINT, oldStartPoint, startPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getEndPoint() {
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndPoint(Point newEndPoint) {
		Point oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.SFC_OBJECT__END_POINT, oldEndPoint, endPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequentialFunctionChart getSfc() {
		if (eContainerFeatureID() != SFCPackage.SFC_OBJECT__SFC) return null;
		return (SequentialFunctionChart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSfc(SequentialFunctionChart newSfc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSfc, SFCPackage.SFC_OBJECT__SFC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSfc(SequentialFunctionChart newSfc) {
		if (newSfc != eInternalContainer() || (eContainerFeatureID() != SFCPackage.SFC_OBJECT__SFC && newSfc != null)) {
			if (EcoreUtil.isAncestor(this, newSfc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSfc != null)
				msgs = ((InternalEObject)newSfc).eInverseAdd(this, SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS, SequentialFunctionChart.class, msgs);
			msgs = basicSetSfc(newSfc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.SFC_OBJECT__SFC, newSfc, newSfc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SFCPackage.SFC_OBJECT__SFC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSfc((SequentialFunctionChart)otherEnd, msgs);
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
			case SFCPackage.SFC_OBJECT__SFC:
				return basicSetSfc(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SFCPackage.SFC_OBJECT__SFC:
				return eInternalContainer().eInverseRemove(this, SFCPackage.SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS, SequentialFunctionChart.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SFCPackage.SFC_OBJECT__NAME:
				return getName();
			case SFCPackage.SFC_OBJECT__START_POINT:
				return getStartPoint();
			case SFCPackage.SFC_OBJECT__END_POINT:
				return getEndPoint();
			case SFCPackage.SFC_OBJECT__SFC:
				return getSfc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SFCPackage.SFC_OBJECT__NAME:
				setName((String)newValue);
				return;
			case SFCPackage.SFC_OBJECT__START_POINT:
				setStartPoint((Point)newValue);
				return;
			case SFCPackage.SFC_OBJECT__END_POINT:
				setEndPoint((Point)newValue);
				return;
			case SFCPackage.SFC_OBJECT__SFC:
				setSfc((SequentialFunctionChart)newValue);
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
			case SFCPackage.SFC_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SFCPackage.SFC_OBJECT__START_POINT:
				setStartPoint(START_POINT_EDEFAULT);
				return;
			case SFCPackage.SFC_OBJECT__END_POINT:
				setEndPoint(END_POINT_EDEFAULT);
				return;
			case SFCPackage.SFC_OBJECT__SFC:
				setSfc((SequentialFunctionChart)null);
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
			case SFCPackage.SFC_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SFCPackage.SFC_OBJECT__START_POINT:
				return START_POINT_EDEFAULT == null ? startPoint != null : !START_POINT_EDEFAULT.equals(startPoint);
			case SFCPackage.SFC_OBJECT__END_POINT:
				return END_POINT_EDEFAULT == null ? endPoint != null : !END_POINT_EDEFAULT.equals(endPoint);
			case SFCPackage.SFC_OBJECT__SFC:
				return getSfc() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", startPoint: ");
		result.append(startPoint);
		result.append(", endPoint: ");
		result.append(endPoint);
		result.append(')');
		return result.toString();
	}

} //SfcObjectImpl
