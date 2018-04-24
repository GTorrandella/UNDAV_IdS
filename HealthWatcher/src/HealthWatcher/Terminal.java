package HealthWatcher;

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

    }

    public void foodComplaintMenu(){

    }

    public void specialComplaintMenu(){

    }
}
