package HealthWatcher;

public class FoodComplaint extends Complaint {
	private Citizen Victim; //Mandatory
	private int AmountEat; //Mandatory
	private int AmountSick; //Mandatory
	private int AmountHospitalized; //Mandatory
	private int AmountDead; //Mandatory
	private Location Hospital; //Optional
	private Location SuspMealPlace; //Optional
}
