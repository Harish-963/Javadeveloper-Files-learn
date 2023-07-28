package com.practice.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/spring/di/beans.xml");
		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();

		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/practice/spring/di/beans.xml");
		Student student1 = context1.getBean("student1", Student.class);
		student1.displayStudentInfo();
	}
}
