/**
 */
package sfcmodel.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sfcmodel.model.Selection#getUserPriorityEnabled <em>User Priority Enabled</em>}</li>
 *   <li>{@link sfcmodel.model.Selection#getUserPriorities <em>User Priorities</em>}</li>
 * </ul>
 *
 * @see sfcmodel.model.SFCPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends Connection {
	/**
	 * Returns the value of the '<em><b>User Priority Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Priority Enabled</em>' attribute.
	 * @see #setUserPriorityEnabled(Boolean)
	 * @see sfcmodel.model.SFCPackage#getSelection_UserPriorityEnabled()
	 * @model
	 * @generated
	 */
	Boolean getUserPriorityEnabled();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Selection#getUserPriorityEnabled <em>User Priority Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Priority Enabled</em>' attribute.
	 * @see #getUserPriorityEnabled()
	 * @generated
	 */
	void setUserPriorityEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>User Priorities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Priorities</em>' attribute.
	 * @see #setUserPriorities(Long)
	 * @see sfcmodel.model.SFCPackage#getSelection_UserPriorities()
	 * @model
	 * @generated
	 */
	Long getUserPriorities();

	/**
	 * Sets the value of the '{@link sfcmodel.model.Selection#getUserPriorities <em>User Priorities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Priorities</em>' attribute.
	 * @see #getUserPriorities()
	 * @generated
	 */
	void setUserPriorities(Long value);

} // Selection
