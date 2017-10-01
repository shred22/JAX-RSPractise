package com.example.customer.resources;

public class AutomaticTypeConversion {

	String name;
	public AutomaticTypeConversion(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public AutomaticTypeConversion valueOf(String str) {
		return new AutomaticTypeConversion(str);
	}
	@Override
	public String toString() {
		return name;
	}
	
	
}

