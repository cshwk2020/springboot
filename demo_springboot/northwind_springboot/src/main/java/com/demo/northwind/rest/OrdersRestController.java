package com.demo.northwind.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.northwind.dao.OrderDAO;
import com.demo.northwind.dao.ProductsDAO;
import com.demo.northwind.model.Orders;
import com.demo.northwind.model.Products;
 
@RestController
@CrossOrigin
@RequestMapping("/api")
public class OrdersRestController {

	private OrderDAO ordersDAO;
	
	@Autowired
	public OrdersRestController(OrderDAO theOrderDAO) {
		ordersDAO = theOrderDAO;
	}
	
	@GetMapping("/orders")
	public List<Orders> findAll() {
		return ordersDAO.findAll();
	}

}
