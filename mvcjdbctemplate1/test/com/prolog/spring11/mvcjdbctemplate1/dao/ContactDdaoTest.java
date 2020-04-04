package com.prolog.spring11.mvcjdbctemplate1.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.prolog.spring11.mvcjdbctemplate1.model.contact;

public class ContactDdaoTest {
	private DriverManagerDataSource data;
	private ContactDdao dd;
	
	
	@Before
	public void setupbefore(){
		
		data=new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/springdb");
		data.setUsername("root");
		data.setPassword("");
		
		dd=new ContactDaoImpl(data);
		
		
	}

	@Test
	public void testSave() {
		
		
		contact c=new contact("samienaseem11", "samar1213134@gmail.com", "Okhla jamia", "9810342102");
		int res=dd.save(c);
		assertTrue(res>0);
		
	}

	@Test
	public void testUpdate() {
		contact c=new contact(1, "saquib", "samienaseem@gmail.com", "Hamdard", "7678524057");
		int r=dd.update(c);
		assertTrue(r>0);
		System.out.println(r);
		
	}

	@Test
	public void testGet() {
		contact ca=dd.get(3);
		System.out.println(ca);
		assertNotNull(ca);
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testList() {
		List<contact> l=dd.list();
		
		for(contact c:l){
			System.out.println(c);
		}
		
	}

}
