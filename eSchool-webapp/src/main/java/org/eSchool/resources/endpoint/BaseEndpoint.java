package org.eSchool.resources.endpoint;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.eSchool.exception.ServiceException;

public class BaseEndpoint {

	public static void throwException(ServiceException serviceException,Status status) throws ServiceException {
		ResponseBuilder builder = Response.status(status);
		builder.type("application/json");
		builder.entity(serviceException.getFaultDetails());
		throw new WebApplicationException(builder.build());
	}

}
