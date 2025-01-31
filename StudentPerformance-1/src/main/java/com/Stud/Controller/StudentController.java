package com.Stud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Stud.Model.Student;
import com.Stud.Service.StudentService;

@Controller
@RequestMapping("/insert")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/allstudents/{id}")
	public List<Student> allstudents(@PathVariable int roll_number){
		return service.allstudents();
		
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<String> addStudent(@RequestBody Student s) {
	 service.addstudent(s);
		return new ResponseEntity<String>("Record inserted successfully", HttpStatus.OK);
		

}
}


