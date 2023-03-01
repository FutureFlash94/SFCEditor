/**
 */
package sfcmodel.model.impl;

import org.eclipse.draw2d.PolylineConnection;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sfcmodel.model.Action;
import sfcmodel.model.ActionType;
import sfcmodel.model.Connection;
import sfcmodel.model.ConnectionType;
import sfcmodel.model.InitialStep;
import sfcmodel.model.Qualifiers;
import sfcmodel.model.SFCFactory;
import sfcmodel.model.SFCPackage;
import sfcmodel.model.Selection;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.SfcObject;
import sfcmodel.model.Simultaneous;
import sfcmodel.model.Step;
import sfcmodel.model.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SFCPackageImpl extends EPackageImpl implements SFCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialFunctionChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfcObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simultaneousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualifiersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType polylineConnectionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sfcmodel.model.SFCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SFCPackageImpl() {
		super(eNS_URI, SFCFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SFCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SFCPackage init() {
		if (isInited) return (SFCPackage)EPackage.Registry.INSTANCE.getEPackage(SFCPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSFCPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SFCPackageImpl theSFCPackage = registeredSFCPackage instanceof SFCPackageImpl ? (SFCPackageImpl)registeredSFCPackage : new SFCPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSFCPackage.createPackageContents();

		// Initialize created meta-data
		theSFCPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSFCPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SFCPackage.eNS_URI, theSFCPackage);
		return theSFCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequentialFunctionChart() {
		return sequentialFunctionChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequentialFunctionChart_SfcObjects() {
		return (EReference)sequentialFunctionChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequentialFunctionChart_Connections() {
		return (EReference)sequentialFunctionChartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSfcObject() {
		return sfcObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSfcObject_Name() {
		return (EAttribute)sfcObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSfcObject_StartPoint() {
		return (EAttribute)sfcObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSfcObject_EndPoint() {
		return (EAttribute)sfcObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSfcObject_Sfc() {
		return (EReference)sfcObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialStep() {
		return initialStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_X() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_T() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_ConstraintsRectangle() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_IncomingConnections() {
		return (EReference)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_OutgoingConnections() {
		return (EReference)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Qualifier() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_QualifierTime() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_InstructionBlock() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_IndicatorVariable() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_ConstraintsRectangle() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_ActionType() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_IncomingConnections() {
		return (EReference)actionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Condition() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_ConstraintsRectangle() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_IncomingConnections() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_OutgoingConnections() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_StepIn() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_TransitionIn() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_StepOut() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_TransitionOut() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Action() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_ConnectionType() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_PolylineConnection() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_Bendpoints() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Sfc() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelection_UserPriorityEnabled() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelection_UserPriorities() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimultaneous() {
		return simultaneousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQualifiers() {
		return qualifiersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConnectionType() {
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPolylineConnection() {
		return polylineConnectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SFCFactory getSFCFactory() {
		return (SFCFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sequentialFunctionChartEClass = createEClass(SEQUENTIAL_FUNCTION_CHART);
		createEReference(sequentialFunctionChartEClass, SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS);
		createEReference(sequentialFunctionChartEClass, SEQUENTIAL_FUNCTION_CHART__CONNECTIONS);

		sfcObjectEClass = createEClass(SFC_OBJECT);
		createEAttribute(sfcObjectEClass, SFC_OBJECT__NAME);
		createEAttribute(sfcObjectEClass, SFC_OBJECT__START_POINT);
		createEAttribute(sfcObjectEClass, SFC_OBJECT__END_POINT);
		createEReference(sfcObjectEClass, SFC_OBJECT__SFC);

		initialStepEClass = createEClass(INITIAL_STEP);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__X);
		createEAttribute(stepEClass, STEP__T);
		createEAttribute(stepEClass, STEP__CONSTRAINTS_RECTANGLE);
		createEReference(stepEClass, STEP__INCOMING_CONNECTIONS);
		createEReference(stepEClass, STEP__OUTGOING_CONNECTIONS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__QUALIFIER);
		createEAttribute(actionEClass, ACTION__QUALIFIER_TIME);
		createEAttribute(actionEClass, ACTION__INSTRUCTION_BLOCK);
		createEAttribute(actionEClass, ACTION__INDICATOR_VARIABLE);
		createEAttribute(actionEClass, ACTION__CONSTRAINTS_RECTANGLE);
		createEAttribute(actionEClass, ACTION__ACTION_TYPE);
		createEReference(actionEClass, ACTION__INCOMING_CONNECTIONS);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);
		createEAttribute(transitionEClass, TRANSITION__CONSTRAINTS_RECTANGLE);
		createEReference(transitionEClass, TRANSITION__INCOMING_CONNECTIONS);
		createEReference(transitionEClass, TRANSITION__OUTGOING_CONNECTIONS);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__STEP_IN);
		createEReference(connectionEClass, CONNECTION__TRANSITION_IN);
		createEReference(connectionEClass, CONNECTION__STEP_OUT);
		createEReference(connectionEClass, CONNECTION__TRANSITION_OUT);
		createEReference(connectionEClass, CONNECTION__ACTION);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_TYPE);
		createEAttribute(connectionEClass, CONNECTION__POLYLINE_CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__BENDPOINTS);
		createEReference(connectionEClass, CONNECTION__SFC);

		selectionEClass = createEClass(SELECTION);
		createEAttribute(selectionEClass, SELECTION__USER_PRIORITY_ENABLED);
		createEAttribute(selectionEClass, SELECTION__USER_PRIORITIES);

		simultaneousEClass = createEClass(SIMULTANEOUS);

		// Create enums
		qualifiersEEnum = createEEnum(QUALIFIERS);
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
		actionTypeEEnum = createEEnum(ACTION_TYPE);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
		polylineConnectionEDataType = createEDataType(POLYLINE_CONNECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		initialStepEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(this.getSfcObject());
		actionEClass.getESuperTypes().add(this.getSfcObject());
		transitionEClass.getESuperTypes().add(this.getSfcObject());
		selectionEClass.getESuperTypes().add(this.getConnection());
		simultaneousEClass.getESuperTypes().add(this.getConnection());

		// Initialize classes, features, and operations; add parameters
		initEClass(sequentialFunctionChartEClass, SequentialFunctionChart.class, "SequentialFunctionChart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequentialFunctionChart_SfcObjects(), this.getSfcObject(), this.getSfcObject_Sfc(), "sfcObjects", null, 0, -1, SequentialFunctionChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequentialFunctionChart_Connections(), this.getConnection(), this.getConnection_Sfc(), "connections", null, 0, -1, SequentialFunctionChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sfcObjectEClass, SfcObject.class, "SfcObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSfcObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, SfcObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSfcObject_StartPoint(), this.getPoint(), "startPoint", null, 0, 1, SfcObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSfcObject_EndPoint(), this.getPoint(), "endPoint", null, 0, 1, SfcObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSfcObject_Sfc(), this.getSequentialFunctionChart(), this.getSequentialFunctionChart_SfcObjects(), "sfc", null, 0, 1, SfcObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStepEClass, InitialStep.class, "InitialStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_X(), ecorePackage.getEBooleanObject(), "X", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_T(), ecorePackage.getEDoubleObject(), "T", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_ConstraintsRectangle(), this.getRectangle(), "constraintsRectangle", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_IncomingConnections(), this.getConnection(), this.getConnection_StepOut(), "incomingConnections", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_OutgoingConnections(), this.getConnection(), this.getConnection_StepIn(), "outgoingConnections", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Qualifier(), this.getQualifiers(), "qualifier", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAction_QualifierTime(), ecorePackage.getEDouble(), "qualifierTime", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_InstructionBlock(), ecorePackage.getEString(), "instructionBlock", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_IndicatorVariable(), ecorePackage.getEString(), "indicatorVariable", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ConstraintsRectangle(), this.getRectangle(), "constraintsRectangle", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionType(), this.getActionType(), "actionType", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_IncomingConnections(), this.getConnection(), this.getConnection_Action(), "incomingConnections", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ConstraintsRectangle(), this.getRectangle(), "constraintsRectangle", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_IncomingConnections(), this.getConnection(), this.getConnection_TransitionOut(), "incomingConnections", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_OutgoingConnections(), this.getConnection(), this.getConnection_TransitionIn(), "outgoingConnections", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_StepIn(), this.getStep(), this.getStep_OutgoingConnections(), "stepIn", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_TransitionIn(), this.getTransition(), this.getTransition_OutgoingConnections(), "transitionIn", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_StepOut(), this.getStep(), this.getStep_IncomingConnections(), "stepOut", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_TransitionOut(), this.getTransition(), this.getTransition_IncomingConnections(), "transitionOut", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Action(), this.getAction(), this.getAction_IncomingConnections(), "action", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_ConnectionType(), this.getConnectionType(), "connectionType", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_PolylineConnection(), this.getPolylineConnection(), "polylineConnection", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Sfc(), this.getSequentialFunctionChart(), this.getSequentialFunctionChart_Connections(), "sfc", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelection_UserPriorityEnabled(), ecorePackage.getEBooleanObject(), "userPriorityEnabled", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_UserPriorities(), ecorePackage.getELongObject(), "userPriorities", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simultaneousEClass, Simultaneous.class, "Simultaneous", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(qualifiersEEnum, Qualifiers.class, "Qualifiers");
		addEEnumLiteral(qualifiersEEnum, Qualifiers.NONE);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.N);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.R);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.S);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.L);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.D);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.P);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.SD);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.DS);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.SL);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.P1);
		addEEnumLiteral(qualifiersEEnum, Qualifiers.P0);

		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.FROM_STEP_TO_TRANSITION);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.FROM_TRANSITION_TO_STEP);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.FROM_STEP_TO_ACTION);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.NAME);
		addEEnumLiteral(actionTypeEEnum, ActionType.NAME_QUALIFIER);
		addEEnumLiteral(actionTypeEEnum, ActionType.NAME_QUALIFIER_INDICATOR);
		addEEnumLiteral(actionTypeEEnum, ActionType.NAME_QUALIFIER_INDICATOR_INSTRUCTIONS);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(polylineConnectionEDataType, PolylineConnection.class, "PolylineConnection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SFCPackageImpl
