package com.privalia.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("student-config.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student.getIdStudent());
		System.out.println(student.getName());
		System.out.println(student.getSurname());
		System.out.println(student.getAge());
		
		Address address = student.getAddress();
		System.out.println(address.getStreet());
		System.out.println(address.getCity());
		System.out.println(address.getTown());
		
		System.out.println("----------------");
		
		Student studentConst = (Student)context.getBean("studentConst");
		System.out.println(studentConst.getIdStudent());
		System.out.println(studentConst.getName());
		System.out.println(studentConst.getSurname());
		System.out.println(studentConst.getAge());
		
		Address address2 = studentConst.getAddress();
		System.out.println(address2.getStreet());
		System.out.println(address2.getCity());
		System.out.println(address2.getTown());
		context.close();

	}

}
