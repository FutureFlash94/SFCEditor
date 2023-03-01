/**
 */
package sfcmodel.model.impl;

import java.util.Collection;

import org.eclipse.draw2d.PolylineConnection;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import sfcmodel.model.Action;
import sfcmodel.model.Connection;
import sfcmodel.model.ConnectionType;
import sfcmodel.model.SFCPackage;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.Step;
import sfcmodel.model.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getStepIn <em>Step In</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getTransitionIn <em>Transition In</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getStepOut <em>Step Out</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getTransitionOut <em>Transition Out</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getPolylineConnection <em>Polyline Connection</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ConnectionImpl#getSfc <em>Sfc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getStepIn() <em>Step In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepIn()
	 * @generated
	 * @ordered
	 */
	protected Step stepIn;

	/**
	 * The cached value of the '{@link #getTransitionIn() <em>Transition In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionIn()
	 * @generated
	 * @ordered
	 */
	protected Transition transitionIn;

	/**
	 * The cached value of the '{@link #getStepOut() <em>Step Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepOut()
	 * @generated
	 * @ordered
	 */
	protected Step stepOut;

	/**
	 * The cached value of the '{@link #getTransitionOut() <em>Transition Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionOut()
	 * @generated
	 * @ordered
	 */
	protected Transition transitionOut;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionType CONNECTION_TYPE_EDEFAULT = ConnectionType.FROM_STEP_TO_TRANSITION;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType connectionType = CONNECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolylineConnection() <em>Polyline Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolylineConnection()
	 * @generated
	 * @ordered
	 */
	protected static final PolylineConnection POLYLINE_CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolylineConnection() <em>Polyline Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolylineConnection()
	 * @generated
	 * @ordered
	 */
	protected PolylineConnection polylineConnection = POLYLINE_CONNECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> bendpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SFCPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getStepIn() {
		if (stepIn != null && stepIn.eIsProxy()) {
			InternalEObject oldStepIn = (InternalEObject)stepIn;
			stepIn = (Step)eResolveProxy(oldStepIn);
			if (stepIn != oldStepIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SFCPackage.CONNECTION__STEP_IN, oldStepIn, stepIn));
			}
		}
		return stepIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetStepIn() {
		return stepIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepIn(Step newStepIn, NotificationChain msgs) {
		Step oldStepIn = stepIn;
		stepIn = newStepIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__STEP_IN, oldStepIn, newStepIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepIn(Step newStepIn) {
		if (newStepIn != stepIn) {
			NotificationChain msgs = null;
			if (stepIn != null)
				msgs = ((InternalEObject)stepIn).eInverseRemove(this, SFCPackage.STEP__OUTGOING_CONNECTIONS, Step.class, msgs);
			if (newStepIn != null)
				msgs = ((InternalEObject)newStepIn).eInverseAdd(this, SFCPackage.STEP__OUTGOING_CONNECTIONS, Step.class, msgs);
			msgs = basicSetStepIn(newStepIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__STEP_IN, newStepIn, newStepIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getTransitionIn() {
		if (transitionIn != null && transitionIn.eIsProxy()) {
			InternalEObject oldTransitionIn = (InternalEObject)transitionIn;
			transitionIn = (Transition)eResolveProxy(oldTransitionIn);
			if (transitionIn != oldTransitionIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SFCPackage.CONNECTION__TRANSITION_IN, oldTransitionIn, transitionIn));
			}
		}
		return transitionIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransitionIn() {
		return transitionIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionIn(Transition newTransitionIn, NotificationChain msgs) {
		Transition oldTransitionIn = transitionIn;
		transitionIn = newTransitionIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__TRANSITION_IN, oldTransitionIn, newTransitionIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionIn(Transition newTransitionIn) {
		if (newTransitionIn != transitionIn) {
			NotificationChain msgs = null;
			if (transitionIn != null)
				msgs = ((InternalEObject)transitionIn).eInverseRemove(this, SFCPackage.TRANSITION__OUTGOING_CONNECTIONS, Transition.class, msgs);
			if (newTransitionIn != null)
				msgs = ((InternalEObject)newTransitionIn).eInverseAdd(this, SFCPackage.TRANSITION__OUTGOING_CONNECTIONS, Transition.class, msgs);
			msgs = basicSetTransitionIn(newTransitionIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__TRANSITION_IN, newTransitionIn, newTransitionIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getStepOut() {
		if (stepOut != null && stepOut.eIsProxy()) {
			InternalEObject oldStepOut = (InternalEObject)stepOut;
			stepOut = (Step)eResolveProxy(oldStepOut);
			if (stepOut != oldStepOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SFCPackage.CONNECTION__STEP_OUT, oldStepOut, stepOut));
			}
		}
		return stepOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetStepOut() {
		return stepOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepOut(Step newStepOut, NotificationChain msgs) {
		Step oldStepOut = stepOut;
		stepOut = newStepOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__STEP_OUT, oldStepOut, newStepOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepOut(Step newStepOut) {
		if (newStepOut != stepOut) {
			NotificationChain msgs = null;
			if (stepOut != null)
				msgs = ((InternalEObject)stepOut).eInverseRemove(this, SFCPackage.STEP__INCOMING_CONNECTIONS, Step.class, msgs);
			if (newStepOut != null)
				msgs = ((InternalEObject)newStepOut).eInverseAdd(this, SFCPackage.STEP__INCOMING_CONNECTIONS, Step.class, msgs);
			msgs = basicSetStepOut(newStepOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__STEP_OUT, newStepOut, newStepOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getTransitionOut() {
		if (transitionOut != null && transitionOut.eIsProxy()) {
			InternalEObject oldTransitionOut = (InternalEObject)transitionOut;
			transitionOut = (Transition)eResolveProxy(oldTransitionOut);
			if (transitionOut != oldTransitionOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SFCPackage.CONNECTION__TRANSITION_OUT, oldTransitionOut, transitionOut));
			}
		}
		return transitionOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransitionOut() {
		return transitionOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionOut(Transition newTransitionOut, NotificationChain msgs) {
		Transition oldTransitionOut = transitionOut;
		transitionOut = newTransitionOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__TRANSITION_OUT, oldTransitionOut, newTransitionOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionOut(Transition newTransitionOut) {
		if (newTransitionOut != transitionOut) {
			NotificationChain msgs = null;
			if (transitionOut != null)
				msgs = ((InternalEObject)transitionOut).eInverseRemove(this, SFCPackage.TRANSITION__INCOMING_CONNECTIONS, Transition.class, msgs);
			if (newTransitionOut != null)
				msgs = ((InternalEObject)newTransitionOut).eInverseAdd(this, SFCPackage.TRANSITION__INCOMING_CONNECTIONS, Transition.class, msgs);
			msgs = basicSetTransitionOut(newTransitionOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__TRANSITION_OUT, newTransitionOut, newTransitionOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SFCPackage.CONNECTION__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, SFCPackage.ACTION__INCOMING_CONNECTIONS, Action.class, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, SFCPackage.ACTION__INCOMING_CONNECTIONS, Action.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionType getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionType(ConnectionType newConnectionType) {
		ConnectionType oldConnectionType = connectionType;
		connectionType = newConnectionType == null ? CONNECTION_TYPE_EDEFAULT : newConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__CONNECTION_TYPE, oldConnectionType, connectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolylineConnection getPolylineConnection() {
		return polylineConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolylineConnection(PolylineConnection newPolylineConnection) {
		PolylineConnection oldPolylineConnection = polylineConnection;
		polylineConnection = newPolylineConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__POLYLINE_CONNECTION, oldPolylineConnection, polylineConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Point> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, SFCPackage.CONNECTION__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequentialFunctionChart getSfc() {
		if (eContainerFeatureID() != SFCPackage.CONNECTION__SFC) return null;
		return (SequentialFunctionChart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSfc(SequentialFunctionChart newSfc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSfc, SFCPackage.CONNECTION__SFC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSfc(SequentialFunctionChart newSfc) {
		if (newSfc != eInternalContainer() || (eContainerFeatureID() != SFCPackage.CONNECTION__SFC && newSfc != null)) {
			if (EcoreUtil.isAncestor(this, newSfc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSfc != null)
				msgs = ((InternalEObject)newSfc).eInverseAdd(this, SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS, SequentialFunctionChart.class, msgs);
			msgs = basicSetSfc(newSfc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.CONNECTION__SFC, newSfc, newSfc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SFCPackage.CONNECTION__STEP_IN:
				if (stepIn != null)
					msgs = ((InternalEObject)stepIn).eInverseRemove(this, SFCPackage.STEP__OUTGOING_CONNECTIONS, Step.class, msgs);
				return basicSetStepIn((Step)otherEnd, msgs);
			case SFCPackage.CONNECTION__TRANSITION_IN:
				if (transitionIn != null)
					msgs = ((InternalEObject)transitionIn).eInverseRemove(this, SFCPackage.TRANSITION__OUTGOING_CONNECTIONS, Transition.class, msgs);
				return basicSetTransitionIn((Transition)otherEnd, msgs);
			case SFCPackage.CONNECTION__STEP_OUT:
				if (stepOut != null)
					msgs = ((InternalEObject)stepOut).eInverseRemove(this, SFCPackage.STEP__INCOMING_CONNECTIONS, Step.class, msgs);
				return basicSetStepOut((Step)otherEnd, msgs);
			case SFCPackage.CONNECTION__TRANSITION_OUT:
				if (transitionOut != null)
					msgs = ((InternalEObject)transitionOut).eInverseRemove(this, SFCPackage.TRANSITION__INCOMING_CONNECTIONS, Transition.class, msgs);
				return basicSetTransitionOut((Transition)otherEnd, msgs);
			case SFCPackage.CONNECTION__ACTION:
				if (action != null)
					msgs = ((InternalEObject)action).eInverseRemove(this, SFCPackage.ACTION__INCOMING_CONNECTIONS, Action.class, msgs);
				return basicSetAction((Action)otherEnd, msgs);
			case SFCPackage.CONNECTION__SFC:
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
			case SFCPackage.CONNECTION__STEP_IN:
				return basicSetStepIn(null, msgs);
			case SFCPackage.CONNECTION__TRANSITION_IN:
				return basicSetTransitionIn(null, msgs);
			case SFCPackage.CONNECTION__STEP_OUT:
				return basicSetStepOut(null, msgs);
			case SFCPackage.CONNECTION__TRANSITION_OUT:
				return basicSetTransitionOut(null, msgs);
			case SFCPackage.CONNECTION__ACTION:
				return basicSetAction(null, msgs);
			case SFCPackage.CONNECTION__SFC:
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
			case SFCPackage.CONNECTION__SFC:
				return eInternalContainer().eInverseRemove(this, SFCPackage.SEQUENTIAL_FUNCTION_CHART__CONNECTIONS, SequentialFunctionChart.class, msgs);
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
			case SFCPackage.CONNECTION__STEP_IN:
				if (resolve) return getStepIn();
				return basicGetStepIn();
			case SFCPackage.CONNECTION__TRANSITION_IN:
				if (resolve) return getTransitionIn();
				return basicGetTransitionIn();
			case SFCPackage.CONNECTION__STEP_OUT:
				if (resolve) return getStepOut();
				return basicGetStepOut();
			case SFCPackage.CONNECTION__TRANSITION_OUT:
				if (resolve) return getTransitionOut();
				return basicGetTransitionOut();
			case SFCPackage.CONNECTION__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case SFCPackage.CONNECTION__CONNECTION_TYPE:
				return getConnectionType();
			case SFCPackage.CONNECTION__POLYLINE_CONNECTION:
				return getPolylineConnection();
			case SFCPackage.CONNECTION__BENDPOINTS:
				return getBendpoints();
			case SFCPackage.CONNECTION__SFC:
				return getSfc();
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
			case SFCPackage.CONNECTION__STEP_IN:
				setStepIn((Step)newValue);
				return;
			case SFCPackage.CONNECTION__TRANSITION_IN:
				setTransitionIn((Transition)newValue);
				return;
			case SFCPackage.CONNECTION__STEP_OUT:
				setStepOut((Step)newValue);
				return;
			case SFCPackage.CONNECTION__TRANSITION_OUT:
				setTransitionOut((Transition)newValue);
				return;
			case SFCPackage.CONNECTION__ACTION:
				setAction((Action)newValue);
				return;
			case SFCPackage.CONNECTION__CONNECTION_TYPE:
				setConnectionType((ConnectionType)newValue);
				return;
			case SFCPackage.CONNECTION__POLYLINE_CONNECTION:
				setPolylineConnection((PolylineConnection)newValue);
				return;
			case SFCPackage.CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
				return;
			case SFCPackage.CONNECTION__SFC:
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
			case SFCPackage.CONNECTION__STEP_IN:
				setStepIn((Step)null);
				return;
			case SFCPackage.CONNECTION__TRANSITION_IN:
				setTransitionIn((Transition)null);
				return;
			case SFCPackage.CONNECTION__STEP_OUT:
				setStepOut((Step)null);
				return;
			case SFCPackage.CONNECTION__TRANSITION_OUT:
				setTransitionOut((Transition)null);
				return;
			case SFCPackage.CONNECTION__ACTION:
				setAction((Action)null);
				return;
			case SFCPackage.CONNECTION__CONNECTION_TYPE:
				setConnectionType(CONNECTION_TYPE_EDEFAULT);
				return;
			case SFCPackage.CONNECTION__POLYLINE_CONNECTION:
				setPolylineConnection(POLYLINE_CONNECTION_EDEFAULT);
				return;
			case SFCPackage.CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				return;
			case SFCPackage.CONNECTION__SFC:
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
			case SFCPackage.CONNECTION__STEP_IN:
				return stepIn != null;
			case SFCPackage.CONNECTION__TRANSITION_IN:
				return transitionIn != null;
			case SFCPackage.CONNECTION__STEP_OUT:
				return stepOut != null;
			case SFCPackage.CONNECTION__TRANSITION_OUT:
				return transitionOut != null;
			case SFCPackage.CONNECTION__ACTION:
				return action != null;
			case SFCPackage.CONNECTION__CONNECTION_TYPE:
				return connectionType != CONNECTION_TYPE_EDEFAULT;
			case SFCPackage.CONNECTION__POLYLINE_CONNECTION:
				return POLYLINE_CONNECTION_EDEFAULT == null ? polylineConnection != null : !POLYLINE_CONNECTION_EDEFAULT.equals(polylineConnection);
			case SFCPackage.CONNECTION__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case SFCPackage.CONNECTION__SFC:
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
		result.append(" (connectionType: ");
		result.append(connectionType);
		result.append(", polylineConnection: ");
		result.append(polylineConnection);
		result.append(", bendpoints: ");
		result.append(bendpoints);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
