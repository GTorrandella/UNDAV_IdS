package HealthWatcher;

import java.io.InputStream;
import java.util.Calendar;
import java.util.LinkedList;
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
    	Citizen citizen = dataCitizen();
    	AnimalComplaint animalComplaint = new AnimalComplaint(citizen);
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter complaint data");
    	animalComplaint.setDescription(sc.next()); 
    	
    	System.out.println("Enter observations");
    	String observations = sc.next();
    	animalComplaint.setObservation(observations);
    	
    	System.out.println("Enter animal type");
    	String animalType = sc.next();
    	animalComplaint.setAnimalType(animalType);
    	
    	System.out.println("Enter amount of animals");
    	int amountOfAnimals = sc.nextInt();
    	animalComplaint.setAmount(amountOfAnimals);
    	
    	System.out.println("Enter date problem was observed");
    	String dateProblemWasObserved = sc.next();
    	animalComplaint.setDate(dateProblemWasObserved);
    	
    	System.out.println("Enter where the problem happend");
    	animalComplaint.setLocation(createLocation());
    	
    	animalComplaint.setState(State.OPENED);;
    	database.addComplaint(animalComplaint);
    	
    	System.out.println("Your complaint number is: " + animalComplaint.getComplaintID());
    	
    	sc.close();

    }

    public void foodComplaintMenu(){
        FoodComplaint foodComplaint = new FoodComplaint();
        Citizen citizen = new Citizen();
        //Se le piden los datos al usuario y se guardan
        //Se agrega la denuncia a la base de datos
    }

    public void specialComplaintMenu(){

    }
}
