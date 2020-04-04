package com.prlog.springMVC04.model;

import java.util.HashMap;
import java.util.Map;

public class Student {

	

	public HashMap<String, String> getOperatingsys() {
		return operatingsys;
	}

	public String[] getOperatingsystem() {
		return operatingsystem;
	}

	public void setOperatingsystem(String[] operatingsystem) {
		this.operatingsystem = operatingsystem;
	}

	private String firstName;
	private String lastName;
	private String course;
	private HashMap<String,String> courses;
	private String[] operatingsystem;
	private HashMap<String,String> operatingsys;
	
	public Student(){
		courses=new HashMap<String, String>();
		courses.put("C", "C");
		courses.put("Cpp", "Cpp");
		courses.put("java", "java");
		courses.put("WD", "WD");
		courses.put("Spring", "Spring");
		
		operatingsys=new HashMap<String,String>();
		operatingsys.put("Linux", "Linux");
		operatingsys.put("Android", "Android");
		operatingsys.put("Window", "Window");
		operatingsys.put("Dos", "Dos");
		
		
		
		}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public HashMap<String, String> getCourses() {
		return courses;
	}
	

}
