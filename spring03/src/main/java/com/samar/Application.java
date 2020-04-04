package com.samar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samar.beans.Student;

public class Application {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student s=context.getBean("student",Student.class);
		System.out.println("Context created");
		s.display();
	}

}
