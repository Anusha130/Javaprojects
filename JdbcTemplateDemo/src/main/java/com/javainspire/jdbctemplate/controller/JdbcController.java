package com.javainspire.jdbctemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainspire.jdbctemplate.repository.JdbcRepository;

@RestController
@RequestMapping("user")
public class JdbcController {
	@Autowired
	JdbcRepository repo;
	
	@GetMapping("/getuser")
	public String check() {
		return "welcome to spring jdbc";
	}

	@GetMapping("/getall")
	public List<String> getAllUser(){
		return JdbcRepository.getAllUser();
	}
	
}
