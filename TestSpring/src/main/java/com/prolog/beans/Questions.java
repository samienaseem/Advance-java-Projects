package com.prolog.beans;

import java.util.List;

public class Questions {
	
	private int id;
	private String name;
	private List<Answers> ans;
	public Questions(int id, String name, List<Answers> ans) {
		super();
		this.id = id;
		this.name = name;
		this.ans = ans;
	}
	
	public void display(){
		
		System.out.println("id : "+id);
		System.out.println("Name :" +name);
		
		for(Answers a : ans){
			System.out.println("Ans are :"+a);
		}
	}

}
