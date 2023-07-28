package com.servelet.demo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("harish", "Alapati", "saiharisha@gmail.com"));
		students.add(new Student("Ramu", "sharma", "ranu@jjj.com"));
		students.add(new Student("faqook", "Md", "samba@gmail.com"));
		students.add(new Student("harsha", "sroma", "raki@gmail.com"));
		students.add(new Student("chandu", "kovi", "uma@gmail.com"));
		students.add(new Student("ravi", "sunkavali", "tapsee@gmail.com"));
		students.add(new Student("raju", "Nekalapudi", "mouni@gmail.com"));
		students.add(new Student("kumar", "bandi", "satish@gmail.com"));
		students.add(new Student("hemanth", "chitturi", "chandu@gmail.com"));
		students.add(new Student("gopi", "simhadri", "simhadri@gmail.com"));
		return students;
	}
}
