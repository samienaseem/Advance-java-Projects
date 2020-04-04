package com.prolog;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prolog.beans.Questions;

public class ApplicationContext {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("testspring.xml");
		Questions q=context.getBean(Questions.class,"ques");
		q.display();
	}

}
