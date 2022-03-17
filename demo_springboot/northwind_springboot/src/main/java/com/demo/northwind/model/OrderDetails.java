package com.demo.northwind.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.Nullable;

@Entity
@Table(name="order_details")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int order_id;
	//private int product_id;
	private double quantity;
	private double unit_price;
	private double discount;
	//private int status_id;
	//@Nullable private Integer purchase_order_id;
	@Nullable private Integer inventory_id;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getOrder_id(){
		return order_id;
	}

	public void setOrder_id(int order_id){
		this.order_id=order_id;
	}

	/*
	public int getProduct_id(){
		return product_id;
	}

	public void setProduct_id(int product_id){
		this.product_id=product_id;
	}
	*/
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="product_id")
	private Products product;
	
	 

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public double getQuantity(){
		return quantity;
	}

	public void setQuantity(double quantity){
		this.quantity=quantity;
	}

	public double getUnit_price(){
		return unit_price;
	}

	public void setUnit_price(double unit_price){
		this.unit_price=unit_price;
	}

	public double getDiscount(){
		return discount;
	}

	public void setDiscount(double discount){
		this.discount=discount;
	}

	/*
	public int getStatus_id(){
		return status_id;
	}

	public void setStatus_id(int status_id){
		this.status_id=status_id;
	}
	*/
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="status_id")
	private OrderDetailStatus orderDetailStatus;
	 
	public OrderDetailStatus getOrderDetailStatus() {
		return orderDetailStatus;
	}

	public void setOrderDetailStatus(OrderDetailStatus orderDetailStatus) {
		this.orderDetailStatus = orderDetailStatus;
	}

	/*
	@Nullable
	public Integer getPurchase_order_id(){
		return purchase_order_id;
	}

	public void setPurchase_order_id(@Nullable Integer purchase_order_id){
		this.purchase_order_id=purchase_order_id;
	}
	*/
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="purchase_order_id")
	@Nullable private PurchaseOrders purchaseOrder;
	 
	
	@Nullable public PurchaseOrders getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(@Nullable PurchaseOrders purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	
	

	@Nullable public Integer getInventory_id(){
		return inventory_id;
	}

	public void setInventory_id(@Nullable Integer inventory_id){
		this.inventory_id=inventory_id;
	}
}
