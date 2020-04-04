package com.prolog.spring11.mvcjdbctemplate1.model;

public class contact {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "contact [id="+id+", Name="+name+", Email="+email+", Address"+address+", Phone"
				+telephone+"]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	private int id;
	private String name;
	private String email;
	private String address;
	private String telephone;
	
	public contact(int id, String name, String email, String address, String telephone) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
	}
	
	public contact(String name, String email, String address, String telephone) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
	}
	public contact(){
		
	}
	
	
	
	
	
	
}