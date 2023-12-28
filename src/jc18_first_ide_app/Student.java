package jc18_first_ide_app;

import java.util.List;
import java.util.ArrayList;

class Student extends UniversityMember {
	private List<String> courseList;
	private double gpa;

	public Student(String name, int id, String email) {
		super(name, id, email);
		courseList = new ArrayList<>();
		gpa = 0.0;
	}

	public void addCourse(String courseName) {
		courseList.add(courseName);
	}

	@Override
	public void displayDetails() {
		System.out.println("Информация о студенте:");
		System.out.println(toString());
		System.out.println("Список курсов: " + courseList);
		System.out.println("Средний балл: " + gpa);
	}
}
