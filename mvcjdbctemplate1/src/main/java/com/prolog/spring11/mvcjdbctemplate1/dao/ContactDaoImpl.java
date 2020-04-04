package com.prolog.spring11.mvcjdbctemplate1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.prolog.spring11.mvcjdbctemplate1.model.contact;

public class ContactDaoImpl implements ContactDdao {
	
	private JdbcTemplate jdbc;
	
	
	public  ContactDaoImpl(DataSource datasource) {
		
		this.jdbc=new JdbcTemplate(datasource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int save(contact con) {
		String sql="INSERT into contact(name,email,address,telephone) VALUES (?, ?, ?, ?)";
		return jdbc.update(sql, con.getName(),con.getEmail(), con.getAddress(),con.getTelephone());
		
	}

	@Override
	public int update(contact con) {
		String sql="update contact set name=?, email=?, address=?, telephone=? where contactid=?";
		return jdbc.update(sql,con.getName(),con.getEmail(),con.getAddress(), con.getTelephone(), con.getId());
	}

	@Override
	public contact get(int id) {
		String sql="select * from contact where contactid="+id;
		
		ResultSetExtractor<contact> ex=new ResultSetExtractor<contact>() {

			@Override
			public contact extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()){
					contact c=new contact();
					c.setId(rs.getInt("contactid"));
					c.setName(rs.getString("name"));
					c.setEmail(rs.getString("email"));
					c.setAddress(rs.getString("address"));
					c.setTelephone(rs.getString("telephone"));
					
					return c;
				}
				return null;
			}
		};
		return jdbc.query(sql, ex);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<contact> list() {
		String sql="select * from contact";
		return jdbc.query(sql, new ResultSetExtractor<List<contact>>(){

			@Override
			public List<contact> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<contact> list=new ArrayList<contact>();
				while(rs.next()){
					contact c=new contact();
					c.setId(rs.getInt("contactid"));
					c.setName(rs.getString("name"));
					c.setEmail(rs.getString("email"));
					c.setAddress(rs.getString("address"));
					c.setTelephone(rs.getString("telephone"));
					
					list.add(c);
					
				}
				
				return list;
			}
			
		});
		
		
	}

}
