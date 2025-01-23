package com.javainspire.jdbctemplate.model;

public class Employee {

	private int id;
	private String name;
	private String email;
	private double salary;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(int id, String name, String email, double salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.gender = gender;
	}
	
}
