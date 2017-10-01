package com.example.customer.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.example.customer.service.Person;

@Path("/paramDemo")
public class ParamDemo {

	
/*	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/queryParam")
	public String getQueryParam(@QueryParam("start")String start) {
		return "QueryParam : "+start;
	}	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/matrixParam")
	public String getMatrixParam(@MatrixParam("matrix")String matrixParam) {
		return "MatrixParam : "+matrixParam;
	}	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/headerParam")
	public String getHeaderParam(@HeaderParam("header")String headerParam) {
		return "HeaderParam : "+headerParam;
	}	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/cookieParam")
	public String getCookieParam(@CookieParam("cookie")String cookieParam) {
		return "CookieParam : "+cookieParam;
	}	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/beanParam")
	public String getBeanParam(@BeanParam Person person) {
		return "Person Details : "+person.getFname()+" "+person.getLname();
	}	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/contextParam")
	public String getContextParam(@Context UriInfo uriInfo) {
		return "Context param : "+uriInfo.getPath();
	}	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/convert/{customClassParam}")
	public String getConvertedCustomClassParam(@PathParam("customClassParam")Person person){
		return "Hello "+person.toString();
	}
*/}
