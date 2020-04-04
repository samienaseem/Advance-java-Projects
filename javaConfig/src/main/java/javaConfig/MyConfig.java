package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javaConfig.beans.Address;

@Configuration
@ComponentScan("javaConfig")
public class MyConfig {
	@Bean
	public Address getAddress12212(){
		Address ad=new Address("Samie","Naseem");
		return ad;
	}
	
	

}
