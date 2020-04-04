package com.prolog.mavenProject2;

import java.io.Serializable;

public class BeanClass implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name,email,course;

	public BeanClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setCourse(String course){
		this.course=course;
	}
	public String getCourse(){
		return course;
	}


	
	

	
}
