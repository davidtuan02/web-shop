package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	List<Order> findByIsDeleted(boolean isDeleted);
}
