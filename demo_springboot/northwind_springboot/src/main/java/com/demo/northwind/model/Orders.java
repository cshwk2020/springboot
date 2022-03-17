package com.demo.northwind.model;

import java.util.Date;
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
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//private int employee_id;
	//private int customer_id;
	@Nullable private Integer shipper_id;
	@Nullable private Date shipped_date;
	private String ship_name;
	private String ship_city;
	private String ship_state_province;
	private String ship_zip_postal_code;
	private String ship_country_region;
	private double shipping_fee;
	private double taxes;
	private String payment_type;
	private double tax_rate;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	@Nullable
	@OneToMany(mappedBy="order_id",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List<OrderDetails> orderDetailList;
	
	@Nullable public List<OrderDetails> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(@Nullable List<OrderDetails> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
	/*
	public int getEmployee_id(){
		return employee_id;
	}

	public void setEmployee_id(int employee_id){
		this.employee_id=employee_id;
	}
	*/
	
	 



	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Employees employeeDetail;
	
	public Employees getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(Employees employeeDetail) {
		this.employeeDetail = employeeDetail;
	}
	

	/*
	public int getCustomer_id(){
		return customer_id;
	}

	public void setCustomer_id(int customer_id){
		this.customer_id=customer_id;
	}
	*/
	
	 

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customers customerDetail;
	 
	public Customers getCustomerDetail() {
		return customerDetail;
	}

	public void setCustomerDetail(Customers customerDetail) {
		this.customerDetail = customerDetail;
	}

	@Nullable public Integer getShipper_id(){
		return shipper_id;
	}

	public void setShipper_id(@Nullable Integer shipper_id){
		this.shipper_id=shipper_id;
	}

	
	
	@Nullable public Date getShipped_date() {
		return shipped_date;
	}

	public void setShipped_date(@Nullable Date shipped_date) {
		this.shipped_date = shipped_date;
	}

	public String getShip_name(){
		return ship_name;
	}

	public void setShip_name(String ship_name){
		this.ship_name=ship_name;
	}

	public String getShip_city(){
		return ship_city;
	}

	public void setShip_city(String ship_city){
		this.ship_city=ship_city;
	}

	public String getShip_state_province(){
		return ship_state_province;
	}

	public void setShip_state_province(String ship_state_province){
		this.ship_state_province=ship_state_province;
	}

	public String getShip_zip_postal_code(){
		return ship_zip_postal_code;
	}

	public void setShip_zip_postal_code(String ship_zip_postal_code){
		this.ship_zip_postal_code=ship_zip_postal_code;
	}

	public String getShip_country_region(){
		return ship_country_region;
	}

	public void setShip_country_region(String ship_country_region){
		this.ship_country_region=ship_country_region;
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

	public String getPayment_type(){
		return payment_type;
	}

	public void setPayment_type(String payment_type){
		this.payment_type=payment_type;
	}

	public double getTax_rate(){
		return tax_rate;
	}

	public void setTax_rate(double tax_rate){
		this.tax_rate=tax_rate;
	}
}
