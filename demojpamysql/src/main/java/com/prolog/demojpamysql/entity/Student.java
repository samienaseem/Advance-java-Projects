package com.prolog.demojpamysql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	
	public Student(){
		
	}


	public Student(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student(String name){
		this.name=name;
	}
	
	
	
	

}
