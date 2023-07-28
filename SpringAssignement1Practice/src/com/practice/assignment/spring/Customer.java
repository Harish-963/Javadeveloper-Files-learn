package com.practice.assignment.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/assignment/spring/beans.xml");
		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.activateService();

	}

}
