package javaConfig.beans;

import org.springframework.stereotype.Component;


public class Address {
	

	private String firstName;
	private String lastName;
	public Address(String First,String Last){
		
		System.out.println("Adress class parametrized constructor called");
		this.firstName=First;
		this.lastName=Last;
		
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	/*public void show(){
		
		System.out.println("Address class show method called");
	}*/

}
