package com.cap.ServiceEurekhaDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.ServiceEurekhaDemo.Entity.User;
import com.cap.ServiceEurekhaDemo.service.UserService;

@RestController
public class UserController {
@Autowired
UserService service;

@PostMapping
public User AddUser(@RequestBody User user) {
	return service.addUser(user);
}
}
