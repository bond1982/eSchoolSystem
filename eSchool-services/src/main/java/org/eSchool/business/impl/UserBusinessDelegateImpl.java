package org.eSchool.business.impl;

import java.math.BigInteger;

import org.eSchool.business.UserBusinessDelegate;
import org.eSchool.services.UserService;
import org.eSchool.vo.Gender;
import org.eSchool.vo.User;

public class UserBusinessDelegateImpl implements UserBusinessDelegate {

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser(Integer userId) {
		User userVO = null;
		if (null != userId) {
			org.eSchool.model.User user = userService.getUser(userId);
			userVO = convertToUserVO(userVO, user);
		}
		return userVO;
	}

	private User convertToUserVO(User userVO, org.eSchool.model.User user) {
		if (null != user) {
			userVO =new User();
			if(null!=user.getId()){
				userVO.setId(BigInteger.valueOf(user.getId()));
			}
			if(null!=user.getFirstName()){
				userVO.setFirstName(user.getFirstName());
			}
			if(null!=user.getMiddleName()){
				userVO.setMiddleName(user.getMiddleName());
			}
			if(null!=user.getLastName()){
				userVO.setLastName(user.getLastName());
			}
			if(null!=user.getUserName()){
				userVO.setUserName(user.getUserName());
			}
			if(null!=user.getPassword()){
				userVO.setPassword(user.getPassword());
			}
			if(null!=user.getEmailAddress()){
				userVO.setEmailAddress(user.getEmailAddress());
				
			}
			if(null!=user.getGender()){
				Gender gender=Gender.valueOf(user.getGender());
				userVO.setGender(gender);
			}
		}
		return userVO;
	}

}
