package org.eSchool.services.impl;

import java.util.List;

import org.eSchool.dataAccess.dao.IRoleDAO;
import org.eSchool.model.RoleMaster;
import org.eSchool.services.RoleService;

public class RoleServiceImpl implements RoleService {

	private IRoleDAO roleDAO;
	
	public IRoleDAO getRoleDAO() {
		return roleDAO;
	}

	public void setRoleDAO(IRoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	public RoleMaster getRole(Integer roleId) {
		RoleMaster roleMaster=null;
		if(null!=roleId){
			roleMaster=	roleDAO.getRole(roleId);
		}
		return roleMaster;
	}

	public List<RoleMaster> getAllActiveRoles() {
		return roleDAO.getAllRoles();
	}

	public void saveRole(RoleMaster roleMaster) {
		// TODO Auto-generated method stub
		
	}

}
