package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.dto.AccountDto;
import com.task.service.AccountService;

@RestController
@RequestMapping("api")
public class AccountController {


	@Autowired
	private AccountService accountservice;
	
	
	
@PostMapping("/addaccount")
public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
	return new ResponseEntity<>(accountservice.createAccount(accountDto),HttpStatus.CREATED);
	}
	
@GetMapping("/{id}")
public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
	AccountDto accountdto = accountservice.getAccountById(id);
	return ResponseEntity.ok(accountdto);
}
/*
 * @GetMapping("/getAll") public List<AccountDto> getAllaccounts(){ return
 * accountservice.getAllaccounts(); }
 */
	
	
	
	
	
	
	
	
}
