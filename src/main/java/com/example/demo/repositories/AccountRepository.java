package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

	List<Account> findByUserName(String userName);
}
