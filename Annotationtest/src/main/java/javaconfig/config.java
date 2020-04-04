package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javaconfig.beans.Address;

@Configuration
@ComponentScan("javaconfig")
public class config {
	@Bean
	public Address getAddress(){
		Address add=new Address();
		add.setCity("America");
		add.setState("Bulgeria");
		return add;
	}

}
