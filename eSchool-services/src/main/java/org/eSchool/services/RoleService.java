package org.eSchool.services;

import java.util.List;

import org.eSchool.model.RoleMaster;

public interface RoleService {
	/**
	 * 
	 * @param roleId
	 * @return
	 */
	RoleMaster getRole(Integer roleId);
	/**
	 * 
	 * @return
	 */
	List<RoleMaster> getAllActiveRoles();
	/**
	 * 
	 * @param roleMaster
	 */
	void saveRole(RoleMaster roleMaster);
	
}
