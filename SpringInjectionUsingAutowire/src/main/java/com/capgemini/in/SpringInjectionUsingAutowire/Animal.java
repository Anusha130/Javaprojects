package com.capgemini.in.SpringInjectionUsingAutowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Animal {
	String breed;
	
	@Autowired
	Heart heart;
	
	

	/**
	 * 
	 */
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param heart
	 */
	public Animal(Heart heart) {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void AnimalAlive() {
		heart.pumping();
	}

	}
