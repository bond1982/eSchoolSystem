package org.eSchool.exception;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ServiceExceptionDetails")
public class ServiceExceptionDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String faultCode;
	private String faultMessage;

	public ServiceExceptionDetails() {
	}

	public String getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}

	public String getFaultMessage() {
		return faultMessage;
	}

	public void setFaultMessage(String faultMessage) {
		this.faultMessage = faultMessage;
	}

}