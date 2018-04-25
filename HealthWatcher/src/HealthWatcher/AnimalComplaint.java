package HealthWatcher;

import java.util.Calendar;

public class AnimalComplaint extends Complaint {
	private String AnimalType; //Mandatory
	private int Amount; //Mandatory
	private Calendar Date; //Mandatory
	private Location Location; //Optional
	
	public AnimalComplaint (Citizen complainer){
		super(complainer);
	}

	public String getAnimalType() {
		return AnimalType;
	}

	public void setAnimalType(String animalType) {
		AnimalType = animalType;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public Calendar getDate() {
		return Date;
	}

	public void setDate(Calendar date) {
		Date = date;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}
	
	
	
}

