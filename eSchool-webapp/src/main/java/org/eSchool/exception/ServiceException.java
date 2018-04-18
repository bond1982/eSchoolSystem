package org.eSchool.exception;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ServiceException")
public class ServiceException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ServiceExceptionDetails faultDetails[];

	public ServiceException(ServiceExceptionDetails faultDetails[]) {
		this.faultDetails = faultDetails;
	}

	public ServiceException(String message, ServiceExceptionDetails faultDetails[]) {
		super(message);
		this.faultDetails = faultDetails;
	}

	public ServiceExceptionDetails[] getFaultDetails() {
		return faultDetails;
	}

}
