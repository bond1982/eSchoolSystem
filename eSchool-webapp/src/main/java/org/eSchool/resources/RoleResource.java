package org.eSchool.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eSchool.exception.ServiceException;
import org.eSchool.vo.Role;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/roles")
@Api(value = "/roles" ,description="Operations about Role")

public interface RoleResource {
	@GET
	@Path("/")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@ApiOperation(value = "Get all active Roles deatils", 
	    notes = "Returns all Role", 
	    response = Role.class)
	 @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
	 @ApiResponse(code = 404, message = "Role not found") })
	List<Role> getAllActiveRoles()throws ServiceException;
	
	@GET
	@Path("/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@ApiOperation(value = "Find Roles by ID", 
	    notes = "Returns a single Role", 
	    response = Role.class)
	 @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
	 @ApiResponse(code = 404, message = "Role not found") })
	Role getRole(@PathParam("id") int roleId) throws ServiceException;
	
	@POST
	@Path("/")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@ApiOperation(value = "Save Role", 
	    notes = "Save a Role Details	", 
	    response = Role.class)
	 @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
	 @ApiResponse(code = 404, message = "Role not found") })
	void saveRole(Role role) throws ServiceException;
	
}
