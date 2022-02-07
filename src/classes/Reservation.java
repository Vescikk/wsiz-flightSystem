package classes;
import java.util.Random;
import java.util.Arrays;
import classes.Passenger;

public class Reservation {

    public static String[] from_location = {"Paris", "Berlin", "Spain","London"};
    public static String[] to_location = {"Poland", "Russia","Netherlands","Czech"};
    public static String[] date = {"12-04-22", "16-02-22","04-07-22","29-06-22"};

    public static String  reservationCode;
    public static String  searchedLocation;
    private String  seatsInfo;
    public static String location;



    public Reservation(){
        reservationCode = "undefinded";

    }

    public static String  setResCode(){
        String resCode;
        Random rand = new Random();
        int maxNum = 10000;
        int randNum = rand.nextInt(maxNum);
        reservationCode = "A" + randNum;
        return  reservationCode;
    }

    public static String findFlight(String searchedLocation){
        String loc = searchedLocation;
        loc.toString();
        for(int i = 0; i < from_location.length;i++){
            if (searchedLocation == from_location[i] ){
              loc =   "Flight founded from " + from_location[i] + " to " + to_location[i] + " Date " + date[i];
                System.out.println(loc);
                break;
            }else{
                  loc = "Error";
                System.out.println(loc);

            }
        }
        return loc;
    }

    public static String[] passengerList = {};
    public static void makeReservation(String firstName, String lastName, String reservationCode,int avilibeSeats){
        passengerList = Arrays.copyOf(passengerList, passengerList.length + 1);
        passengerList[passengerList.length - 1] = firstName + " " + lastName + " " + reservationCode + " " + avilibeSeats;
        System.out.println(Arrays.toString(passengerList));

    }
    public static void cancelReservation(String firstName, String lastName, String reservationCode,int avilibeSeats){
        passengerList = Arrays.copyOf(passengerList, passengerList.length - 1);
        System.out.println(Arrays.toString(passengerList));

    }



}
