package com.example.customer.service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class PersonConverterProvider  {

	private final PersonConverter converter = new PersonConverter();

	public <T> ParamConverter<Person> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		if(!rawType.equals(Person.class))
			return null;
		return converter;
	}

}
