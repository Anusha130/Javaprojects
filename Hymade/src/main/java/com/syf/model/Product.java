package com.syf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String branch;
	private String dealer;
	private String promocode;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDealer() {
		return dealer;
	}
	public void setDealer(String dealer) {
		this.dealer = dealer;
	}
	public String getPromocode() {
		return promocode;
	}
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	public Product(int id,String branch, String dealer, String promocode) {
		super();
		this.id =id;
		this.branch = branch;
		this.dealer = dealer;
		this.promocode = promocode;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", branch=" + branch + ", dealer=" + dealer + ", promocode=" + promocode + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
