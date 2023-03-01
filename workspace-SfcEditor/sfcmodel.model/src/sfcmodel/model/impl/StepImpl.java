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
import sfcmodel.model.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.impl.StepImpl#getX <em>X</em>}</li>
 *   <li>{@link sfcmodel.model.impl.StepImpl#getT <em>T</em>}</li>
 *   <li>{@link sfcmodel.model.impl.StepImpl#getConstraintsRectangle <em>Constraints Rectangle</em>}</li>
 *   <li>{@link sfcmodel.model.impl.StepImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link sfcmodel.model.impl.StepImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends SfcObjectImpl implements Step {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Boolean x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getT() <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected static final Double T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected Double t = T_EDEFAULT;

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
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SFCPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(Boolean newX) {
		Boolean oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.STEP__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getT() {
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setT(Double newT) {
		Double oldT = t;
		t = newT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.STEP__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.STEP__CONSTRAINTS_RECTANGLE, oldConstraintsRectangle, constraintsRectangle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncomingConnections() {
		if (incomingConnections == null) {
			incomingConnections = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, SFCPackage.STEP__INCOMING_CONNECTIONS, SFCPackage.CONNECTION__STEP_OUT);
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
			outgoingConnections = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, SFCPackage.STEP__OUTGOING_CONNECTIONS, SFCPackage.CONNECTION__STEP_IN);
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
			case SFCPackage.STEP__INCOMING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnections()).basicAdd(otherEnd, msgs);
			case SFCPackage.STEP__OUTGOING_CONNECTIONS:
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
			case SFCPackage.STEP__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
			case SFCPackage.STEP__OUTGOING_CONNECTIONS:
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
			case SFCPackage.STEP__X:
				return getX();
			case SFCPackage.STEP__T:
				return getT();
			case SFCPackage.STEP__CONSTRAINTS_RECTANGLE:
				return getConstraintsRectangle();
			case SFCPackage.STEP__INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case SFCPackage.STEP__OUTGOING_CONNECTIONS:
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
			case SFCPackage.STEP__X:
				setX((Boolean)newValue);
				return;
			case SFCPackage.STEP__T:
				setT((Double)newValue);
				return;
			case SFCPackage.STEP__CONSTRAINTS_RECTANGLE:
				setConstraintsRectangle((Rectangle)newValue);
				return;
			case SFCPackage.STEP__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case SFCPackage.STEP__OUTGOING_CONNECTIONS:
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
			case SFCPackage.STEP__X:
				setX(X_EDEFAULT);
				return;
			case SFCPackage.STEP__T:
				setT(T_EDEFAULT);
				return;
			case SFCPackage.STEP__CONSTRAINTS_RECTANGLE:
				setConstraintsRectangle(CONSTRAINTS_RECTANGLE_EDEFAULT);
				return;
			case SFCPackage.STEP__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
			case SFCPackage.STEP__OUTGOING_CONNECTIONS:
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
			case SFCPackage.STEP__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case SFCPackage.STEP__T:
				return T_EDEFAULT == null ? t != null : !T_EDEFAULT.equals(t);
			case SFCPackage.STEP__CONSTRAINTS_RECTANGLE:
				return CONSTRAINTS_RECTANGLE_EDEFAULT == null ? constraintsRectangle != null : !CONSTRAINTS_RECTANGLE_EDEFAULT.equals(constraintsRectangle);
			case SFCPackage.STEP__INCOMING_CONNECTIONS:
				return incomingConnections != null && !incomingConnections.isEmpty();
			case SFCPackage.STEP__OUTGOING_CONNECTIONS:
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
		result.append(" (X: ");
		result.append(x);
		result.append(", T: ");
		result.append(t);
		result.append(", constraintsRectangle: ");
		result.append(constraintsRectangle);
		result.append(')');
		return result.toString();
	}

} //StepImpl
