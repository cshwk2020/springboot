package com.demo.northwind.dao;

import java.util.List;

import org.hibernate.Session;

import com.demo.northwind.model.Products;


public interface ProductsDAO {

	public List<Products> findAll();
		
}
