package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
Student s;
public void display() {
	System.out.println("hello employee");
}
}
