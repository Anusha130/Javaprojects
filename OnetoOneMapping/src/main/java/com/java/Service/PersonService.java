package com.java.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Entity.Person;
import com.java.Repository.PersonRepository;

@Service
public class PersonService {
@Autowired
PersonRepository repo;
	public Person addPerson(Person p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return  repo.findAll();
	}
	public Person UpdateById(Person p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}
	public Person UpdateByName(Person p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}
	public Person deleteById(Person p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}
	

}
