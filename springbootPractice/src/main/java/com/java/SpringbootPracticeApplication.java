package com.java;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.java.Model.Person;
import com.java.Model.Vehicle;

@SpringBootApplication
public class SpringbootPracticeApplication  {
	
	
		public static void main(String[] args) {
		var Context = SpringApplication.run(SpringbootPracticeApplication.class, args);
		Person person = Context.getBean(Person.class);

		System.out.println("person name from spring context is:"+person.getFirstname());
		System.out.println("person name from spring context is:"+person.getFirstname());
		System.out.println("vechicle name from spring context is:"+Vehicle.getVechname());
		System.out.println("vechicleprice from spring context is:"+Vehicle.getVechprice());
		}

}
