package com.capg.DemoEurekaClient.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.DemoEurekaClient.Model.Student;
import com.capg.DemoEurekaClient.Service.StudentService;
@RequestMapping("anu")
@RestController

public class StudentController {
@Autowired
StudentService service;

@PostMapping("/add")
public Student addStudent(@RequestBody Student stu) {
	return service.addStudent(stu);
}

@GetMapping("/getAll")
public List<Student> getAllStudents(){
	return service.getAllStudents();
}

}
