/**
 */
package sfcmodel.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sfcmodel.model.SFCFactory
 * @model kind="package"
 * @generated
 */
public interface SFCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sfcmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.tuwien.ac.at/e1425203/SfcEditor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sfcmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SFCPackage eINSTANCE = sfcmodel.model.impl.SFCPackageImpl.init();

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.SequentialFunctionChartImpl <em>Sequential Function Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.SequentialFunctionChartImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getSequentialFunctionChart()
	 * @generated
	 */
	int SEQUENTIAL_FUNCTION_CHART = 0;

	/**
	 * The feature id for the '<em><b>Sfc Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_FUNCTION_CHART__CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Sequential Function Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_FUNCTION_CHART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sequential Function Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_FUNCTION_CHART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.SfcObjectImpl <em>Sfc Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.SfcObjectImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getSfcObject()
	 * @generated
	 */
	int SFC_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_OBJECT__START_POINT = 1;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_OBJECT__END_POINT = 2;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_OBJECT__SFC = 3;

	/**
	 * The number of structural features of the '<em>Sfc Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sfc Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.StepImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = SFC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__START_POINT = SFC_OBJECT__START_POINT;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__END_POINT = SFC_OBJECT__END_POINT;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SFC = SFC_OBJECT__SFC;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__X = SFC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__T = SFC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints Rectangle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CONSTRAINTS_RECTANGLE = SFC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INCOMING_CONNECTIONS = SFC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTGOING_CONNECTIONS = SFC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = SFC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = SFC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.InitialStepImpl <em>Initial Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.InitialStepImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getInitialStep()
	 * @generated
	 */
	int INITIAL_STEP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__START_POINT = STEP__START_POINT;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__END_POINT = STEP__END_POINT;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__SFC = STEP__SFC;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__X = STEP__X;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__T = STEP__T;

	/**
	 * The feature id for the '<em><b>Constraints Rectangle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__CONSTRAINTS_RECTANGLE = STEP__CONSTRAINTS_RECTANGLE;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__INCOMING_CONNECTIONS = STEP__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP__OUTGOING_CONNECTIONS = STEP__OUTGOING_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Initial Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.ActionImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = SFC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__START_POINT = SFC_OBJECT__START_POINT;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_POINT = SFC_OBJECT__END_POINT;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SFC = SFC_OBJECT__SFC;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__QUALIFIER = SFC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__QUALIFIER_TIME = SFC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instruction Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INSTRUCTION_BLOCK = SFC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indicator Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INDICATOR_VARIABLE = SFC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints Rectangle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONSTRAINTS_RECTANGLE = SFC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_TYPE = SFC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING_CONNECTIONS = SFC_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = SFC_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = SFC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.TransitionImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = SFC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__START_POINT = SFC_OBJECT__START_POINT;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__END_POINT = SFC_OBJECT__END_POINT;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SFC = SFC_OBJECT__SFC;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = SFC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints Rectangle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONSTRAINTS_RECTANGLE = SFC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INCOMING_CONNECTIONS = SFC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTGOING_CONNECTIONS = SFC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = SFC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = SFC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.ConnectionImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Step In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STEP_IN = 0;

	/**
	 * The feature id for the '<em><b>Transition In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TRANSITION_IN = 1;

	/**
	 * The feature id for the '<em><b>Step Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STEP_OUT = 2;

	/**
	 * The feature id for the '<em><b>Transition Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TRANSITION_OUT = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ACTION = 4;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Polyline Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__POLYLINE_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BENDPOINTS = 7;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SFC = 8;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.SelectionImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 7;

	/**
	 * The feature id for the '<em><b>Step In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__STEP_IN = CONNECTION__STEP_IN;

	/**
	 * The feature id for the '<em><b>Transition In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__TRANSITION_IN = CONNECTION__TRANSITION_IN;

	/**
	 * The feature id for the '<em><b>Step Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__STEP_OUT = CONNECTION__STEP_OUT;

	/**
	 * The feature id for the '<em><b>Transition Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__TRANSITION_OUT = CONNECTION__TRANSITION_OUT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ACTION = CONNECTION__ACTION;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__CONNECTION_TYPE = CONNECTION__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Polyline Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__POLYLINE_CONNECTION = CONNECTION__POLYLINE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__BENDPOINTS = CONNECTION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SFC = CONNECTION__SFC;

	/**
	 * The feature id for the '<em><b>User Priority Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__USER_PRIORITY_ENABLED = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Priorities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__USER_PRIORITIES = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.impl.SimultaneousImpl <em>Simultaneous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.impl.SimultaneousImpl
	 * @see sfcmodel.model.impl.SFCPackageImpl#getSimultaneous()
	 * @generated
	 */
	int SIMULTANEOUS = 8;

	/**
	 * The feature id for the '<em><b>Step In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__STEP_IN = CONNECTION__STEP_IN;

	/**
	 * The feature id for the '<em><b>Transition In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__TRANSITION_IN = CONNECTION__TRANSITION_IN;

	/**
	 * The feature id for the '<em><b>Step Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__STEP_OUT = CONNECTION__STEP_OUT;

	/**
	 * The feature id for the '<em><b>Transition Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__TRANSITION_OUT = CONNECTION__TRANSITION_OUT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__ACTION = CONNECTION__ACTION;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__CONNECTION_TYPE = CONNECTION__CONNECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Polyline Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__POLYLINE_CONNECTION = CONNECTION__POLYLINE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__BENDPOINTS = CONNECTION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS__SFC = CONNECTION__SFC;

	/**
	 * The number of structural features of the '<em>Simultaneous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simultaneous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sfcmodel.model.Qualifiers <em>Qualifiers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.Qualifiers
	 * @see sfcmodel.model.impl.SFCPackageImpl#getQualifiers()
	 * @generated
	 */
	int QUALIFIERS = 9;

	/**
	 * The meta object id for the '{@link sfcmodel.model.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.ConnectionType
	 * @see sfcmodel.model.impl.SFCPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 10;

	/**
	 * The meta object id for the '{@link sfcmodel.model.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sfcmodel.model.ActionType
	 * @see sfcmodel.model.impl.SFCPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 11;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see sfcmodel.model.impl.SFCPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 12;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see sfcmodel.model.impl.SFCPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 13;

	/**
	 * The meta object id for the '<em>Polyline Connection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.PolylineConnection
	 * @see sfcmodel.model.impl.SFCPackageImpl#getPolylineConnection()
	 * @generated
	 */
	int POLYLINE_CONNECTION = 14;


	/**
	 * Returns the meta object for class '{@link sfcmodel.model.SequentialFunctionChart <em>Sequential Function Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Function Chart</em>'.
	 * @see sfcmodel.model.SequentialFunctionChart
	 * @generated
	 */
	EClass getSequentialFunctionChart();

	/**
	 * Returns the meta object for the containment reference list '{@link sfcmodel.model.SequentialFunctionChart#getSfcObjects <em>Sfc Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sfc Objects</em>'.
	 * @see sfcmodel.model.SequentialFunctionChart#getSfcObjects()
	 * @see #getSequentialFunctionChart()
	 * @generated
	 */
	EReference getSequentialFunctionChart_SfcObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link sfcmodel.model.SequentialFunctionChart#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see sfcmodel.model.SequentialFunctionChart#getConnections()
	 * @see #getSequentialFunctionChart()
	 * @generated
	 */
	EReference getSequentialFunctionChart_Connections();

	/**
	 * Returns the meta object for class '{@link sfcmodel.model.SfcObject <em>Sfc Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sfc Object</em>'.
	 * @see sfcmodel.model.SfcObject
	 * @generated
	 */
	EClass getSfcObject();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.SfcObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sfcmodel.model.SfcObject#getName()
	 * @see #getSfcObject()
	 * @generated
	 */
	EAttribute getSfcObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.SfcObject#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Point</em>'.
	 * @see sfcmodel.model.SfcObject#getStartPoint()
	 * @see #getSfcObject()
	 * @generated
	 */
	EAttribute getSfcObject_StartPoint();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.SfcObject#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see sfcmodel.model.SfcObject#getEndPoint()
	 * @see #getSfcObject()
	 * @generated
	 */
	EAttribute getSfcObject_EndPoint();

	/**
	 * Returns the meta object for the container reference '{@link sfcmodel.model.SfcObject#getSfc <em>Sfc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sfc</em>'.
	 * @see sfcmodel.model.SfcObject#getSfc()
	 * @see #getSfcObject()
	 * @generated
	 */
	EReference getSfcObject_Sfc();

	/**
	 * Returns the meta object for class '{@link sfcmodel.model.InitialStep <em>Initial Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Step</em>'.
	 * @see sfcmodel.model.InitialStep
	 * @generated
	 */
	EClass getInitialStep();

	/**
	 * Returns the meta object for class '{@link sfcmodel.model.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see sfcmodel.model.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Step#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see sfcmodel.model.Step#getX()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_X();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Step#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>T</em>'.
	 * @see sfcmodel.model.Step#getT()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_T();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Step#getConstraintsRectangle <em>Constraints Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints Rectangle</em>'.
	 * @see sfcmodel.model.Step#getConstraintsRectangle()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_ConstraintsRectangle();

	/**
	 * Returns the meta object for the reference list '{@link sfcmodel.model.Step#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Connections</em>'.
	 * @see sfcmodel.model.Step#getIncomingConnections()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_IncomingConnections();

	/**
	 * Returns the meta object for the reference list '{@link sfcmodel.model.Step#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Connections</em>'.
	 * @see sfcmodel.model.Step#getOutgoingConnections()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_OutgoingConnections();

	/**
	 * Returns the meta object for class '{@link sfcmodel.model.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see sfcmodel.model.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Action#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see sfcmodel.model.Action#getQualifier()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Action#getQualifierTime <em>Qualifier Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Time</em>'.
	 * @see sfcmodel.model.Action#getQualifierTime()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_QualifierTime();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Action#getInstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction Block</em>'.
	 * @see sfcmodel.model.Action#getInstructionBlock()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_InstructionBlock();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Action#getIndicatorVariable <em>Indicator Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Variable</em>'.
	 * @see sfcmodel.model.Action#getIndicatorVariable()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_IndicatorVariable();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Action#getConstraintsRectangle <em>Constraints Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints Rectangle</em>'.
	 * @see sfcmodel.model.Action#getConstraintsRectangle()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ConstraintsRectangle();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Action#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see sfcmodel.model.Action#getActionType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionType();

	/**
	 * Returns the meta object for the reference list '{@link sfcmodel.model.Action#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Connections</em>'.
	 * @see sfcmodel.model.Action#getIncomingConnections()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_IncomingConnections();

	/**
	 * Returns the meta object for class '{@link sfcmodel.model.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see sfcmodel.model.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see sfcmodel.model.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Transition#getConstraintsRectangle <em>Constraints Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints Rectangle</em>'.
	 * @see sfcmodel.model.Transition#getConstraintsRectangle()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ConstraintsRectangle();

	/**
	 * Returns the meta object for the reference list '{@link sfcmodel.model.Transition#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Connections</em>'.
	 * @see sfcmodel.model.Transition#getIncomingConnections()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_IncomingConnections();

	/**
	 * Returns the meta object for the reference list '{@link sfcmodel.model.Transition#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Connections</em>'.
	 * @see sfcmodel.model.Transition#getOutgoingConnections()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OutgoingConnections();

	/**
	 * Returns the meta object for class '{@link sfcmodel.model.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see sfcmodel.model.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link sfcmodel.model.Connection#getStepIn <em>Step In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step In</em>'.
	 * @see sfcmodel.model.Connection#getStepIn()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_StepIn();

	/**
	 * Returns the meta object for the reference '{@link sfcmodel.model.Connection#getTransitionIn <em>Transition In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition In</em>'.
	 * @see sfcmodel.model.Connection#getTransitionIn()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TransitionIn();

	/**
	 * Returns the meta object for the reference '{@link sfcmodel.model.Connection#getStepOut <em>Step Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step Out</em>'.
	 * @see sfcmodel.model.Connection#getStepOut()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_StepOut();

	/**
	 * Returns the meta object for the reference '{@link sfcmodel.model.Connection#getTransitionOut <em>Transition Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition Out</em>'.
	 * @see sfcmodel.model.Connection#getTransitionOut()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TransitionOut();

	/**
	 * Returns the meta object for the reference '{@link sfcmodel.model.Connection#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see sfcmodel.model.Connection#getAction()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Action();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Connection#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see sfcmodel.model.Connection#getConnectionType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Connection#getPolylineConnection <em>Polyline Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polyline Connection</em>'.
	 * @see sfcmodel.model.Connection#getPolylineConnection()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_PolylineConnection();

	/**
	 * Returns the meta object for the attribute list '{@link sfcmodel.model.Connection#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see sfcmodel.model.Connection#getBendpoints()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Bendpoints();

	/**
	 * Returns the meta object for the container reference '{@link sfcmodel.model.Connection#getSfc <em>Sfc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sfc</em>'.
	 * @see sfcmodel.model.Connection#getSfc()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Sfc();

	/**
	 * Returns the meta object for class '{@link sfcmodel.model.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see sfcmodel.model.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Selection#getUserPriorityEnabled <em>User Priority Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Priority Enabled</em>'.
	 * @see sfcmodel.model.Selection#getUserPriorityEnabled()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_UserPriorityEnabled();

	/**
	 * Returns the meta object for the attribute '{@link sfcmodel.model.Selection#getUserPriorities <em>User Priorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Priorities</em>'.
	 * @see sfcmodel.model.Selection#getUserPriorities()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_UserPriorities();

	/**
	 * Returns the meta object for class '{@link sfcmodel.model.Simultaneous <em>Simultaneous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simultaneous</em>'.
	 * @see sfcmodel.model.Simultaneous
	 * @generated
	 */
	EClass getSimultaneous();

	/**
	 * Returns the meta object for enum '{@link sfcmodel.model.Qualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualifiers</em>'.
	 * @see sfcmodel.model.Qualifiers
	 * @generated
	 */
	EEnum getQualifiers();

	/**
	 * Returns the meta object for enum '{@link sfcmodel.model.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see sfcmodel.model.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the meta object for enum '{@link sfcmodel.model.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see sfcmodel.model.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.PolylineConnection <em>Polyline Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Polyline Connection</em>'.
	 * @see org.eclipse.draw2d.PolylineConnection
	 * @model instanceClass="org.eclipse.draw2d.PolylineConnection"
	 * @generated
	 */
	EDataType getPolylineConnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SFCFactory getSFCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.SequentialFunctionChartImpl <em>Sequential Function Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.SequentialFunctionChartImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getSequentialFunctionChart()
		 * @generated
		 */
		EClass SEQUENTIAL_FUNCTION_CHART = eINSTANCE.getSequentialFunctionChart();

		/**
		 * The meta object literal for the '<em><b>Sfc Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_FUNCTION_CHART__SFC_OBJECTS = eINSTANCE.getSequentialFunctionChart_SfcObjects();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_FUNCTION_CHART__CONNECTIONS = eINSTANCE.getSequentialFunctionChart_Connections();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.SfcObjectImpl <em>Sfc Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.SfcObjectImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getSfcObject()
		 * @generated
		 */
		EClass SFC_OBJECT = eINSTANCE.getSfcObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFC_OBJECT__NAME = eINSTANCE.getSfcObject_Name();

		/**
		 * The meta object literal for the '<em><b>Start Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFC_OBJECT__START_POINT = eINSTANCE.getSfcObject_StartPoint();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFC_OBJECT__END_POINT = eINSTANCE.getSfcObject_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Sfc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFC_OBJECT__SFC = eINSTANCE.getSfcObject_Sfc();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.InitialStepImpl <em>Initial Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.InitialStepImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getInitialStep()
		 * @generated
		 */
		EClass INITIAL_STEP = eINSTANCE.getInitialStep();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.StepImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__X = eINSTANCE.getStep_X();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__T = eINSTANCE.getStep_T();

		/**
		 * The meta object literal for the '<em><b>Constraints Rectangle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__CONSTRAINTS_RECTANGLE = eINSTANCE.getStep_ConstraintsRectangle();

		/**
		 * The meta object literal for the '<em><b>Incoming Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INCOMING_CONNECTIONS = eINSTANCE.getStep_IncomingConnections();

		/**
		 * The meta object literal for the '<em><b>Outgoing Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTGOING_CONNECTIONS = eINSTANCE.getStep_OutgoingConnections();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.ActionImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__QUALIFIER = eINSTANCE.getAction_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Qualifier Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__QUALIFIER_TIME = eINSTANCE.getAction_QualifierTime();

		/**
		 * The meta object literal for the '<em><b>Instruction Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__INSTRUCTION_BLOCK = eINSTANCE.getAction_InstructionBlock();

		/**
		 * The meta object literal for the '<em><b>Indicator Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__INDICATOR_VARIABLE = eINSTANCE.getAction_IndicatorVariable();

		/**
		 * The meta object literal for the '<em><b>Constraints Rectangle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CONSTRAINTS_RECTANGLE = eINSTANCE.getAction_ConstraintsRectangle();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_TYPE = eINSTANCE.getAction_ActionType();

		/**
		 * The meta object literal for the '<em><b>Incoming Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INCOMING_CONNECTIONS = eINSTANCE.getAction_IncomingConnections();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.TransitionImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Constraints Rectangle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONSTRAINTS_RECTANGLE = eINSTANCE.getTransition_ConstraintsRectangle();

		/**
		 * The meta object literal for the '<em><b>Incoming Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INCOMING_CONNECTIONS = eINSTANCE.getTransition_IncomingConnections();

		/**
		 * The meta object literal for the '<em><b>Outgoing Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTGOING_CONNECTIONS = eINSTANCE.getTransition_OutgoingConnections();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.ConnectionImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Step In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__STEP_IN = eINSTANCE.getConnection_StepIn();

		/**
		 * The meta object literal for the '<em><b>Transition In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TRANSITION_IN = eINSTANCE.getConnection_TransitionIn();

		/**
		 * The meta object literal for the '<em><b>Step Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__STEP_OUT = eINSTANCE.getConnection_StepOut();

		/**
		 * The meta object literal for the '<em><b>Transition Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TRANSITION_OUT = eINSTANCE.getConnection_TransitionOut();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ACTION = eINSTANCE.getConnection_Action();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_TYPE = eINSTANCE.getConnection_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Polyline Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__POLYLINE_CONNECTION = eINSTANCE.getConnection_PolylineConnection();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__BENDPOINTS = eINSTANCE.getConnection_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Sfc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SFC = eINSTANCE.getConnection_Sfc();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.SelectionImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>User Priority Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__USER_PRIORITY_ENABLED = eINSTANCE.getSelection_UserPriorityEnabled();

		/**
		 * The meta object literal for the '<em><b>User Priorities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__USER_PRIORITIES = eINSTANCE.getSelection_UserPriorities();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.impl.SimultaneousImpl <em>Simultaneous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.impl.SimultaneousImpl
		 * @see sfcmodel.model.impl.SFCPackageImpl#getSimultaneous()
		 * @generated
		 */
		EClass SIMULTANEOUS = eINSTANCE.getSimultaneous();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.Qualifiers <em>Qualifiers</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.Qualifiers
		 * @see sfcmodel.model.impl.SFCPackageImpl#getQualifiers()
		 * @generated
		 */
		EEnum QUALIFIERS = eINSTANCE.getQualifiers();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.ConnectionType
		 * @see sfcmodel.model.impl.SFCPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link sfcmodel.model.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sfcmodel.model.ActionType
		 * @see sfcmodel.model.impl.SFCPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see sfcmodel.model.impl.SFCPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see sfcmodel.model.impl.SFCPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Polyline Connection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.PolylineConnection
		 * @see sfcmodel.model.impl.SFCPackageImpl#getPolylineConnection()
		 * @generated
		 */
		EDataType POLYLINE_CONNECTION = eINSTANCE.getPolylineConnection();

	}

} //SFCPackage
