package com.privalia.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Repository - Used to mark a bean as DAO Component on persistence layer
 * @Service - Used to mark a bean as Service Component on business layer
 * @Controller - Used to mark a bean as Controller Component on Presentation Layer
 * @Configuration - Used to mark a bean as Configuration Component.
 * @Component - General purpose annotation, can be used as a replacement for above
 * http://www.baeldung.com/spring-bean-scopes
 * https://www.javatpoint.com/dependency-injection-with-factory-method
 *
 */
public class HelloWorld {
	
	@Autowired
	@Value("Hello World From Annotations!")
	private String hello;

	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}

	/**
	 * @param hello the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public HelloWorld() {
		
	}
	
	public HelloWorld(String hello) {
		this.hello = hello;
	}
}
