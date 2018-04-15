package org.eSchool.dataAccess.dao;

import java.util.List;

import org.eSchool.model.User;

public interface IUserDAO {
	
	User getUser(Integer userID);
	
	List<User> getAllUsers();
	
	void saveUser(User user);
	User listUser();
}
