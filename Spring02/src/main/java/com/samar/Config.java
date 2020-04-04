package com.samar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.samar.beans.Emails;

@Configuration
@PropertySource("dbdetails.properties")
public class Config {
	
	@Bean("one")
	public Emails objectEmail(){
		Emails e=new Emails();
		return e;
	}

}
