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
        FoodComplaint complaint = new FoodComplaint();
        Citizen citizen = new Citizen();
        //Se le piden los datos al usuario y se guardan
        //Se agrega la denuncia a la base de datos
    }

    public void specialComplaintMenu(){

    }
}
