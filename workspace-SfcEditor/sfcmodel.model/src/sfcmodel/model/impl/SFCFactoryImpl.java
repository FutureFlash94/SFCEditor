/**
 */
package sfcmodel.model.impl;

import org.eclipse.draw2d.PolylineConnection;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sfcmodel.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SFCFactoryImpl extends EFactoryImpl implements SFCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SFCFactory init() {
		try {
			SFCFactory theSFCFactory = (SFCFactory)EPackage.Registry.INSTANCE.getEFactory(SFCPackage.eNS_URI);
			if (theSFCFactory != null) {
				return theSFCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SFCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFCFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SFCPackage.SEQUENTIAL_FUNCTION_CHART: return createSequentialFunctionChart();
			case SFCPackage.SFC_OBJECT: return createSfcObject();
			case SFCPackage.INITIAL_STEP: return createInitialStep();
			case SFCPackage.STEP: return createStep();
			case SFCPackage.ACTION: return createAction();
			case SFCPackage.TRANSITION: return createTransition();
			case SFCPackage.CONNECTION: return createConnection();
			case SFCPackage.SELECTION: return createSelection();
			case SFCPackage.SIMULTANEOUS: return createSimultaneous();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SFCPackage.QUALIFIERS:
				return createQualifiersFromString(eDataType, initialValue);
			case SFCPackage.CONNECTION_TYPE:
				return createConnectionTypeFromString(eDataType, initialValue);
			case SFCPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case SFCPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case SFCPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case SFCPackage.POLYLINE_CONNECTION:
				return createPolylineConnectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SFCPackage.QUALIFIERS:
				return convertQualifiersToString(eDataType, instanceValue);
			case SFCPackage.CONNECTION_TYPE:
				return convertConnectionTypeToString(eDataType, instanceValue);
			case SFCPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case SFCPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case SFCPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case SFCPackage.POLYLINE_CONNECTION:
				return convertPolylineConnectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequentialFunctionChart createSequentialFunctionChart() {
		SequentialFunctionChartImpl sequentialFunctionChart = new SequentialFunctionChartImpl();
		return sequentialFunctionChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SfcObject createSfcObject() {
		SfcObjectImpl sfcObject = new SfcObjectImpl();
		return sfcObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialStep createInitialStep() {
		InitialStepImpl initialStep = new InitialStepImpl();
		return initialStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Simultaneous createSimultaneous() {
		SimultaneousImpl simultaneous = new SimultaneousImpl();
		return simultaneous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualifiers createQualifiersFromString(EDataType eDataType, String initialValue) {
		Qualifiers result = Qualifiers.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualifiersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionType result = ConnectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Create a <code>Rectangle</code> instance from a <code>String</code>. The expected
	 * representation is "x,y,width,height". Illegal representations will return a null
	 * value.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", ""); // Remove all spaces
		String[] values = initialValue.split(",");
		if(values.length != 4) {
			return null;
		}
		 
		Rectangle rect = new Rectangle();
		try {
			rect.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
		    rect.setSize(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
		} catch(NumberFormatException e) {
		    EcorePlugin.INSTANCE.log(e);
		    rect = null;
		}
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Convert a <code>Rectangle</code> to a <code>String</code> representation. The
	 * <code>Rectangle</code> is represented as "x,y,width,height".
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null) {
			return null;
		}
		Rectangle rect = (Rectangle) instanceValue;
		return rect.x+","+rect.y+","+rect.width+","+rect.height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Create a <code>Point</code> instance from a <code>String</code>. The expected
	 * representation is "x,y". Illegal representations will return a null value.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", ""); // Remove all spaces
		String[] values = initialValue.split(",");
		if(values.length != 2) {
			return null;
		}
		
		try {
			return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
		} catch(NumberFormatException e) {
		    EcorePlugin.INSTANCE.log(e);
		    return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Convert a <code>Point</code> to a <code>String</code> representation. The
	 * <code>Point</code> is represented as "x,y".
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null) {
			return null;
		}
		Point p = (Point) instanceValue;
		return p.x+","+p.y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PolylineConnection createPolylineConnectionFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", ""); // Remove all spaces
		String[] values = initialValue.split(",");
		if(values.length != 2) {
			return null;
		}
		
		try {
			PolylineConnection pc = new PolylineConnection();
			pc.setStart(new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1])));
			pc.setEnd(new Point(Integer.parseInt(values[2]), Integer.parseInt(values[3])));
			return pc;
		} catch(NumberFormatException e) {
		    EcorePlugin.INSTANCE.log(e);
		    return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Convert a <code>PolylineConnection</code> to a <code>String</code> representation. The
	 * <code>PolylineConnection</code> is represented as "start.x,start.y,end.x,end.y".
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPolylineConnectionToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null) {
			return null;
		}
		PolylineConnection pc = (PolylineConnection) instanceValue;
		return pc.getStart().x + "," + pc.getStart().y + "," + pc.getEnd().x + "," + pc.getEnd().y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SFCPackage getSFCPackage() {
		return (SFCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SFCPackage getPackage() {
		return SFCPackage.eINSTANCE;
	}

} //SFCFactoryImpl
