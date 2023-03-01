/**
 */
package sfcmodel.model.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sfcmodel.model.Connection;
import sfcmodel.model.SFCPackage;
import sfcmodel.model.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sfcmodel.model.impl.TransitionImpl#getConstraintsRectangle <em>Constraints Rectangle</em>}</li>
 *   <li>{@link sfcmodel.model.impl.TransitionImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link sfcmodel.model.impl.TransitionImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends SfcObjectImpl implements Transition {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintsRectangle() <em>Constraints Rectangle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintsRectangle()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_RECTANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintsRectangle() <em>Constraints Rectangle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintsRectangle()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraintsRectangle = CONSTRAINTS_RECTANGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingConnections() <em>Incoming Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> incomingConnections;

	/**
	 * The cached value of the '{@link #getOutgoingConnections() <em>Outgoing Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> outgoingConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SFCPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.TRANSITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rectangle getConstraintsRectangle() {
		return constraintsRectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintsRectangle(Rectangle newConstraintsRectangle) {
		Rectangle oldConstraintsRectangle = constraintsRectangle;
		constraintsRectangle = newConstraintsRectangle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.TRANSITION__CONSTRAINTS_RECTANGLE, oldConstraintsRectangle, constraintsRectangle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncomingConnections() {
		if (incomingConnections == null) {
			incomingConnections = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, SFCPackage.TRANSITION__INCOMING_CONNECTIONS, SFCPackage.CONNECTION__TRANSITION_OUT);
		}
		return incomingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getOutgoingConnections() {
		if (outgoingConnections == null) {
			outgoingConnections = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, SFCPackage.TRANSITION__OUTGOING_CONNECTIONS, SFCPackage.CONNECTION__TRANSITION_IN);
		}
		return outgoingConnections;
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
			case SFCPackage.TRANSITION__INCOMING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnections()).basicAdd(otherEnd, msgs);
			case SFCPackage.TRANSITION__OUTGOING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnections()).basicAdd(otherEnd, msgs);
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
			case SFCPackage.TRANSITION__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
			case SFCPackage.TRANSITION__OUTGOING_CONNECTIONS:
				return ((InternalEList<?>)getOutgoingConnections()).basicRemove(otherEnd, msgs);
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
			case SFCPackage.TRANSITION__CONDITION:
				return getCondition();
			case SFCPackage.TRANSITION__CONSTRAINTS_RECTANGLE:
				return getConstraintsRectangle();
			case SFCPackage.TRANSITION__INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case SFCPackage.TRANSITION__OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
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
			case SFCPackage.TRANSITION__CONDITION:
				setCondition((String)newValue);
				return;
			case SFCPackage.TRANSITION__CONSTRAINTS_RECTANGLE:
				setConstraintsRectangle((Rectangle)newValue);
				return;
			case SFCPackage.TRANSITION__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case SFCPackage.TRANSITION__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				getOutgoingConnections().addAll((Collection<? extends Connection>)newValue);
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
			case SFCPackage.TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case SFCPackage.TRANSITION__CONSTRAINTS_RECTANGLE:
				setConstraintsRectangle(CONSTRAINTS_RECTANGLE_EDEFAULT);
				return;
			case SFCPackage.TRANSITION__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
			case SFCPackage.TRANSITION__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
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
			case SFCPackage.TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case SFCPackage.TRANSITION__CONSTRAINTS_RECTANGLE:
				return CONSTRAINTS_RECTANGLE_EDEFAULT == null ? constraintsRectangle != null : !CONSTRAINTS_RECTANGLE_EDEFAULT.equals(constraintsRectangle);
			case SFCPackage.TRANSITION__INCOMING_CONNECTIONS:
				return incomingConnections != null && !incomingConnections.isEmpty();
			case SFCPackage.TRANSITION__OUTGOING_CONNECTIONS:
				return outgoingConnections != null && !outgoingConnections.isEmpty();
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", constraintsRectangle: ");
		result.append(constraintsRectangle);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
