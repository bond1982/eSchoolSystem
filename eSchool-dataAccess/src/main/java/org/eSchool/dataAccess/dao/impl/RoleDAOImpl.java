package org.eSchool.dataAccess.dao.impl;

import java.util.List;

import org.eSchool.dataAccess.dao.IRoleDAO;
import org.eSchool.model.RoleMaster;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;

public class RoleDAOImpl extends BaseDAOImpl implements IRoleDAO {

	public List<RoleMaster> getAllRoles() {
		DetachedCriteria criteria=  DetachedCriteria.forClass(RoleMaster.class);
		List<RoleMaster> roleMasters=(List<RoleMaster>) getHibernateTemplate().findByCriteria(criteria);
		return roleMasters;
	}

	public RoleMaster getRole(Integer roleId) {
		return getHibernateTemplate().get(RoleMaster.class, roleId);
	}

	public void saveRole(RoleMaster roleMaster) {
		if(null!=roleMaster){
			getHibernateTemplate().save(roleMaster);
		}
	}
	
}
