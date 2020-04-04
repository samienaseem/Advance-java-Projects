package com.prolog.samar.beans;

public class Address {
	

	private String city;
	private String state;
	
	 public Address(String city,String state){
		 System.out.println("Address class parametried constructor called");
		 this.city=city;
		 this.state=state;
	 }
	 
	 
	 public String getCity() {
			return city;
		}

		public String getState() {
			return state;
		}
	 
	 

}
