package com.practice.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/spring/ioc/beans.xml");
	System.out.println("Config loaded");
	//by using the id and type casting.
	/*
	 * Airtel air = (Airtel) context.getBean("airtel"); air.calling(); air.data();
	 */
	
	//by passing the id and class name..
	/*
	 * VI vi = context.getBean("vi",VI.class); vi.calling(); vi.data();
	 */
	
	//using the interface as reference type
	Sim sim= context.getBean("sim",Sim.class);
	sim.calling();
	sim.data();
	}
}
											