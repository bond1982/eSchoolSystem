package org.eSchool.resources.endpoint;

import javax.ws.rs.core.Response;

import org.eSchool.business.UserBusinessDelegate;
import org.eSchool.exception.ServiceException;
import org.eSchool.exception.ServiceExceptionDetails;
import org.eSchool.resources.UserResource;
import org.eSchool.vo.User;

public class UserResourceEndpoint extends BaseEndpoint implements UserResource {

	private UserBusinessDelegate userBusiness;

	public UserBusinessDelegate getUserBusiness() {
		return userBusiness;
	}

	public void setUserBusiness(UserBusinessDelegate userBusiness) {
		this.userBusiness = userBusiness;
	}

	/**
	 * 
	 */
	public User getUser(int userId) throws ServiceException {
		User user = userBusiness.getUser(userId);
		if (null == user) {
			ServiceExceptionDetails serviceExceptionDetailsArray[] = new ServiceExceptionDetails[1];
			ServiceExceptionDetails exceptionDetails = new ServiceExceptionDetails();
			exceptionDetails.setFaultCode("404");
			exceptionDetails.setFaultMessage("User Not Found");
			serviceExceptionDetailsArray[0] = exceptionDetails;
			throwException(new ServiceException(serviceExceptionDetailsArray),Response.Status.NOT_FOUND);
			return null;
		}
		return user;
	}

	@Override
	public User getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User user) throws ServiceException {
		// TODO Auto-generated method stub
		System.out.println("Add User");
		return null;
	}

	}
