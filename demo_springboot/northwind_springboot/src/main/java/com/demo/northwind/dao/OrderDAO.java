package com.demo.northwind.dao;

import java.util.List;

import com.demo.northwind.model.Orders;
import com.demo.northwind.model.Products;

public interface OrderDAO {

	public List<Orders> findAll();
}
