package HealthWatcher;

public class Citizen {
	private String Name; //Optional (Mandatory if FoodComplaint victim)
	private Location Address; //Optional
	private String TelephoneNumber; //Optional
	private String Email; //Optional
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Location getAddress() {
		return Address;
	}
	public void setAddress(Location address) {
		Address = address;
	}
	public String getTelephoneNumber() {
		return TelephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		TelephoneNumber = telephoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}
