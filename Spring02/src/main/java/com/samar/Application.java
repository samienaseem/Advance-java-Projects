package com.samar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samar.beans.Emails;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext aap=new AnnotationConfigApplicationContext(Config.class);
		Emails email=aap.getBean("one",Emails.class);
		System.out.println("Db name is : "+email.getName());
		System.out.println("Db password is : "+email.getPassword());
	}

}
