package javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaconfig.beans.Student;

public class ApplicationContext {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		Student s=context.getBean("Student", Student.class);
		s.display();
	}

}
