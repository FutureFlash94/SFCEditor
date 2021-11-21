/**
 */
package sfcmodel.model.tests;

import junit.textui.TestRunner;

import sfcmodel.model.InitialStep;
import sfcmodel.model.SFCFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initial Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitialStepTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitialStepTest.class);
	}

	/**
	 * Constructs a new Initial Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initial Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InitialStep getFixture() {
		return (InitialStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SFCFactory.eINSTANCE.createInitialStep());
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

} //InitialStepTest
