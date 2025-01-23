package com.cap.ServiceEurekhaDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.ServiceEurekhaDemo.Entity.User;
import com.cap.ServiceEurekhaDemo.repository.UserRepo;
import com.cap.ServiceEurekhaDemo.service.UserService;

public class ServiceImplementation implements UserService{
	
@Autowired
UserRepo repo;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

}
