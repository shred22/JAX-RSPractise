package com.example.customer.resources;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

@Path("/customers")
public interface CustomerEndpoint {
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{id}")
	public String getCustomer(int id);
	
	@POST
	@Consumes("application/xml")
	public Response createCustomer(InputStream is);
	
	
	@PUT
	@Path("{id}")
	@Consumes("application/xml")
	public void updateCustomer(int id, InputStream is); */

}
