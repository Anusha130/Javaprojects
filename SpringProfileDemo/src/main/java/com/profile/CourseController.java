package com.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/Concurrency-configuration")
	public  CurrencyServiceConfiguration retriveAllCourses(){
		 return configuration;
	}
	
	
	public Course addCourse(@RequestBody Course cou) {
		return addCourse(cou);
	}
	
}
