package com.prolog.spring.JPAtest.Dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.prolog.spring.JPAtest.Entity.Usere;

public class UserDaoTest {
	
	private UserDao ud;
	private DriverManagerDataSource data;
	
	
	@Before
	public void setupbefore(){
		
		data=new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/springdb");
		data.setUsername("root");
		data.setPassword("");
		
		ud=new UserDaoImpl();
		
		
		
	}

	@Test
	public void testInsert() {
		Usere u=new Usere("samie","okhla");
		long res=ud.insert(u);
		System.out.println("inserted"+res);
	}

}
