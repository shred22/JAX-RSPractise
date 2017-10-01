package com.example.customer.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

@Path("/uriInfoDemo")
public class UriInfoResourceDemo {

	@GET
	@Path("/getPath/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPathDemo(@PathParam("id") AutomaticTypeConversion id, @Context UriInfo uriInfo) {
		List<PathSegment> pathSegments = uriInfo.getPathSegments();
		
		MultivaluedMap<String, String> pathParameters = uriInfo.getPathParameters();
		System.out.println(pathParameters);
		System.out.println(pathSegments);
		return "Path : "+uriInfo.getPath()+"\n"
				+ "BaseUri: "+uriInfo.getBaseUri()+"\n"
						+"Request URI : "+uriInfo.getRequestUri().toString()+"\n"
						+"Automatic conversion : "+id;
	}
	
	@POST
	@Path("/passByteArray")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPathDemo(byte[] bytes) {
		
		String str = new String(bytes);
		return "Received Message : "+str;
	}
	
}
