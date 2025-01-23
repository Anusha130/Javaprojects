package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jwt.entity.User;
import com.jwt.repository.UserRepository;
@Service
public class CustomUserDetailService {

	
	@Autowired
	private UserRepository  repo;

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
		
	}
	
	
	

}
