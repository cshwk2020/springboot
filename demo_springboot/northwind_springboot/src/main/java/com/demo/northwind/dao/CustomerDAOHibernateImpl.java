package com.demo.northwind.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.northwind.model.Customers;

@Repository
public class CustomerDAOHibernateImpl implements  CustomerDAO {

	private EntityManager entityManager;
	
	@Autowired
	public CustomerDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Transactional
	@Override
	public Customers getCustomer(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Customers> theQuery =
				currentSession.createQuery("from Customers where id = :id", Customers.class)
				.setParameter("id", id);
		 
		Customers customer = theQuery.getSingleResult();
		return customer;
	}
	 
}
