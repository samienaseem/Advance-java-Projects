package com.prolog.spring11.mvcjdbctemplate1.dao;

import java.util.List;

import com.prolog.spring11.mvcjdbctemplate1.model.contact;

public interface ContactDdao {
	
	public int save(contact con);
	
	public int update(contact con);
	
	public contact get(int id);
	
	public int delete(int id);
	
	public List<contact> list();

}
 