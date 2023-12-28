package jc18_first_ide_app;

class ResearchFaculty extends Faculty implements Research {
	public ResearchFaculty(String name, int id, String email, String department) {
		super(name, id, email, department);
	}

	@Override
	public void conductResearch() {
		System.out.println("Проведение исследований в качестве преподавателя...");
	}
}
