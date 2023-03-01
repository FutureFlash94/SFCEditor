/**
 */
package sfcmodel.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sfcmodel.model.SFCPackage;
import sfcmodel.model.Selection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.impl.SelectionImpl#getUserPriorityEnabled <em>User Priority Enabled</em>}</li>
 *   <li>{@link sfcmodel.model.impl.SelectionImpl#getUserPriorities <em>User Priorities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionImpl extends ConnectionImpl implements Selection {
	/**
	 * The default value of the '{@link #getUserPriorityEnabled() <em>User Priority Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPriorityEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USER_PRIORITY_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPriorityEnabled() <em>User Priority Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPriorityEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean userPriorityEnabled = USER_PRIORITY_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserPriorities() <em>User Priorities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPriorities()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_PRIORITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPriorities() <em>User Priorities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPriorities()
	 * @generated
	 * @ordered
	 */
	protected Long userPriorities = USER_PRIORITIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SFCPackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUserPriorityEnabled() {
		return userPriorityEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPriorityEnabled(Boolean newUserPriorityEnabled) {
		Boolean oldUserPriorityEnabled = userPriorityEnabled;
		userPriorityEnabled = newUserPriorityEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.SELECTION__USER_PRIORITY_ENABLED, oldUserPriorityEnabled, userPriorityEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserPriorities() {
		return userPriorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPriorities(Long newUserPriorities) {
		Long oldUserPriorities = userPriorities;
		userPriorities = newUserPriorities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.SELECTION__USER_PRIORITIES, oldUserPriorities, userPriorities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SFCPackage.SELECTION__USER_PRIORITY_ENABLED:
				return getUserPriorityEnabled();
			case SFCPackage.SELECTION__USER_PRIORITIES:
				return getUserPriorities();
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
			case SFCPackage.SELECTION__USER_PRIORITY_ENABLED:
				setUserPriorityEnabled((Boolean)newValue);
				return;
			case SFCPackage.SELECTION__USER_PRIORITIES:
				setUserPriorities((Long)newValue);
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
			case SFCPackage.SELECTION__USER_PRIORITY_ENABLED:
				setUserPriorityEnabled(USER_PRIORITY_ENABLED_EDEFAULT);
				return;
			case SFCPackage.SELECTION__USER_PRIORITIES:
				setUserPriorities(USER_PRIORITIES_EDEFAULT);
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
			case SFCPackage.SELECTION__USER_PRIORITY_ENABLED:
				return USER_PRIORITY_ENABLED_EDEFAULT == null ? userPriorityEnabled != null : !USER_PRIORITY_ENABLED_EDEFAULT.equals(userPriorityEnabled);
			case SFCPackage.SELECTION__USER_PRIORITIES:
				return USER_PRIORITIES_EDEFAULT == null ? userPriorities != null : !USER_PRIORITIES_EDEFAULT.equals(userPriorities);
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
		result.append(" (userPriorityEnabled: ");
		result.append(userPriorityEnabled);
		result.append(", userPriorities: ");
		result.append(userPriorities);
		result.append(')');
		return result.toString();
	}

} //SelectionImpl
