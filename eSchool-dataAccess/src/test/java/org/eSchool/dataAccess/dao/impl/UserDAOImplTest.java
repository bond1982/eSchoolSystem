package org.eSchool.dataAccess.dao.impl;

import org.eSchool.dataAccess.dao.IUserDAO;
import org.eSchool.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/org/eSchool/dataAccess/config/spring_dataaccess.xml")
public class UserDAOImplTest {

	@Autowired
	private IUserDAO userDAO;
	
	@Test
	public void saveUserTest(){
		User user= new User();
		user.setId(1L);
		user.setFirstName("Shivanand");
		user.setMiddleName("Basavaraj");
		user.setLastName("Mutnale");
		userDAO.saveUser(user);
	}
}
