package HealthWatcher;

public class Specialty {
	private int idSpecialty;
	private String name;
	private String description;
	
	public Specialty(int id, String name, String description) {
		this.idSpecialty = id;
		this.name = name;
		this.description = description;
	}
	
	public void showInformation() {
		System.out.println(name+": "+description);
	}

	public String getName() {
		return name;
	}
}
