package com.jwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.jwt.service.CustomUserDetailService;
@Configuration


public class SecurityConfig{
	
	
	
@Autowired
private CustomUserDetailService service;
   


}
