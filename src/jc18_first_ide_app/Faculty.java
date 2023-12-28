package jc18_first_ide_app;

import java.util.List;
import java.util.ArrayList;

class Faculty extends UniversityMember {
	private String department;
	private List<String> coursesTeaching;

	public Faculty(String name, int id, String email, String department) {
		super(name, id, email);
		this.department = department;
		coursesTeaching = new ArrayList<>();
	}

	public void assignCourse(String courseName) {
		coursesTeaching.add(courseName);
	}

	@Override
	public void displayDetails() {
		System.out.println("Faculty Details:");
		System.out.println(toString());
		System.out.println("Department: " + department);
		System.out.println("Courses Teaching: " + coursesTeaching);
	}
}
