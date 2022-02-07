package classes;
import classes.Flight;
import classes.Reservation;



public class Passenger{

    public  void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private static String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
    private String resCode;
    //booked flights to implement

    public static String getFirstName() {
        return firstName;
    }

    public Passenger(){
        firstName = "undefined";
        lastName = "undefined";
        resCode = "undefined";
    }
    public Passenger(String firstName,String lastName, String resCode){
        setValues(firstName,lastName,resCode);
        System.out.println(firstName + " " + lastName + " " + resCode);
    }



    public void setValues(String firstName, String lastName, String resCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.resCode = resCode;
    }



}
