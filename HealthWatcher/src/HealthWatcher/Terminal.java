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

    public void animalComplaintMenu(){
    	Citizen citizen = new Citizen();
    	Location citizenLocation = new Location();
    	Location incidentLocation = new Location();
    	AnimalComplaint animalComplaint = new AnimalComplaint(citizen);
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("Enter complaint data");
    	animalComplaint.setDescription(sc.next()); 
    	
    	System.out.println("Enter observations");
    	String observations = sc.next();
    	animalComplaint.setObservation(observations);
    	
    	System.out.println("Enter name");
    	String name = sc.next();
    	citizen.setName(name);
    	
    	System.out.println("Enter street");
    	String street = sc.next();
    	citizenLocation.setStreet(street);
    	
    	System.out.println("Enter complement");
    	String complement = sc.next();
    	citizenLocation.setComplement(complement);
    	
    	System.out.println("Enter district");
    	String district = sc.next();
    	citizenLocation.setDistrict(district);
    	
    	System.out.println("Enter city");
    	String city = sc.next();
    	citizenLocation.setCity(city);
    	
    	System.out.println("Enter state");
    	String state = sc.next();
    	citizenLocation.setState(state);
    	
    	System.out.println("Enter zip code");
    	String zipCode = sc.next();
    	citizenLocation.setZIPCode(zipCode);
    	
    	citizen.setAddress(citizenLocation);
    	
    	System.out.println("Enter telephone number");
    	String telephoneNumber = sc.next();
    	citizen.setTelephoneNumber(telephoneNumber);
    	
    	System.out.println("Enter email");
    	String email = sc.next();
    	citizen.setEmail(email);
    	
    	animalComplaint.setComplainer(citizen);
    	
    	System.out.println("Enter animal type");
    	String animalType = sc.next();
    	animalComplaint.setAnimalType(animalType);
    	
    	System.out.println("Enter amount of animals");
    	int amountOfAnimals = sc.nextInt();
    	animalComplaint.setAmount(amountOfAnimals);
    	
    	System.out.println("Enter date problem was observed");
    	String dateProblemWasObserved = sc.next();
    	
    	System.out.println("Enter location street");
    	String locationStreet = sc.next();
    	incidentLocation.setStreet(locationStreet);
    	
    	System.out.println("Enter location complement");
    	String locationComplement = sc.next();
    	incidentLocation.setComplement(locationComplement);
    	
    	System.out.println("Enter location district");
    	String locationDistrict = sc.next();
    	incidentLocation.setDistrict(locationDistrict);
    	
    	System.out.println("Enter location city");
    	String locationCity = sc.next();
    	incidentLocation.setCity(locationCity);
    	
    	System.out.println("Enter location state");
    	String locationState = sc.next();
    	incidentLocation.setState(locationState);
    	
    	System.out.println("Enter location zip code");
    	String locationZipCode = sc.next();
    	incidentLocation.setState(locationZipCode);
    	
    	System.out.println("Enter location telephone number");
    	String locationTelephoneNumber = sc.next();
    	incidentLocation.setTelephoneNumber(locationTelephoneNumber);
    	
    	animalComplaint.setLocation(incidentLocation);
    	
    	animalComplaint.setState('OPENED');
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
