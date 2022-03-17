package com.demo.northwind.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.northwind.model.Orders;
import com.demo.northwind.model.Products;
 

@Repository
public class OrderDAOHibernateImpl implements OrderDAO {

	private EntityManager entityManager;
			
	@Autowired
	public OrderDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Transactional
	@Override
	public List<Orders> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Orders> theQuery =
				currentSession.createQuery("from Orders order by id", Orders.class);
		 
		List<Orders> orderList = theQuery.getResultList();
		return orderList;
	}
	
} 