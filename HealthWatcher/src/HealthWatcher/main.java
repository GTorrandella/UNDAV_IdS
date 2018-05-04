package HealthWatcher;

public class main {

	public static void main(String[] args) {
		Database database = new Database();
		
		Specialty s1 = new Specialty(1, "Pediatria", "");
		Specialty s2 = new Specialty(34, "Envenenamiento", "Por comida");
		
		HealthUnit h1 = new HealthUnit(1, new Location(), "Centro de Salud Colombo");
		h1.addSpecialty(s1);
		
		HealthUnit h2 = new HealthUnit(4, new Location(), "??");
		
		database.addHealthUnit(h1);
		database.addHealthUnit(h2);
		
		Disease d1 = new Disease("Measles", "Red spot over the boby", "Fever, tiredness", 14);

		database.addDisease(d1);
		
		Terminal ter = new Terminal(database);
		
		ter.mainMenu();
		
	}

}
