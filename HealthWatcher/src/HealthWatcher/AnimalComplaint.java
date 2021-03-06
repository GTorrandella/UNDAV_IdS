package HealthWatcher;

public class AnimalComplaint extends Complaint {
	private String AnimalType; //Mandatory
	private int Amount; //Mandatory
	private String Date; //Mandatory
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

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}
	
	
	
}

