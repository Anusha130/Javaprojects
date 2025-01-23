package com.java.Model;




public class Person {

	private String firstname;
	private String secondname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public Person(String firstname, String secondname) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", secondname=" + secondname + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
