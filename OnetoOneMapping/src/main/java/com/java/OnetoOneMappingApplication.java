package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.Entity.Person;

@SpringBootApplication
public class OnetoOneMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetoOneMappingApplication.class, args);
	
	}

}