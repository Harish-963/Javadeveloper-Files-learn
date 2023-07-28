package com.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	
	/*
	 * public void setHeart(Heart heart) { this.heart = heart; }
	 */
	
	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name: "+heart.getNameOfAnimal()); 
			System.out.println("no of hearts: "+heart.getNoOfHeart());
		} else {
			System.out.println("Dead!");
		}
	}
	
	
	
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public Human() {
	}
}
