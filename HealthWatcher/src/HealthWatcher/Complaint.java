package HealthWatcher;

import java.util.Calendar;

public abstract class Complaint {
	private String Description; //Mandatory
	private String Observation; //Optional
	private Citizen Complainer; //Optional
	private State state; //Mandatory
	private Calendar RegistrationDate; //Mandatory
}
