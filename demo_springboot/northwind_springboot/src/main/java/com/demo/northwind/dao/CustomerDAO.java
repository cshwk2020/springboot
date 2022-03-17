package com.demo.northwind.dao;

import java.util.List;

import com.demo.northwind.model.Customers;
import com.demo.northwind.model.Products;

public interface CustomerDAO {

	public Customers getCustomer(int id);
}
