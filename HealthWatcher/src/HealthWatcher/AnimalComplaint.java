package HealthWatcher;

import java.util.Calendar;

public class AnimalComplaint extends Complaint {
	private String AnimalType; //Mandatory
	private int Amount; //Mandatory
	private Calendar Date; //Mandatory
	private Location Location; //Optional
}
