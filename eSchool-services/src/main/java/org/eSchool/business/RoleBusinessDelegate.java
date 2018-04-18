package org.eSchool.business;

import java.util.List;

import org.eSchool.vo.Role;

public interface RoleBusinessDelegate {
	/**
	 * 
	 * @param roleId
	 * @return
	 */
	Role getRole(Integer roleId);
	/**
	 * 
	 * @return
	 */
	List<Role> getAllActiveRole();
	/**
	 * 
	 * @param role
	 */
	void saveRole(Role role);
}
