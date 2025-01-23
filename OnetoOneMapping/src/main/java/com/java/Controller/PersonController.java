package com.java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.Entity.Person;
import com.java.Service.PersonService;

@RestController

public class PersonController {

	@Autowired
	PersonService service;
	@PostMapping("/add")
	public Person addPersonDetails(@RequestBody Person p) {
		return service.addPerson(p);
	}
	
	@GetMapping("/getAll")
	public List<Person> getAllPersonDetails(){
		return service.getAllPersons();
	}
	
	
	@PutMapping("/updateById{id}")
	public Person UpdateById(@RequestBody Person p) {
		return service.UpdateById(p);
	}
	
	@PutMapping("/updateByname{name}")
	public Person UpdateByName(@RequestBody Person p) {
		return service.UpdateByName(p);
	}
	@DeleteMapping("/DeleteById")
	public Person DeleteById(@RequestBody Person p) {
		return service.deleteById(p);
	}
}
