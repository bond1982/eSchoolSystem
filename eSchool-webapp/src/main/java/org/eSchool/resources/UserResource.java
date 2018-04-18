package org.eSchool.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eSchool.exception.ServiceException;
import org.eSchool.vo.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("users")
@Api(value = "users" ,description="Operation about User")
public interface UserResource {
	@GET
	@Path("/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@ApiOperation(value = "Find User by ID", notes = "Returns a single User", response = User.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "User not found") })
	User getUser(@PathParam("id") int userId) throws ServiceException;

	@GET
	@Path("/")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@ApiOperation(value = "Get All Users", notes = "Returns all User", response = User.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "User not found") })
	User getAllUser() throws ServiceException;

	@POST
	@Path("/")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@ApiOperation(value = "Add user", notes = "Return added User", response = User.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "User already exists") })
	User addUser(User user) throws ServiceException;

}
