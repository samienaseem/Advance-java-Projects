package javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaConfig.beans.Student;

public class ApplicationContext {
	
	public static void main(String...aaa){
		AnnotationConfigApplicationContext Context=new AnnotationConfigApplicationContext(MyConfig.class);
		Student student= Context.getBean("student1",Student.class);
		student.Display();
	}

}
