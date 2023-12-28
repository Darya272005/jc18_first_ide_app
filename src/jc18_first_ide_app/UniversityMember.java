package jc18_first_ide_app;

abstract class UniversityMember {
	private String name;
	private int id;
	private String email;

	public UniversityMember(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public abstract void displayDetails();

	@Override
	public String toString() {
		return "Name: " + name + ", ID: " + id + ", Email: " + email;
	}
}
