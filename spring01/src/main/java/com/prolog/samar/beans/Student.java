package com.prolog.samar.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	
	@Autowired
	//@Qualifier("add")
	private Map<String,Address> add;
	
	Student(){
		System.out.println("Default constructor called");
	}
	
	/*@Autowired
	public void setAdd(Address add) {
		System.out.println("Inside setAddress method of student class");
		this.add = add;
	}*/
	/*@Autowired
	public Student(Address add){
		System.out.println("Student class Parameterized constructor called");
		this.add=add;
	}*/
	
	public void display(){
		/*System.out.println("City:="+add[0].getCity());
		System.out.println("State:="+add[0].getState());
		System.out.println("City:="+add[1].getCity());
		System.out.println("State:="+add[1].getState());*/
		
		/*for (Address add:add){
			System.out.println("State:="+add.getState());
			System.out.println("City:="+add.getCity());
			
		}*/
		
		for(Map.Entry<String,Address> address:add.entrySet()){
			
			System.out.println("Keys is :"+address.getKey()+"  "
					+ "city is :"+ address.getValue().getCity()+ 
					" State is :"+address.getValue().getState());
		}
	}

}
