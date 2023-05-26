package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "tableCustomer")
public class Customer {

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
	private String fullName;
	private String email;
	@Column(nullable = false, unique = true, length = 300)
	private String phoneNumber;
	private String address;
	private String gender;
	private boolean isDeleted = false;
	
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", gender=" + gender + ", isDeleted=" + isDeleted + "]";
	}
	public Customer(String fullName, String email, String phoneNumber, String address, String gender) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
