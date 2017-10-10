package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.privalia.entity.Address;

public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		annotationContext.scan("com.privalia.entity.annotations");
		annotationContext.refresh();
		
		Student student = (Student) annotationContext.getBean("Student");
		
		System.out.println(student.getIdStudent());
		System.out.println(student.getName());
		System.out.println(student.getSurname());
		System.out.println(student.getAge());
		
		com.privalia.entity.annotations.Address address = student.getAddress();
		System.out.println(address.getStreet());
		System.out.println(address.getCity());
		System.out.println(address.getTown());
		
		annotationContext.close();
	}

}
