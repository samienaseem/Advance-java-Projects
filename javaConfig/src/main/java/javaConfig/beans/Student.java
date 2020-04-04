package javaConfig.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	@Autowired
	private Address address;
	public Student(){
		
		System.out.println("Student class default constructor called");
	}
	
	public void Display(){
		System.out.println("Studnet class display method called");
		System.out.println("First Name is ="+address.getFirstName());
		System.out.println("Last Name is ="+address.getLastName());
		/*address.show();*/
	}

}
