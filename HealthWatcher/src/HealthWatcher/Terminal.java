package HealthWatcher;

import java.io.InputStream;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Terminal {

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
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter complaint data");
    	String complainData = sc.next();
    	System.out.println("Enter observations");
    	String observations = sc.next();
    	System.out.println("Enter name");
    	String name = sc.next();
    	System.out.println("Enter street");
    	String street = sc.next();
    	System.out.println("Enter complement");
    	String complement = sc.next();
    	System.out.println("Enter district");
    	String district = sc.next();
    	System.out.println("Enter city");
    	String city = sc.next();
    	System.out.println("Enter state");
    	String state = sc.next();
    	System.out.println("Enter zip code");
    	String zipCode = sc.next();
    	System.out.println("Enter telephone number");
    	String telephoneNumber = sc.next();
    	System.out.println("Enter email");
    	String email = sc.next();
    	System.out.println("type of animal");
    	String typeOfAnimal = sc.next();
    	
    	sc.close();

    }

    public void foodComplaintMenu(){
        FoodComplaint complaint = new FoodComplaint();
        Citizen citizen = new Citizen();
        //Se le piden los datos al usuario y se guardan
        //Se agrega la denuncia a la base de datos
    }

    public void specialComplaintMenu(){

    }
}
