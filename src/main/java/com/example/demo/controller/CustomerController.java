package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Customer;
import com.example.demo.models.ResponseObject;
import com.example.demo.repositories.CustomerRepository;

@RestController
@RequestMapping(path = "/fashionshop/v1/customer")
public class CustomerController {
	
	    private CustomerRepository customerRepository;
	    
		@GetMapping("/getDetail/{id}")
		ResponseEntity<ResponseObject> getDetailCustomer(@PathVariable Long id) {
			Optional<Customer> foundCustomer = customerRepository.findById(id);
			if(foundCustomer.isPresent()) {
				return ResponseEntity.status(HttpStatus.OK).body(
						new ResponseObject("Success", "Xem chi tiết thành công", foundCustomer)
						);
			}
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
						new ResponseObject("Fail", "Không tìm thấy khách hàng có id: " + id, "")
						);
			}
		}
		
		
		@GetMapping("/getAll")
		ResponseEntity<ResponseObject> getAllCustomers() {
			List<Customer> listCustomer = customerRepository.findAll();
			if(listCustomer.size() > 0) {
				return ResponseEntity.status(HttpStatus.OK).body(
						new ResponseObject("Success", "Xem thành công", listCustomer)
						);
			}
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
						new ResponseObject("Fail", "Chưa có Khách hàng", "")
						);
			}
			
		}
		
		
		@GetMapping("/getAllNotDeleted")
		ResponseEntity<ResponseObject> getAllNotDeletedCustomers() {
			List<Customer> listCustomer = customerRepository.findByIsDeleted(false);
			if(listCustomer.size() > 0) {
				return ResponseEntity.status(HttpStatus.OK).body(
						new ResponseObject("Success", "Xem thành công: ", listCustomer)
						); 	
			}
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
						new ResponseObject("Fail", "Không có khách hàng", "")
						); 	
			}
		}
		
			
		@DeleteMapping("/deleteCustomer/{id}")
		ResponseEntity<ResponseObject> deleteCustomer(@PathVariable Long id) {
			boolean check = customerRepository.existsById(id);
			if(check) {
				customerRepository.deleteById(id);
				return ResponseEntity.status(HttpStatus.OK).body(
						new ResponseObject("Success", "Xoá khách hàng thành công", "")
						);
			}
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
						new ResponseObject("Fail", "Không tìm thấy khách hàng có id: " + id, "")
						);
			}
		}
		
		
		@PutMapping("/update/{id}")
		ResponseEntity<ResponseObject> updateCustomer(@PathVariable Long id, @RequestBody Customer updateCustomer ) {
			Customer foundCustomer = customerRepository.findById(id).map((customer) -> {
				customer.setFullName(updateCustomer.getFullName());
				customer.setEmail(updateCustomer.getEmail());
				customer.setPhoneNumber(updateCustomer.getPhoneNumber());
				customer.setAddress(updateCustomer.getAddress());			
				customer.setGender(updateCustomer.getGender());
//				customer.setIsDeleted(updateCustomer.getIsDeleted());
				return customerRepository.save(customer);
			}).orElseGet(() -> {
				updateCustomer.setId(id);
				return customerRepository.save(updateCustomer);
			});
			
			
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Cập nhật thông tin khách hàng thành công ", foundCustomer)
					); 			
		}
		
		
		@PostMapping("/add")
		ResponseEntity<ResponseObject> addCustomer( @RequestBody Customer newCustomer ) {
			List<Customer> check = customerRepository.findByPhoneNumber(newCustomer.getPhoneNumber().trim());
			if(check.size() > 0) {
				return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(
						new ResponseObject("Fail", "Trùng khách hàng", "")
						); 		
			}
			else {
				return ResponseEntity.status(HttpStatus.OK).body(
						new ResponseObject("Success", "TThêm khách hàng thành công", customerRepository.save(newCustomer))
						); 		
			}
		}
		
		
		//delete
		@PutMapping("/deleteTemporary/{id}")
		ResponseEntity<ResponseObject> deleteCustomerTemporary(@PathVariable Long id ) {
			Optional<Customer> deletedCustomer = customerRepository.findById(id).map((customer) -> {
				customer.setIsDeleted(true);
				return customerRepository.save(customer);
			});
			
			if(deletedCustomer.isPresent()) {
				return ResponseEntity.status(HttpStatus.OK).body(
						new ResponseObject("Success", "Xoá khách hàng thành công", "")
						); 	
			}
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
						new ResponseObject("Fail", "Không tìm thấy khách hàng có id: " + id , "")
						); 	
			}	
		}
	
}
