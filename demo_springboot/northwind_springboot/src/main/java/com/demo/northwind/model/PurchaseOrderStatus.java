package com.demo.northwind.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="purchase_order_status")
public class PurchaseOrderStatus {
	
	@Id
	private int id;
	private String status;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getStatus(){
		return status;
	}

	public void setStatus(String status){
		this.status=status;
	}
}
