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
}
