package org.eSchool.business.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eSchool.business.RoleBusinessDelegate;
import org.eSchool.model.RoleMaster;
import org.eSchool.services.RoleService;
import org.eSchool.vo.Role;

public class RoleBusinessDelegateImpl implements RoleBusinessDelegate {

	private RoleService roleService;

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public Role getRole(Integer roleId) {
		Role role = null;
		if (null != roleId) {
			RoleMaster roleMaster = roleService.getRole(roleId);
			if (null != roleMaster) {
				role = convertRoleVo(roleMaster);
			}
		}
		return role;
	}

	private Role convertRoleVo(RoleMaster roleMaster) {
		Role role = null;
		if (null != roleMaster) {
			role = new Role();
			if (null != roleMaster.getId()) {
				role.setRoleId(BigInteger.valueOf(roleMaster.getId()));
			}
			if (null != roleMaster.getRoleName()) {
				role.setRoleName(roleMaster.getRoleName());
			}
			if (null != roleMaster.getRoleDescription()) {
				role.setRoleDescription(roleMaster.getRoleDescription());
			}
		}
		return role;
	}

	public List<Role> getAllActiveRole() {
		List<Role> roles = null;
		List<RoleMaster> roleMasters = roleService.getAllActiveRoles();
		if (null != roleMasters && !roleMasters.isEmpty()) {
			roles = new ArrayList<Role>();
			for (RoleMaster roleMaster : roleMasters) {
				Role role = convertRoleVo(roleMaster);
				roles.add(role);
			}
		}
		return roles;
	}

	public void saveRole(Role role) {
		// TODO Auto-generated method stub

	}

}
