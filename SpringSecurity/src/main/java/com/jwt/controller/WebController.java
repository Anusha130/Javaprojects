package com.jwt.controller;


import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;





@RestController

public class WebController {

	
	@GetMapping("/home")
	public String home() {
		return "This is Home page";
	}
	
	

}
