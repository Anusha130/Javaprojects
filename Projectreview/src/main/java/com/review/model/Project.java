package com.review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="host")
public class Project  {
	@Id
	private int id;
	

	private String name;
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
	public Project(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Project() {
		
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}
	
	

}
