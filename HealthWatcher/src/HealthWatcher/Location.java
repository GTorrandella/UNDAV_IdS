package HealthWatcher;

public class Location {
	private String Street; //Optional
	private String Complement; //Optional
	private String District; //Optional
	private String City; //Optional
	private String State; //Optional
	private String ZIPCode; //Optional
	private String TelephoneNumber; //Optional
	
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getComplement() {
		return Complement;
	}
	public void setComplement(String complement) {
		Complement = complement;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZIPCode() {
		return ZIPCode;
	}
	public void setZIPCode(String zIPCode) {
		ZIPCode = zIPCode;
	}
	public String getTelephoneNumber() {
		return TelephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		TelephoneNumber = telephoneNumber;
	}
	
	
}
