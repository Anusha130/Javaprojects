package com.Stud.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "studentdetails")

public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "roll_number",nullable = false)
	private int roll_number;
	private String firstName;
	private String lastName;
    
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "student")
	private  Department department;

	public int getRollnumber() {
		return roll_number;
	}

	public void setRollnumber(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Student(int roll_number, String firstName, String lastName) {
		super();
		this.roll_number = roll_number;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public Student() {

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + department + "]";
	}

	
	
}


