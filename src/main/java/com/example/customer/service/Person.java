package com.example.customer.service;

import javax.ws.rs.QueryParam;

public class Person {
	
	@QueryParam("fname")
	private String fname;
	@QueryParam("lname")
	private String lname;
	
	
	
	
	
	/*public Person(String fname) {
		super();
		this.fname = fname;
	}*/
	
	public Person() {
		super();
	}
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	/*public static Person valueOf(String fname){
		return new Person(fname);
	}
	*/
	@Override
	public String toString(){
		return this.fname;
	}
	

}
