package com.demo.northwind.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.Nullable;

@Entity
@Table(name="purchase_orders")
public class PurchaseOrders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int supplier_id;
	private int created_by;
	//private int status_id;
	private double shipping_fee;
	private double taxes;
	private double payment_amount;
	private String payment_method;
	private int approved_by;
	private int submitted_by;

	
	@Nullable
	@OneToMany(mappedBy="purchase_order_id",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List<PurchaseOrderDetails> purchaseOrderDetails;
	
	
	
	
	public List<PurchaseOrderDetails> getPurchaseOrderDetails() {
		return purchaseOrderDetails;
	}

	public void setPurchaseOrderDetails(List<PurchaseOrderDetails> purchaseOrderDetails) {
		this.purchaseOrderDetails = purchaseOrderDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSupplier_id(){
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id){
		this.supplier_id=supplier_id;
	}

	public int getCreated_by(){
		return created_by;
	}

	public void setCreated_by(int created_by){
		this.created_by=created_by;
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
	private PurchaseOrderStatus purchaseOrderStatus;
	 
	public PurchaseOrderStatus getPurchaseOrderStatus() {
		return purchaseOrderStatus;
	}

	public void setPurchaseOrderStatus(PurchaseOrderStatus purchaseOrderStatus) {
		this.purchaseOrderStatus = purchaseOrderStatus;
	}

	public double getShipping_fee(){
		return shipping_fee;
	}

	public void setShipping_fee(double shipping_fee){
		this.shipping_fee=shipping_fee;
	}

	public double getTaxes(){
		return taxes;
	}

	public void setTaxes(double taxes){
		this.taxes=taxes;
	}

	public double getPayment_amount(){
		return payment_amount;
	}

	public void setPayment_amount(double payment_amount){
		this.payment_amount=payment_amount;
	}

	public String getPayment_method(){
		return payment_method;
	}

	public void setPayment_method(String payment_method){
		this.payment_method=payment_method;
	}

	public int getApproved_by(){
		return approved_by;
	}

	public void setApproved_by(int approved_by){
		this.approved_by=approved_by;
	}

	public int getSubmitted_by(){
		return submitted_by;
	}

	public void setSubmitted_by(int submitted_by){
		this.submitted_by=submitted_by;
	}
}
