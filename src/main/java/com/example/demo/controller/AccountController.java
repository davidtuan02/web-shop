package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Account;
import com.example.demo.models.ResponseObject;
import com.example.demo.repositories.AccountRepository;

@RestController
@RequestMapping(path = "/fashionshop/v1/account")
public class AccountController {

	private AccountRepository accountRepository;
	
	@GetMapping("/getAll")
	ResponseEntity<ResponseObject> getAllOrders() {
		List<Account> listAccount = accountRepository.findAll();
		if(listAccount.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xem thành công", listAccount)
					);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Chưa có tài khoản", "")
					);
		}
		
	}
	
	
	@GetMapping("/getDetail/{id}")
	ResponseEntity<ResponseObject> getDetailAccount(@PathVariable Long id) {
		Optional<Account> foundAccount = accountRepository.findById(id);
		if(foundAccount.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xem chi tiết tài khoản thành công", foundAccount)
					);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không tìm thấy tài khoản có: " + id, "")
					);
		}
	}
}
