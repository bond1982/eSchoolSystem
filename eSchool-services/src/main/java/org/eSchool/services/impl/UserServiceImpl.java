package org.eSchool.services.impl;

import org.eSchool.dataAccess.dao.IUserDAO;
import org.eSchool.services.UserService;

public class UserServiceImpl implements UserService{

	private IUserDAO userDAO;
	public IUserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}




	public org.eSchool.model.User getUser(Integer userID) {
		return  getUserDAO().getUser(userID);
	}

}
