package com.capgemini.in.SpringInjectionUsingAutowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	@Autowired
	Heart heart;

	
	
	
	/**
	 * 
	 */
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param heart
	 */

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void alive() {
		heart.pumping();
	}
}
