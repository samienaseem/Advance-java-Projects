package com.samar.beans;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.lang.Nullable;

public class Student {
	
	private Address address;
	
	Student(){
		System.out.println("Deafult constructor of student class called");
	}
	@Autowired
	public void setAddress(@Nullable Address add){
		System.out.println("inside setAddress method");
		this.address=add;
		
	}
	
	public void display(){
		System.out.println("Insiide student disply method :="+this.address);
	}	
	
	/*public String getName() {
		return name;
	}
	@Autowired(required=true)
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	@Autowired(required=true)
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	private String name;
	private int rollnumber;
	
	
	public void display(){
		System.out.println("Name is :"+this.name);
		System.out.println("Roll number is:"+this.rollnumber);
		
	}
	*/
	

}
