package com.demo.northwind.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.northwind.model.Products;


@Repository
public class ProductsDAOHibernateImpl implements ProductsDAO {

	private EntityManager entityManager;
			
	@Autowired
	public ProductsDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Transactional
	@Override
	public List<Products> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Products> theQuery =
				currentSession.createQuery("from Products order by product_name", Products.class);
		 
		List<Products> products = theQuery.getResultList();
		return products;
	}
	
} 