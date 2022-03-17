package com.demo.northwind.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details_status")
public class OrderDetailStatus {
	
	@Id
	private int id;
	private String status_name;
 
	//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//
	public String getStatus_name(){
		return status_name;
	}

	public void setStatus_name(String status_name){
		this.status_name=status_name;
	}
}
