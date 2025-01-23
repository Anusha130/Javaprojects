package com.java.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pandetails")
public class PanNum {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pannum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PanNum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PanNum(int id, String pannum) {
		super();
		this.id = id;
		this.pannum = pannum;
	}

	public String getPannum() {
		return pannum;
	}

	public void setPannum(String pannum) {
		this.pannum = pannum;
	}

	@Override
	public String toString() {
		return "PanNum [id=" + id + ", pannum=" + pannum + "]";
	}

}
