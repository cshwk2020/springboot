package com.demo.northwind.aspect;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.demo.northwind.model.Products;

@Aspect
@Component 
public class TestAspect {

	// List<Products> findAll()
	@Before("execution(public * findAll())")
	public void beforeAnyMethodAdvice() {
		
		System.out.println("\n=====>>> Executing @Before findAll ");
		
	}
}
