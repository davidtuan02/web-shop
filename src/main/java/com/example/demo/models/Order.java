package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tableOrder")
public class Order {

	@Id
	@SequenceGenerator( 
			name = "product_sequence",
			sequenceName = "product_sequence",
			allocationSize = 1 
			)	
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "product_sequence"
			)
	
	private Long id; 
	@Column(nullable = false, unique = false, length = 300)
	private String productName;
	private double price;
	private int quantity;
	private String desc;
	private double amount = this.price * this.quantity;
	private boolean isDeleted = false;
	
	public Order() {
		super();
	}
	
	
	public boolean getIsDeleted() {
		return isDeleted;
	}


	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}


	public Order(String productName, double price, int quantity, String desc, double amount) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.desc = desc;
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity
				+ ", desc=" + desc + ", amount=" + amount + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
