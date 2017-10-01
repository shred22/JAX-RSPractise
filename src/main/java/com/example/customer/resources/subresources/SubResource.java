package com.example.customer.resources.subresources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public class SubResource {

	
	@GET
	@Path("{fname}")
	public String sayHelloByName(@PathParam("fname") String fname) {
		return "Hey there .!! Hello ,"+fname;
	}
	
}
