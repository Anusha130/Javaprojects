package com.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.Model.Person;
import com.java.Model.Vehicle;
@Configuration
public class PersonConfig {
	@Bean 
	public  Person per() {
		
	Person p = new Person();
	p.setFirstname("Anusha");
		return p;
	}

	/*
	 * @Bean public Person Name() { Person p1 = new Person();
	 * p1.setSecondname("Akuthota"); return p1;
	 * 
	 * }
	 */
@Bean
public Vehicle vech() {
	Vehicle v = new Vehicle();
	v.setVechname("honda");
	v.setVechprice(20000);
	return null;
	
}
}
