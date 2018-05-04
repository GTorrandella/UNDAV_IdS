package HealthWatcher;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Database {
    private LinkedList<Complaint> complaints;
    private HashMap<String,Employee> pass;
    private HashMap<String,HealthUnit> healthUnits;
    private HashMap<String,Disease> diseasies;

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
    }
    
    public boolean verifyEmployee(String name, String surname, String password) {
    	return pass.containsKey(name+password+surname);
    }
    
    public void addEmployee(String name, String surname, String password) {
    	pass.put(name+password+surname, new Employee(pass.size()+1, name, surname));
    }
    
    public void deleteEmployee(String name, String surname, String password) {
    	pass.remove(name+password+surname);
    }
    
    public Employee returnEmployee(String name, String surname, String password) {
    	return pass.get(name+password+surname);
    }
    
    public void modifyEmployeePassword(String name, String surname, String password, String newPassword) {
    	pass.put(name+newPassword+surname, pass.get(name+password+surname));
    	pass.remove(name+password+surname);
    }
    
    public void addHealthUnit(HealthUnit hu) {
    	healthUnits.put(hu.getName(), hu);
    }
    
    public ArrayList<HealthUnit> searchHealthUnitBySpecialty(String specialty) {
    	ArrayList<HealthUnit> healthUnitsBySpecialty = new ArrayList<HealthUnit>();
    	
    	Iterator<Entry<String,HealthUnit>> i = healthUnits.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry<String,HealthUnit> actualHealthUnit = (Map.Entry<String,HealthUnit>) i.next();
			if (actualHealthUnit.getValue().hasSpecialty(specialty)) {
				healthUnitsBySpecialty.add(actualHealthUnit.getValue());
			}
		}
		
		return healthUnitsBySpecialty;
    }
    
    public HealthUnit searchHealtUnitByName(String name) {
    	return healthUnits.get(name);
    }
    
    public Disease searchDiesaseByName(String name) {
    	return diseasies.get(name);
    }
    
    public Complaint searchComplaint(String idComplaint) {
    	Complaint complaintToLookUp = null;
    	Iterator i = complaints.iterator();
    	while(i.hasNext()) {
    		Complaint aux = (Complaint) i.next();
    		if (aux.getComplaintID() == idComplaint ) {
    			complaintToLookUp = aux;
    		}
    	}
    	return complaintToLookUp;
    }
    
    public ArrayList<String> getDiseaseNames() {
    	ArrayList<String> diseaseNames = null;
    	
    	Iterator<Entry<String,Disease>> i = diseasies.entrySet().iterator();
		while(i.hasNext()){
			diseaseNames.add(((Map.Entry<String,Disease>) i.next()).getKey());
		}
		
    	return diseaseNames;
    }
    
    public ArrayList<String> getComplaintsIds() {
    	ArrayList<String> complaintsId = null; 
    	Iterator i = complaints.iterator();
    	while(i.hasNext()) {
    		complaintsId.add(((Complaint)i.next()).getComplaintID());
    	}
    	return complaintsId;
    }
    
    public ArrayList<String> getHealthUnitsNames(){
    	ArrayList<String> healthUnitsNames = null;
    	
    	Iterator<Entry<String,HealthUnit>> i = healthUnits.entrySet().iterator();
		while(i.hasNext()){
			healthUnitsNames.add(((Map.Entry<String,HealthUnit>) i.next()).getKey());
		}
		
    	return healthUnitsNames;   	
    }
    
    public ArrayList<String> getSpecialtiesNames(){
    	ArrayList<String> specialtiesNames = null;
    	
    	Iterator<Entry<String,HealthUnit>> i = healthUnits.entrySet().iterator();
		while(i.hasNext()){
			specialtiesNames.addAll(((Map.Entry<String,HealthUnit>) i.next()).getValue().getSpecialtiesNames());
		}
		
    	return specialtiesNames;   	
    }
}
