package com.task.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	    @Id
		private int id;
		private String firstname;
		private int age;
		private String city;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstname;
		}
		public void setFirstName(String firstname) {
			this.firstname = firstname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Student(int id, String firstname, int age, String city) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.age = age;
			this.city = city;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", firstname=" + firstname + ", age=" + age + ", city=" + city + "]";
		}
		
	}

