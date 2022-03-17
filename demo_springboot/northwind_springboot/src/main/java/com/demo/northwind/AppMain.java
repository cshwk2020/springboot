package com.demo.northwind;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.DemoConfig;
import com.luv2code.aopdemo.dao.AccountDAO;
 

@SpringBootApplication
public class AppMain {

	public static void main(String... args) throws Exception {

		System.out.println("AppMain...");
		SpringApplication.run(AppMain.class, args);

		/*
		// read spring config java class
		AnnotationConfigApplicationContext context =
						new AnnotationConfigApplicationContext(DemoConfig.class);
				
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
				
		// call the business method
		theAccountDAO.addAccount();

		// do it again!
		System.out.println("\nlet's call it again!\n");
				
		// call the business method again
		theAccountDAO.addAccount();
						
		// close the context
		context.close();
		*/
		
	}
}

