package HealthWatcher;

import java.util.Calendar;

public abstract class Complaint {
	private String ComplaintID; //Mandatory
	private String Description; //Mandatory
	private String Observation; //Optional
	private Citizen Complainer; //Optional
	private State state; //Mandatory
	private Calendar RegistrationDate; //Mandatory
	
	public Complaint (Citizen complainer){
		this.ComplaintID = "numeroID";
		this.Complainer = complainer;

	}

	public String getComplaintID() {
		return ComplaintID;
	}

	public void setComplaintID(String complaintID) {
		ComplaintID = complaintID;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getObservation() {
		return Observation;
	}

	public void setObservation(String observation) {
		Observation = observation;
	}

	public Citizen getComplainer() {
		return Complainer;
	}

	public void setComplainer(Citizen complainer) {
		Complainer = complainer;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Calendar getRegistrationDate() {
		return RegistrationDate;
	}

	public void setRegistrationDate(Calendar registrationDate) {
		RegistrationDate = registrationDate;
	}
	
	
}
