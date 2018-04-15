package org.eSchool.dataAccess.dao;

import java.util.List;

import org.eSchool.model.RoleMaster;

public interface IRoleDAO {
	/**
	 * Get all roles
	 * @return
	 */
	List<RoleMaster> getAllRoles();
	/**
	 * Get role
	 * @param roleId
	 * @return role
	 */
	RoleMaster getRole(Integer roleId);
	/**
	 * Save role
	 * @param roleMaster
	 */
	void saveRole(RoleMaster roleMaster);
	
}
