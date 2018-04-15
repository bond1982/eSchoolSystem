package org.eSchool.dataAccess.dao.impl;

import java.util.List;

import org.eSchool.dataAccess.dao.IRoleDAO;
import org.eSchool.model.RoleMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/org/eSchool/dataAccess/config/spring_dataaccess.xml")
public class RoleMasterImplTest {

	@Autowired
	private IRoleDAO roleDAO;
	
	@Test
	public void testSaveRole(){
		RoleMaster master= new RoleMaster();
		master.setId(21);
		master.setRoleName("admimn");
		master.setRoleDescription("sdfjsjdjfdsk");
		roleDAO.saveRole(master);
	}
	@Test
	public void getRole(){
		RoleMaster master=roleDAO.getRole(1);
		System.out.println("Role Id : "+master.getId());
	}
	
	@Test
	public void testGetAllRoles(){
		List<RoleMaster> allRoles=roleDAO.getAllRoles();
		if(null!=allRoles && !allRoles.isEmpty()){
			System.out.println("Size :"+allRoles.size());
		}
	}
}
