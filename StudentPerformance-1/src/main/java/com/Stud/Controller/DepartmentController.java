package com.Stud.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Stud.Model.Department;
import com.Stud.Service.DepartmentService;


@RestController
@RequestMapping("/Department")
public class DepartmentController {
	
    @Autowired
    DepartmentService service;
    
    @PostMapping("/add")
   public ResponseEntity<String> addSubject(@RequestBody Department d){
    	 service.addSubject(d);
    	
    	return new ResponseEntity<String> ("Details insertes successfully", HttpStatus.OK);
    }
    
}
