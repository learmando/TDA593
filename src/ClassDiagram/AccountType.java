/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.AccountType#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getAccountType()
 * @model
 * @generated
 */
public interface AccountType extends EObject {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute list.
	 * The list contents are of type {@link ClassDiagram.Permission}.
	 * The literals are from the enumeration {@link ClassDiagram.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute list.
	 * @see ClassDiagram.Permission
	 * @see ClassDiagram.ClassDiagramPackage#getAccountType_Permissions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pRequired="true" pOrdered="false"
	 * @generated
	 */
	void addPermission(Permission p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pRequired="true" pOrdered="false"
	 * @generated
	 */
	void removePermission(Permission p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" pRequired="true" pOrdered="false"
	 * @generated
	 */
	boolean hasPermission(Permission p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" pMany="true" pOrdered="false"
	 * @generated
	 */
	boolean hasPermissions(EList<Permission> p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearPermissions();

} // AccountType
