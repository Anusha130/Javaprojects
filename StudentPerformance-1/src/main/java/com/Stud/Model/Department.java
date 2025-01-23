package com.Stud.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Performance")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int hallticketId;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "roll_number")
	 
	 private Student student;
	
	
	 private int m1;
	 private int m2;
	 private int java;
	 private int c;
	 private int php;
	 
	 public Department() {
	 
	 	// TODO Auto-generated constructor stub
	 }

	
	public Department(Student student, int hallticketId, int m1, int m2, int java, int c, int php) {
		super();
		this.student = student;
		this.hallticketId = hallticketId;
		this.m1 = m1;
		this.m2 = m2;
		this.java = java;
		this.c = c;
		this.php = php;
	}


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getHallticketId() {
		return hallticketId;
	}

	public void setHallticketId(int hallticketId) {
		this.hallticketId = hallticketId;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getPhp() {
		return php;
	}

	public void setPhp(int php) {
		this.php = php;
	}

	@Override
	public String toString() {
		return "Department [student=" + student + ", hallticketId=" + hallticketId + ", m1=" + m1 + ", m2=" + m2
				+ ", java=" + java + ", c=" + c + ", php=" + php + "]";
	}

}
	 
	 
	
