package HealthWatcher;

import java.util.Scanner;


public class Terminal {
	Database database;

    public void mainMenu(){
        //Citizen selects the kind of complaint
        int complaint = 0;
        switch (complaint) {
            case 1:
                animalComplaintMenu();
                break;
            case 2:
                foodComplaintMenu();
                break;
            case 3:
                specialComplaintMenu();
                break;
            default:
                break;
        }

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
    	
    	animalComplaint.setState(State.OPENED);;
    	database.addComplaint(animalComplaint);
    	
    	System.out.println("Your complaint number is: " + animalComplaint.getComplaintID());
    	
    	sc.close();

    	database.addComplaint(animalComplaint);
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
    	
    	sc.close();

    	database.addComplaint(foodComplaint);
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
    	
    	sc.close();

    	database.addComplaint(specialComplaint);
    }
}
