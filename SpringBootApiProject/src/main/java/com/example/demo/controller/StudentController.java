package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository repo;

	@PostMapping("/addStudent")
	public Student createStudent(@RequestBody Student s) {
		return repo.save(s);

	}

	@GetMapping("/getallStudents")
	public List<Student> getAllStudents() {
		return  repo.findAll();
	   // System.out.println(d);
		//return new ResponseEntity<List<Student>>(HttpStatus.OK);
		

	}

}
