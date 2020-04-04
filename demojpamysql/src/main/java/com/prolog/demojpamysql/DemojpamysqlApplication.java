package com.prolog.demojpamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prolog.demojpamysql.DAO.StudentDao;
@SpringBootApplication

public class DemojpamysqlApplication /*extends SpringBootServletInitializer*/{
	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		
		return app.sources(DemojpamysqlApplication.class);
	}*/
	
	/*@RequestMapping("/")*/
	/*String Homepage(){
		return "index";
	}
*/
	/*@Autowired
     StudentDao std;*/
	
	

	public static void main(String[] args) {
		
		
		SpringApplication.run(DemojpamysqlApplication.class, args);
		
	}



	
	
	

	
	
	

}
