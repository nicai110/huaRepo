package com.beasp.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository; 
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beasp.bean.BeeTest;

@Repository(value="testDao") 
@Transactional(propagation = Propagation.REQUIRED)
public class TestDaoImpl{
	@PersistenceContext
	private EntityManager entityManager; 
	public EntityManager getEntityManager() {
	return entityManager;
	};
	public ArrayList<BeeTest> load(){ 
		ArrayList<BeeTest> al= (ArrayList<BeeTest>)entityManager.createQuery(" FROM "+BeeTest.class.getSimpleName()+" AS BEE ").getResultList();
		return al;  
	}
	
}
