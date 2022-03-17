package com.demo.northwind.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.northwind.dao.ProductsDAO;
import com.demo.northwind.model.Products;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductsRestController {

	private ProductsDAO productsDao;
	
	@Autowired
	public ProductsRestController(ProductsDAO theProductsDAO) {
		productsDao = theProductsDAO;
	}
	
	@GetMapping("/products")
	public List<Products> findAll() {
		return productsDao.findAll();
	}

}
