package com.demo.northwind.rest;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.northwind.dao.CustomerDAO;
import com.demo.northwind.model.Customers;
 
@RestController
@CrossOrigin
@RequestMapping("/api")
public class CustomersRestController {

	private CustomerDAO customerDAO;
	
	@Autowired
	public CustomersRestController(CustomerDAO theCustomerDAO) {
		customerDAO = theCustomerDAO;
	}
	
	@GetMapping("/logon")
	public Customers logon(int id) {
		return customerDAO.getCustomer(id);
	}

}
