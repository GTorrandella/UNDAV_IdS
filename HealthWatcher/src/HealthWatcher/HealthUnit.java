package HealthWatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HealthUnit {
	private int idHealthUnit;
	private Location adress;
	private String name;
	private HashMap<String,Specialty> specialties;
	private ArrayList <Employee> employees;
	
	public String getName() {
		return name;
	}
	
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
	
	public void addSpecialty(Specialty e) {
		this.specialties.put(e.getName(), e);
	}
	
	public HealthUnit(int id, Location adress, String name){
		this.idHealthUnit = id;
		this.adress = adress;
		this.name = name;
	}
	
	public void showMinimumInformation() {
		System.out.println("\t\t"+name);
		System.out.println("\nAdress:");
	}
	
	public void showAllInformation() {
		showMinimumInformation();
		adress.showInformation();
		showSpecialtiesInformation();
		showEmployeesInformation();
	}
	
	private void showSpecialtiesInformation() {
		Iterator<Entry<String,Specialty>> i = specialties.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry<String,Specialty> s = (Map.Entry<String,Specialty>) i.next();
			Specialty specialtyToShow = s.getValue();
			specialtyToShow.showInformation();
		}
	}
	
	public Boolean hasSpecialty(String specialtyToLook) {
		return specialties.containsKey(specialtyToLook);
	}
	
	private void showEmployeesInformation() {
		Iterator i = employees.iterator();
		while(i.hasNext()){
			Employee e = (Employee) i.next();
			e.showInformation();
		}
	}
}
