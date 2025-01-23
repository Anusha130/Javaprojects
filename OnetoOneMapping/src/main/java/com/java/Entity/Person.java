package com.java.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private PanNum panno;
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
	public PanNum getPanno() {
		return panno;
	}
	public void setPanno(PanNum panno) {
		this.panno = panno;
	}
	public Person(int id, String name, PanNum panno) {
		super();
		this.id = id;
		this.name = name;
		this.panno = panno;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", panno=" + panno + "]";
	}
	

}
