package HealthWatcher;

import java.util.LinkedList;
import java.util.HashMap;

public class Database {
    private LinkedList<Complaint> complaints;
    private HashMap<String,Boolean> pass;

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
    }
    
    public boolean verifyEmployee(String user, String password) {
    	return pass.containsKey(user+password);
    }
    
    public void addEmployee(String user, String password) {
    	pass.put(user+password, true);
    }
    
    public void deleteEmployee(String user, String password) {
    	pass.remove(user+password);
    }
}
