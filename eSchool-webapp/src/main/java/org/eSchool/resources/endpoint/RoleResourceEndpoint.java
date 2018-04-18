package org.eSchool.resources.endpoint;

import java.util.List;

import javax.ws.rs.core.Response;

import org.eSchool.business.RoleBusinessDelegate;
import org.eSchool.exception.ServiceException;
import org.eSchool.exception.ServiceExceptionDetails;
import org.eSchool.resources.RoleResource;
import org.eSchool.vo.Role;

public class RoleResourceEndpoint extends BaseEndpoint implements RoleResource {

	RoleBusinessDelegate roleBusiness;
	
	public RoleBusinessDelegate getRoleBusiness() {
		return roleBusiness;
	}

	public void setRoleBusiness(RoleBusinessDelegate roleBusiness) {
		this.roleBusiness = roleBusiness;
	}

	@Override
	public Role getRole(int roleId)throws ServiceException {
		Role role=roleBusiness.getRole(roleId);
		if(role==null){
			ServiceExceptionDetails serviceExceptionDetailsArray[] = new ServiceExceptionDetails[1];
			ServiceExceptionDetails exceptionDetails = new ServiceExceptionDetails();
			exceptionDetails.setFaultCode("404");
			exceptionDetails.setFaultMessage("Role Not Found");
			serviceExceptionDetailsArray[0] = exceptionDetails;
			throwException(new ServiceException(serviceExceptionDetailsArray),Response.Status.NOT_FOUND);
			return null;
		}
		return role;
	}

	@Override
	public List<Role> getAllActiveRoles()throws ServiceException {
		List<Role> roles=roleBusiness.getAllActiveRole();
		if(roles==null && roles.isEmpty()){
			ServiceExceptionDetails serviceExceptionDetailsArray[] = new ServiceExceptionDetails[1];
			ServiceExceptionDetails exceptionDetails = new ServiceExceptionDetails();
			exceptionDetails.setFaultCode("404");
			exceptionDetails.setFaultMessage("Role Not Found");
			serviceExceptionDetailsArray[0] = exceptionDetails;
			throwException(new ServiceException(serviceExceptionDetailsArray),Response.Status.NOT_FOUND);
			return null;
		}
		return roles;
	}

	@Override
	public void saveRole(Role role) throws ServiceException {
		
	}

	

}
