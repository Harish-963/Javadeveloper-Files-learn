package com.practice.spring.di;

public class Student {

	private int id;

	private String studentName;
	
	
	//for constructor injection
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public Student(int id) {
		this.id = id;
	}




	public void displayStudentInfo() {
		System.out.println("Student name is : " + studentName +"\t and the id is : "+id);
	}

	//for setter injection
	/*
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

}
