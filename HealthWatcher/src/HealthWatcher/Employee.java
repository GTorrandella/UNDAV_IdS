package HealthWatcher;

public class Employee {
	private int idEmployee;
	private String name;
	private String surname;

	public Employee(int idEmp, String name, String surname) {
		this.idEmployee = idEmp;
		this.name = name;
		this.surname = surname;
	}
	
	public void showInformation() {
		System.out.println(name+surname);
	}
}
