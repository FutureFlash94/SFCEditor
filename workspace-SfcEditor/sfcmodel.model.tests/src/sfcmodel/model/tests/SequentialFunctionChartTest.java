/**
 */
package sfcmodel.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sfcmodel.model.SFCFactory;
import sfcmodel.model.SequentialFunctionChart;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequential Function Chart</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequentialFunctionChartTest extends TestCase {

	/**
	 * The fixture for this Sequential Function Chart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialFunctionChart fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequentialFunctionChartTest.class);
	}

	/**
	 * Constructs a new Sequential Function Chart test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialFunctionChartTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sequential Function Chart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SequentialFunctionChart fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sequential Function Chart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialFunctionChart getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SFCFactory.eINSTANCE.createSequentialFunctionChart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SequentialFunctionChartTest
