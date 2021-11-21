/**
 */
package sfcmodel.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sfcmodel.model.SFCFactory;
import sfcmodel.model.SfcObject;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sfc Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SfcObjectTest extends TestCase {

	/**
	 * The fixture for this Sfc Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SfcObject fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SfcObjectTest.class);
	}

	/**
	 * Constructs a new Sfc Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SfcObjectTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sfc Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SfcObject fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sfc Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SfcObject getFixture() {
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
		setFixture(SFCFactory.eINSTANCE.createSfcObject());
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

} //SfcObjectTest
