package jc18_first_ide_app;

class Staff extends UniversityMember {
	private String department;
	private String jobTitle;

	public Staff(String name, int id, String email, String department, String jobTitle) {
		super(name, id, email);
		this.department = department;
		this.jobTitle = jobTitle;
	}

	@Override
	public void displayDetails() {
		System.out.println("Информция о сотрудниках:");
		System.out.println(toString());
		System.out.println("Отделение: " + department);
		System.out.println("Должность: " + jobTitle);
	}
}

interface Research {
	void conductResearch();
}

class ResearchStudent extends Student implements Research {
	public ResearchStudent(String name, int id, String email) {
		super(name, id, email);
	}

	@Override
	public void conductResearch() {
		System.out.println("Проведение исследований будучи студентом...");
	}
}