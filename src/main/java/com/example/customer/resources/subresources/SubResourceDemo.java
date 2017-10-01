package com.example.customer.resources.subresources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/subresource")
public class SubResourceDemo {
	
	/*
	 * Example URL to invoke this Sbresource would be 
	 * http://localhost:8082/JAX-RSPractise/webapi/subresource/shreyas/shred
	 */
	@Path("{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public SubResource getHelloMsgByName(@PathParam("name") String name) {
		return new SubResource();	
	}

}
