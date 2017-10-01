package com.example.customer.resources;

import javax.ws.rs.ext.ParamConverter;

public class TypeConverter implements ParamConverter<AutomaticTypeConversion> {

	@Override
	public AutomaticTypeConversion fromString(String value) {
		// TODO Auto-generated method stub
		return new AutomaticTypeConversion(value);
	}

	@Override
	public String toString(AutomaticTypeConversion value) {
		// TODO Auto-generated method stub
		return value.toString();
	}

}
