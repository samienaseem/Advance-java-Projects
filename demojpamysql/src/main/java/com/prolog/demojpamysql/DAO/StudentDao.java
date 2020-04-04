package com.prolog.demojpamysql.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prolog.demojpamysql.entity.Student;


@Repository
@Transactional
public class StudentDao{
	
	@Autowired
	EntityManager em;
	
	public long insert(Student s){
		
	
		em.persist(s);
		return s.getId();
		
		
	}
	
	
	
	

}
