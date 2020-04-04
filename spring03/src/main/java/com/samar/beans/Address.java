package com.samar.beans;

public class Address {
	
	public Address(){
		System.out.println("Address class default constructoer called");
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private String type;
	private String name;
	
	

}
