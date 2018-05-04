package HealthWatcher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Terminal {
	private Database database;
	private String employee;

    public void mainMenu(){
    	Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
            	makeComplaint();
            case 2:
            	makeQueryMenu();
            	break;
            case 9:
            	employeesMenu();
            default:
                break;
        }
        sc.close();
    }
    
    private void makeComplaint() {
        //Citizen selects the kind of complaint
    	Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
    	case 1:
	        animalComplaintMenu();
	        break;
	    case 2:
	        foodComplaintMenu();
	        break;
	    case 3:
	        specialComplaintMenu();
	        break;
    	}
    	sc.close();
    }
    
    private Citizen dataCitizen() {
    	Citizen citizen = new Citizen();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter name");
    	String name = sc.next();
    	citizen.setName(name);
    	
    	citizen.setAddress(createLocation());
    	
    	System.out.println("Enter telephone number");
    	String telephoneNumber = sc.next();
    	citizen.setTelephoneNumber(telephoneNumber);
    	
    	System.out.println("Enter email");
    	String email = sc.next();
    	citizen.setEmail(email);
    	
    	sc.close();
    	
    	return citizen;
    }
    
    private Location createLocation() {
    	Location location = new Location();
    	
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter street");
    	String street = sc.next();
    	location.setStreet(street);
    	
    	System.out.println("Enter complement");
    	String complement = sc.next();
    	location.setComplement(complement);
    	
    	System.out.println("Enter district");
    	String district = sc.next();
    	location.setDistrict(district);
    	
    	System.out.println("Enter city");
    	String city = sc.next();
    	location.setCity(city);
    	
    	System.out.println("Enter state");
    	String state = sc.next();
    	location.setState(state);
    	
    	System.out.println("Enter zip code");
    	String zipCode = sc.next();
    	location.setZIPCode(zipCode);
    	
    	sc.close();
    	
    	return location;
    }
    
    private void animalComplaintMenu(){
    	AnimalComplaint animalComplaint = new AnimalComplaint(dataCitizen());
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter complaint data");
    	animalComplaint.setDescription(sc.next()); 
    	
    	System.out.println("Enter observations");
    	animalComplaint.setObservation(sc.next());
    	
    	System.out.println("Enter animal type");
    	animalComplaint.setAnimalType(sc.next());
    	
    	System.out.println("Enter amount of animals");
    	animalComplaint.setAmount(sc.nextInt());
    	
    	System.out.println("Enter date problem was observed");
    	animalComplaint.setDate(sc.next());
    	
    	System.out.println("Enter where the problem happend");
    	animalComplaint.setLocation(createLocation());
    	
    	animalComplaint.setState(State.OPENED);
    	database.addComplaint(animalComplaint);
    	
    	System.out.println("Your complaint number is: " + animalComplaint.getComplaintID());
    	
    	sc.close();
    }

    private void foodComplaintMenu(){
        FoodComplaint foodComplaint = new FoodComplaint(dataCitizen());
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter information for any of the victims");
    	foodComplaint.setVictim(dataCitizen());
    	
    	System.out.println("Enter how many people ate");
    	foodComplaint.setAmountEat(sc.nextInt());
    	
    	System.out.println("Of those, how many became sick?");
    	foodComplaint.setAmountSick(sc.nextInt());

    	System.out.println("How many where hospitalized?");
    	foodComplaint.setAmountHospitalized(sc.nextInt());

    	System.out.println("How many died?");
    	foodComplaint.setAmountDead(sc.nextInt());
    	
        System.out.println("Enter where the people where hospitalized");
    	foodComplaint.setHospital(createLocation());
    	
    	System.out.println("Enter where the people ate the food");
    	foodComplaint.setSuspMealPlace(createLocation());
    	
    	foodComplaint.setState(State.OPENED);
    	database.addComplaint(foodComplaint);
    	
    	System.out.println("Your complaint number is: " + foodComplaint.getComplaintID());
    	
    	sc.close();
    }

    private void specialComplaintMenu(){
        SpecialComplaint specialComplaint = new SpecialComplaint(dataCitizen());
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter your age");
    	specialComplaint.setAge(sc.nextShort());

    	System.out.println("Enter yours qualifications");
    	specialComplaint.setQualification(sc.next());

    	System.out.println("Enter your occupation");
    	specialComplaint.setOccupation(sc.next());
    	
    	System.out.println("Where the problem happened");
    	specialComplaint.setLocation(createLocation());
    	
    	specialComplaint.setState(State.OPENED);
    	database.addComplaint(specialComplaint);
    	
    	System.out.println("Your complaint number is: " + specialComplaint.getComplaintID());
    	
    	sc.close();
    }
    
    private void makeQueryMenu() {
    	System.out.println("What do you want to search?");
    	System.out.println("\t1: Health Guide");
    	System.out.println("\t2: Specialy Information");
    	Scanner sc = new Scanner(System.in);
    	
    	switch (sc.nextInt()) {
    	case 1:
    		healthGuideQuery();
    		break;
    	case 2:
    		specialtyInformationQuery();
    		break;
    	default:
    		break;
    	}
    	
    	sc.close();
    }
    
    private void healthGuideQuery(){
    	System.out.println("What do you want to search?");
    	System.out.println("\t1: Which health units take care of a specific specialty.");
    	System.out.println("\t2: What are the specialties of a particular health unit.");
    	Scanner sc = new Scanner(System.in);
    	
    	switch (sc.nextInt()) {
    	case 1:
    		searchBySpecialty();
    		break;
    	case 2:
    		searchByHeatlUnit();
    		break;
    	default:
    		break;
    	}
    	
    	sc.close();
    	
    }
    
    private void specialtyInformationQuery(){
    	
    }
    
    private void searchBySpecialty() {	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("\n\nType Specialty to search: ");
    	String specialtyToLook = sc.next();
    	ArrayList<HealthUnit> hUnits = database.searchHealthUnitBySpecialty(specialtyToLook);
    	Iterator<HealthUnit> i = hUnits.iterator();
    	
    	if (!i.hasNext()) {
    		System.out.println("\nNo health unit was found that treated "+specialtyToLook);
    	}
    	
    	else {
    		System.out.println("\nThe next health units treat "+specialtyToLook);
    		while(i.hasNext()) {
    			i.next().showMinimumInformation();
    		}
    	}
    	
    	sc.close();
    }
    
    private void searchByHeatlUnit() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("\n\nType the name of the health unit to search: ");
    	String huToLook = sc.next();
    	HealthUnit hUnits = database.searchHealtUnitByName(huToLook);
    	
    	if (hUnits == null) {
    		System.out.println("\nNo health unit was found with this name: "+huToLook);
    	}
    	
    	else {
    		System.out.println("\nThe next health units treat "+huToLook);
    		hUnits.showMinimumInformation();
    	}
    	
    	sc.close();
    }
    
    private void employeesMenu() {
    	System.out.println("Employees Menu");
    	System.out.println("\t1: Login.");
    	System.out.println("\t2: Add Employee.");
    	System.out.println("\t3: Modify Employee.");
    	System.out.println("\t4: Delete Employee.");
    	System.out.println("\t5: Logout.");
    	Scanner sc = new Scanner(System.in);
    	
    	switch (sc.nextInt()){
			case 1:
				loginEmployee();
				break;
			case 2:
				addEmployee();
				break;
			case 3:
				modifyEmployee();
				break;
			case 4:
				deleteEmployee();
				break;
			case 5:
				logout();
				break;
			default:
				break;
    	}
    	
    	sc.close();
    }

	private void loginEmployee() {
    	Scanner sc = new Scanner(System.in);
    	String name, surname, password;

    	System.out.print("\nEnter your firt name: ");
    	name = sc.next();
    	
    	System.out.print("\n\nEnter your last name: ");
    	surname = sc.next();
    	
    	System.out.println("\n\nEnter your password:");
    	password = sc.next();
    	
    	if (database.verifyEmployee(name, surname, password)) {
    		System.out.println("Access autorized");
    		this.employee= name;
    	}
    	
    	else System.out.println("Access denied");
    	
    	sc.close();
    }
    
    private void addEmployee() {
    	Scanner sc = new Scanner(System.in);
    	String name, surname, password;

    	System.out.print("\nEnter your firt name: ");
    	name = sc.next();
    	
    	System.out.print("\n\nEnter your last name: ");
    	surname = sc.next();
    	
    	System.out.println("\n\nEnter your password:");
    	password = sc.next();
    	
    	database.addEmployee(name, surname, password);
    	System.out.println("Employee added to database");
    	
    	sc.close();
    }   
    
    private void modifyEmployee() {
    	Scanner sc = new Scanner(System.in);
    	String name, surname, password;

    	System.out.print("\nEnter your firt name: ");
    	name = sc.next();
    	
    	System.out.print("\n\nEnter your last name: ");
    	surname = sc.next();
    	
    	System.out.println("\n\nEnter your password:");
    	password = sc.next();
    	
    	if (database.verifyEmployee(name, surname, password))  {
    		String newPass1 = "faf", newPass2 = "afa";
    		while (newPass1 != newPass2) {
    			System.out.println("\n\nEnter your new password:");
    	    	newPass1 = sc.next();

    			System.out.println("\n\nEnter your new password again:");
    	    	newPass2 = sc.next();
    		}
    		database.modifyEmployeePassword(name, surname, password, newPass1);
    	}
    	else System.out.println("Employee not found");
    	sc.close();
    	
    }
    
    private void deleteEmployee() {
    	Scanner sc = new Scanner(System.in);
    	String name, surname, password;

    	System.out.print("\nEnter your firt name: ");
    	name = sc.next();
    	
    	System.out.print("\n\nEnter your last name: ");
    	surname = sc.next();
    	
    	System.out.println("\n\nEnter your password:");
    	password = sc.next();
    	
    	database.deleteEmployee(name, surname, password);
    	System.out.println("Employee deleted");
    	
    	sc.close();
    	
    }

	private void logout(){
    	this.employee= "";
	}
}
