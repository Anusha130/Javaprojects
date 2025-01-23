package com.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.entity.Person;

@Repository
public class Personrepo {

	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Person> findAll(){
		return jdbctemplate.query("select * from person",
				new BeanPropertyRowMapper(Person.class));
		//converts a row into a new instance of the specified mapped target class.
	}
	
	
}
