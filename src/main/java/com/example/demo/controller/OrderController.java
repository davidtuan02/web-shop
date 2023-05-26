package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Order;
import com.example.demo.models.ResponseObject;
import com.example.demo.repositories.OrderRepository;

@RestController
@RequestMapping(path = "/fashionshop/v1/order")
public class OrderController {

	private OrderRepository orderRepository;
	
	
	@GetMapping("/getAll")
	ResponseEntity<ResponseObject> getAllOrders() {
		List<Order> listOrder = orderRepository.findAll();
		if(listOrder.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xem thành công", listOrder)
					);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Chưa có đơn hàng", "")
					);
		}
		
	}
	
	
	@GetMapping("/getDetail/{id}")
	ResponseEntity<ResponseObject> getDetailOrder(@PathVariable Long id) {
		Optional<Order> foundOrder = orderRepository.findById(id);
		if(foundOrder.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xem chi tiết đơn hàng thành công", foundOrder)
					);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không tìm thấy đơn hàng có: " + id, "")
					);
		}
	}

	
	@GetMapping("/getAllNotDeleted")
	ResponseEntity<ResponseObject> getAllNotDeletedOrders() {
		List<Order> listOrder = orderRepository.findByIsDeleted(false);
		if(listOrder.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xem thành công: ", listOrder)
					); 	
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không có đơn hàng", "")
					); 	
		}
	}
	
	
	//delete
	@PutMapping("/deleteTemporary/{id}")
	ResponseEntity<ResponseObject> deleteOrderTemporary(@PathVariable Long id ) {
		Optional<Order> deletedOrder = orderRepository.findById(id).map((order) -> {
			order.setIsDeleted(true);
			return orderRepository.save(order);
		});
		
		if(deletedOrder.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xoá đơn hàng thành công", "")
					); 	
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không có đơn hàng id: " + id , "")
					); 	
		}	
	}
	
	
	@PostMapping("/add")
	ResponseEntity<ResponseObject> addOrder( @RequestBody Order newOrder ) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Thêm thành công", orderRepository.save(newOrder))
					); 		
		}
	
	
	@PutMapping("/update/{id}")
	ResponseEntity<ResponseObject> updateOrder(@PathVariable Long id, @RequestBody Order updateOrder ) {
		Order foundOrder = orderRepository.findById(id).map((order) -> {
			order.setProductName(updateOrder.getProductName());
			order.setQuantity(updateOrder.getQuantity());
			order.setPrice(updateOrder.getPrice());
//			order.setIsDeleted(updateOrder.getIsDeleted());
			order.setDesc(updateOrder.getDesc());
			order.setAmount(updateOrder.getAmount());
			return orderRepository.save(order);
		}).orElseGet(() -> {
			updateOrder.setId(id);
			return orderRepository.save(updateOrder);
		});
		
		
		return ResponseEntity.status(HttpStatus.OK).body(
				new ResponseObject("Success", "Cập nhật đơn hàng thành công ", foundOrder)
				); 			
	}
}
