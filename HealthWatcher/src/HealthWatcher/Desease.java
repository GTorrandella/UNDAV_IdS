package HealthWatcher;

public class Desease {
	private String name;
	private String description;
	private String symtoms;
	private int duration;		//en dias
	
	public Desease(String name, String des, String sym, int dur) {
		this.name = name;
		this.description = des;
		this.symtoms = sym;
		this.duration = dur;
	}
	
	public void showDesease() {
		System.out.println( "Desease: " + name +
				"\nDescription: " + description +
				"\nSymtoms: " + symtoms +
				"\nDuration (in days): "+ duration);
	}
}
