package com.practice.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/spring/di/beans.xml");
		Student student = context.getBean("student", Student.class);
		student.cheating();

		Student2 student2 = context.getBean("student2", Student2.class);
		student2.cheating();

	}

}
