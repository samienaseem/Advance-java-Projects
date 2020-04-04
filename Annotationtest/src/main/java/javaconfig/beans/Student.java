package javaconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("Student")
public class Student {
	@Autowired
	public Address add;
	
	public void display(){
		System.out.println("inside studnt display method");
		System.out.println("city"+add.getCity());
		System.out.println("state"+add.getState());
	}

}
