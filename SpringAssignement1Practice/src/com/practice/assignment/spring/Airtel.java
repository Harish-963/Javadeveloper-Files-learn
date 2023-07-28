package com.practice.assignment.spring;

public class Airtel {

	private Service service;

	public Airtel(Service service) {
		this.service = service;
	}
	
	public void activateService()
	{
		service.service();
	}
}
