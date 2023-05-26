package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Product;

//@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByProductName(String productName);	
	List<Product> findByIsDeleted(boolean isDeleted);
	List<Product> findByPrice(double price);
	List<Product> findBySize(String size);
	List<Product> findByProductCode(String productCode);
	List<Product> findByDesc(String desc);
}
