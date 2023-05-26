package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tableProduct")
public class Product {
	
	@Id	
//	@GeneratedValue(strategy = GenerationType.AUTO) 
	
	@SequenceGenerator( //id +1 in sql
			name = "product_sequence",
			sequenceName = "product_sequence",
			allocationSize = 1 //increment by 1
			)	
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "product_sequence"
			)
	
	private Long id;
	@Column(nullable = false, unique = false, length = 300)
	private String productName;
	private String productCode;
	private String size;
	private double price;
	private String desc;
	private int amount;
	private String link;
	private boolean isDeleted = false;
	
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Product(String productName, String productCode, String size, double price, String desc, int amount,
			String link) {
		super();
		this.productName = productName;
		this.productCode = productCode;
		this.size = size;
		this.price = price;
		this.desc = desc;
		this.amount = amount;
		this.link = link;
	}
	public Product() {
		super();
	}
	
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productCode=" + productCode + ", size=" + size
				+ ", price=" + price + ", desc=" + desc + ", amount=" + amount + ", link=" + link + ", isDeleted="
				+ isDeleted + "]";
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
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
		
}

