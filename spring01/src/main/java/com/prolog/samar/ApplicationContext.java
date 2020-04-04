package com.prolog.samar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prolog.samar.beans.Student;

public class ApplicationContext {
	
	public static void main(String[] args) {
		System.out.println("Creating context");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("configSpring.xml");
		
		System.out.println("context Created");
		Student ss=context.getBean("student1",Student.class);
		ss.display();
	}

}
