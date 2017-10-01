package com.example.customer.resources;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class TypeConverterProvider {

	private final TypeConverter converter = new TypeConverter();
	
	
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		// TODO Auto-generated method stub
		if(rawType.equals(AutomaticTypeConversion.class)){
			return (ParamConverter<T>) converter;
		}
		return (ParamConverter<T>) converter;
	}

}
