package HealthWatcher;

public class FoodComplaint extends Complaint {
	private Citizen Victim; //Mandatory
	private int AmountEat; //Mandatory
	private int AmountSick; //Mandatory
	private int AmountHospitalized; //Mandatory
	private int AmountDead; //Mandatory
	private Location Hospital; //Optional
	private Location SuspMealPlace; //Optional
	
	public FoodComplaint(Citizen complainer) {
		super(complainer);
	}
	
	public Citizen getVictim() {
		return Victim;
	}
	public void setVictim(Citizen victim) {
		Victim = victim;
	}
	public int getAmountEat() {
		return AmountEat;
	}
	public void setAmountEat(int amountEat) {
		AmountEat = amountEat;
	}
	public int getAmountSick() {
		return AmountSick;
	}
	public void setAmountSick(int amountSick) {
		AmountSick = amountSick;
	}
	public int getAmountHospitalized() {
		return AmountHospitalized;
	}
	public void setAmountHospitalized(int amountHospitalized) {
		AmountHospitalized = amountHospitalized;
	}
	public int getAmountDead() {
		return AmountDead;
	}
	public void setAmountDead(int amountDead) {
		AmountDead = amountDead;
	}
	public Location getHospital() {
		return Hospital;
	}
	public void setHospital(Location hospital) {
		Hospital = hospital;
	}
	public Location getSuspMealPlace() {
		return SuspMealPlace;
	}
	public void setSuspMealPlace(Location suspMealPlace) {
		SuspMealPlace = suspMealPlace;
	}
	
	
}
