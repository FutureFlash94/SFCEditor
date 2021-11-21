/**
 */
package sfcmodel.model.tests;

import junit.textui.TestRunner;

import sfcmodel.model.SFCFactory;
import sfcmodel.model.Simultaneous;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simultaneous</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimultaneousTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimultaneousTest.class);
	}

	/**
	 * Constructs a new Simultaneous test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimultaneousTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simultaneous test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Simultaneous getFixture() {
		return (Simultaneous)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SFCFactory.eINSTANCE.createSimultaneous());
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

} //SimultaneousTest
