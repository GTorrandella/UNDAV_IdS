package HealthWatcher;

public class SpecialComplaint extends Complaint {
	private short Age; //Mandatory
	private String Qualification; //Optional
	private String Occupation; //Optional
	private Location Location; //Optional
	
	public SpecialComplaint(Citizen citizen) {
		super(citizen);
	}
	
	public short getAge() {
		return Age;
	}
	public void setAge(short age) {
		Age = age;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public Location getLocation() {
		return Location;
	}
	public void setLocation(Location location) {
		Location = location;
	}
}
