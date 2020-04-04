package com.prolog.spring.JPAtest.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prolog.spring.JPAtest.Entity.Usere;
@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public long insert(Usere u) {
		em.persist(u);
		return u.getId();
	}
	
	

}
