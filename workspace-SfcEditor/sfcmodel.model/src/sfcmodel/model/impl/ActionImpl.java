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

import sfcmodel.model.Action;
import sfcmodel.model.ActionType;
import sfcmodel.model.Connection;
import sfcmodel.model.Qualifiers;
import sfcmodel.model.SFCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.impl.ActionImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ActionImpl#getQualifierTime <em>Qualifier Time</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ActionImpl#getInstructionBlock <em>Instruction Block</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ActionImpl#getIndicatorVariable <em>Indicator Variable</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ActionImpl#getConstraintsRectangle <em>Constraints Rectangle</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ActionImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link sfcmodel.model.impl.ActionImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends SfcObjectImpl implements Action {
	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final Qualifiers QUALIFIER_EDEFAULT = Qualifiers.NONE;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected Qualifiers qualifier = QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifierTime() <em>Qualifier Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierTime()
	 * @generated
	 * @ordered
	 */
	protected static final double QUALIFIER_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQualifierTime() <em>Qualifier Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierTime()
	 * @generated
	 * @ordered
	 */
	protected double qualifierTime = QUALIFIER_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructionBlock() <em>Instruction Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTION_BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructionBlock() <em>Instruction Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionBlock()
	 * @generated
	 * @ordered
	 */
	protected String instructionBlock = INSTRUCTION_BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndicatorVariable() <em>Indicator Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatorVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATOR_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicatorVariable() <em>Indicator Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatorVariable()
	 * @generated
	 * @ordered
	 */
	protected String indicatorVariable = INDICATOR_VARIABLE_EDEFAULT;

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
	 * The default value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTION_TYPE_EDEFAULT = ActionType.NAME;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected ActionType actionType = ACTION_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SFCPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qualifiers getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifier(Qualifiers newQualifier) {
		Qualifiers oldQualifier = qualifier;
		qualifier = newQualifier == null ? QUALIFIER_EDEFAULT : newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.ACTION__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getQualifierTime() {
		return qualifierTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifierTime(double newQualifierTime) {
		double oldQualifierTime = qualifierTime;
		qualifierTime = newQualifierTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.ACTION__QUALIFIER_TIME, oldQualifierTime, qualifierTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstructionBlock() {
		return instructionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructionBlock(String newInstructionBlock) {
		String oldInstructionBlock = instructionBlock;
		instructionBlock = newInstructionBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.ACTION__INSTRUCTION_BLOCK, oldInstructionBlock, instructionBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndicatorVariable() {
		return indicatorVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndicatorVariable(String newIndicatorVariable) {
		String oldIndicatorVariable = indicatorVariable;
		indicatorVariable = newIndicatorVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.ACTION__INDICATOR_VARIABLE, oldIndicatorVariable, indicatorVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.ACTION__CONSTRAINTS_RECTANGLE, oldConstraintsRectangle, constraintsRectangle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionType getActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionType(ActionType newActionType) {
		ActionType oldActionType = actionType;
		actionType = newActionType == null ? ACTION_TYPE_EDEFAULT : newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SFCPackage.ACTION__ACTION_TYPE, oldActionType, actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncomingConnections() {
		if (incomingConnections == null) {
			incomingConnections = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, SFCPackage.ACTION__INCOMING_CONNECTIONS, SFCPackage.CONNECTION__ACTION);
		}
		return incomingConnections;
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
			case SFCPackage.ACTION__INCOMING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnections()).basicAdd(otherEnd, msgs);
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
			case SFCPackage.ACTION__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
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
			case SFCPackage.ACTION__QUALIFIER:
				return getQualifier();
			case SFCPackage.ACTION__QUALIFIER_TIME:
				return getQualifierTime();
			case SFCPackage.ACTION__INSTRUCTION_BLOCK:
				return getInstructionBlock();
			case SFCPackage.ACTION__INDICATOR_VARIABLE:
				return getIndicatorVariable();
			case SFCPackage.ACTION__CONSTRAINTS_RECTANGLE:
				return getConstraintsRectangle();
			case SFCPackage.ACTION__ACTION_TYPE:
				return getActionType();
			case SFCPackage.ACTION__INCOMING_CONNECTIONS:
				return getIncomingConnections();
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
			case SFCPackage.ACTION__QUALIFIER:
				setQualifier((Qualifiers)newValue);
				return;
			case SFCPackage.ACTION__QUALIFIER_TIME:
				setQualifierTime((Double)newValue);
				return;
			case SFCPackage.ACTION__INSTRUCTION_BLOCK:
				setInstructionBlock((String)newValue);
				return;
			case SFCPackage.ACTION__INDICATOR_VARIABLE:
				setIndicatorVariable((String)newValue);
				return;
			case SFCPackage.ACTION__CONSTRAINTS_RECTANGLE:
				setConstraintsRectangle((Rectangle)newValue);
				return;
			case SFCPackage.ACTION__ACTION_TYPE:
				setActionType((ActionType)newValue);
				return;
			case SFCPackage.ACTION__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Connection>)newValue);
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
			case SFCPackage.ACTION__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
				return;
			case SFCPackage.ACTION__QUALIFIER_TIME:
				setQualifierTime(QUALIFIER_TIME_EDEFAULT);
				return;
			case SFCPackage.ACTION__INSTRUCTION_BLOCK:
				setInstructionBlock(INSTRUCTION_BLOCK_EDEFAULT);
				return;
			case SFCPackage.ACTION__INDICATOR_VARIABLE:
				setIndicatorVariable(INDICATOR_VARIABLE_EDEFAULT);
				return;
			case SFCPackage.ACTION__CONSTRAINTS_RECTANGLE:
				setConstraintsRectangle(CONSTRAINTS_RECTANGLE_EDEFAULT);
				return;
			case SFCPackage.ACTION__ACTION_TYPE:
				setActionType(ACTION_TYPE_EDEFAULT);
				return;
			case SFCPackage.ACTION__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
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
			case SFCPackage.ACTION__QUALIFIER:
				return qualifier != QUALIFIER_EDEFAULT;
			case SFCPackage.ACTION__QUALIFIER_TIME:
				return qualifierTime != QUALIFIER_TIME_EDEFAULT;
			case SFCPackage.ACTION__INSTRUCTION_BLOCK:
				return INSTRUCTION_BLOCK_EDEFAULT == null ? instructionBlock != null : !INSTRUCTION_BLOCK_EDEFAULT.equals(instructionBlock);
			case SFCPackage.ACTION__INDICATOR_VARIABLE:
				return INDICATOR_VARIABLE_EDEFAULT == null ? indicatorVariable != null : !INDICATOR_VARIABLE_EDEFAULT.equals(indicatorVariable);
			case SFCPackage.ACTION__CONSTRAINTS_RECTANGLE:
				return CONSTRAINTS_RECTANGLE_EDEFAULT == null ? constraintsRectangle != null : !CONSTRAINTS_RECTANGLE_EDEFAULT.equals(constraintsRectangle);
			case SFCPackage.ACTION__ACTION_TYPE:
				return actionType != ACTION_TYPE_EDEFAULT;
			case SFCPackage.ACTION__INCOMING_CONNECTIONS:
				return incomingConnections != null && !incomingConnections.isEmpty();
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
		result.append(" (qualifier: ");
		result.append(qualifier);
		result.append(", qualifierTime: ");
		result.append(qualifierTime);
		result.append(", instructionBlock: ");
		result.append(instructionBlock);
		result.append(", indicatorVariable: ");
		result.append(indicatorVariable);
		result.append(", constraintsRectangle: ");
		result.append(constraintsRectangle);
		result.append(", actionType: ");
		result.append(actionType);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
