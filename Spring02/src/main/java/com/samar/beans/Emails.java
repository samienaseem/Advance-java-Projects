package com.samar.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.SystemPropertyUtils;

public class Emails {
	
	
	@Value("${db.name}")
	private String name;
	@Value("${db.password}")
	private String password; 
	
	/*public Emails(String name,String password){
		System.out.println("Email class parametrized constructor called");
		this.name=name;
		this.password=password;
		
		
	}*/
	
	public Emails() {
		System.out.println("Default constructor called of Email class");
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
	
	
	
	

}
