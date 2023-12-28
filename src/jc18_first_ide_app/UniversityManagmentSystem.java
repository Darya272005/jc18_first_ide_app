package jc18_first_ide_app;

public class UniversityManagmentSystem {
	public static void main(String[] args) {
		Student student = new Student("Иванов Иван", 10, "ivan.com");
		student.addCourse("Математика");
		student.addCourse("Физика");
		student.displayDetails();

		System.out.println();

		Faculty faculty = new Faculty("Иванов Иван", 10, "ivan@.com", "Компьютерного проектирования");
		faculty.assignCourse("Программирование");
		faculty.displayDetails();

		System.out.println();

		Staff staff = new Staff("Смирнов Павел", 7, "smirnov@.example.com", "Администратор", "Менеджер");
		staff.displayDetails();

		System.out.println();

		Research researchStudent = new ResearchStudent("Михайлова Юля", 5, "ulia@.example.com");
		researchStudent.conductResearch();

		System.out.println();

		Research researchFaculty = new ResearchFaculty("Огиенко Надя", 6, "ognd@.example.com", "Физика");
		researchFaculty.conductResearch();
	}
}
