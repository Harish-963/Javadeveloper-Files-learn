package com.practice.spring.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Airtel");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Data from Airtel");
	}

}
