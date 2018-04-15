package org.eSchool.dataAccess.dao.impl;

import java.util.List;

import org.eSchool.dataAccess.dao.IUserDAO;
import org.eSchool.model.User;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class UserDAOImpl extends HibernateDaoSupport implements IUserDAO {

	public void saveUser(User user) {
		if (null != user) {
			getHibernateTemplate().save(user);
		}
	}

	public User listUser() {
		return getHibernateTemplate().get(User.class, 1l);
	}

	public User getUser(Integer userID) {
		User user= null;
		if (null != userID) {
			user=getHibernateTemplate().get(User.class, Long.valueOf(userID));
		}
		return user;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
