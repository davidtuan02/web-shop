package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findByIsDeleted(boolean isDeleted);
	
	List<Customer> findByPhoneNumber(String phoneNumber);
}
