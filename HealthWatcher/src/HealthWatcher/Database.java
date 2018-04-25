package HealthWatcher;

import java.util.LinkedList;

public class Database {
    private LinkedList<Complaint> complaints;

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
    }
}
