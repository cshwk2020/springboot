package com.demo.northwind.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.Nullable;

@Entity
@Table(name="purchase_order_details")
public class PurchaseOrderDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int purchase_order_id;
	private int product_id;
	private double quantity;
	private double unit_cost;
	@Nullable private Integer inventory_id;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPurchase_order_id(){
		return purchase_order_id;
	}

	public void setPurchase_order_id(int purchase_order_id){
		this.purchase_order_id=purchase_order_id;
	}

	public int getProduct_id(){
		return product_id;
	}

	public void setProduct_id(int product_id){
		this.product_id=product_id;
	}

	public double getQuantity(){
		return quantity;
	}

	public void setQuantity(double quantity){
		this.quantity=quantity;
	}

	public double getUnit_cost(){
		return unit_cost;
	}

	public void setUnit_cost(double unit_cost){
		this.unit_cost=unit_cost;
	}

	@Nullable public Integer getInventory_id(){
		return inventory_id;
	}

	public void setInventory_id(@Nullable Integer inventory_id){
		this.inventory_id=inventory_id;
	}
}
