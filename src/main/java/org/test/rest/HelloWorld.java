package org.test.rest;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@SessionScoped
@Path("/test")
public class HelloWorld implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int i = 0;

	@GET
	@Path("/hello")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response hello() {
		return Response.ok(new Message("Hello")).build();
	}

	@GET
	@Path("/inc")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response inc() {
		return Response.ok(new Message(Integer.toString(i++))).build();
	}
}
