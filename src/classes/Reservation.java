package classes;
import java.util.Random;
import java.util.Arrays;
import classes.Passenger;
import classes.Flight;

public class Reservation {

    public static String[] from_location = {"Paris", "Berlin", "Spain","London"};
    public static String[] to_location = {"Poland", "Russia","Netherlands","Czech"};
    public static String[] date = {"12-04-22", "16-02-22","04-07-22","29-06-22"};
    public static int[] ticketPrice = {250,40,150,100};

    public static String  reservationCode;
    public static String  searchedLocation;
    private String  seatsInfo;
    public static String location;



    public Reservation(){

        reservationCode = "undefinded";

    }

    public Reservation(String reservationCode) {

        setValues(reservationCode);
    }

    public void setValues(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public static String  setResCode(){
        String resCode;
        Random rand = new Random();
        int maxNum = 10000;
        int randNum = rand.nextInt(maxNum);
        reservationCode = "A" + randNum;
        return  reservationCode;
    }

    public static String[] findFlight(String searchedLocation){
        String loc = searchedLocation;
        String arr[] = new String[5];
        loc.toString();
        for(int i = 0; i < from_location.length;i++){
            if (searchedLocation == from_location[i] ){
                Flight Lot1 = new Flight(ticketPrice[i], "300","sdsd", from_location[i], to_location[i],
                        date[i],"15-03-22");

                arr[0] = Lot1.getFrom_location();
                arr[1] = Lot1.getTo_location();
                arr[2] = Lot1.getTotalSeats();
                arr[3] = Lot1.getFlightDepartureDate();

                loc =   "Flight founded from " + from_location[i] + " to " + to_location[i] + " Date " + date[i] +
              " " + ticketPrice[i] + "zł";
                System.out.println(loc);
                break;
            }else if(searchedLocation == "-"){
                  arr[0] = "Wybierz miasto";
                System.out.println(loc);

            }
        }

        return arr;
    }
    public static String[] findFlight2(String searchedLocation){
        String loc = searchedLocation;
        String arr[] = new String[5];
        loc.toString();
        for(int i = 0; i < from_location.length;i++){
            if (searchedLocation == to_location[i] ){
                Flight Lot1 = new Flight(ticketPrice[i], "300","sdsd", from_location[i], to_location[i],
                        date[i],"16-03-22");

                arr[0] = Lot1.getFrom_location();
                arr[1] = Lot1.getTo_location();
                arr[2] = Lot1.getTotalSeats();
                arr[3] = Lot1.getFlightDepartureDate();

                loc =   "Flight founded from " + from_location[i] + " to " + to_location[i] + " Date " + date[i] +
                        " " + ticketPrice[i] + "zł";
                System.out.println(loc);
                break;
            }else if(searchedLocation == "-"){
                arr[0] = "Wybierz miasto";
                System.out.println(loc);

            }
        }

        return arr;
    }

    public static String[] findFlight3(String searchedLocation){
        String loc = searchedLocation;
        String arr[] = new String[5];
        loc.toString();
        for(int i = 0; i < from_location.length;i++){
            if (searchedLocation == date[i] ){
                Flight Lot1 = new Flight(ticketPrice[i], "300","sdsd", from_location[i], to_location[i],
                        date[i],"12-03-22");

                arr[0] = Lot1.getFrom_location();
                arr[1] = Lot1.getTo_location();
                arr[2] = Lot1.getTotalSeats();
                arr[3] = Lot1.getFlightDepartureDate();

                loc =   "Flight founded from " + from_location[i] + " to " + to_location[i] + " Date " + date[i] +
                        " " + ticketPrice[i] + "zł";
                System.out.println(loc);
                break;
            }else if(searchedLocation == "-"){
                arr[0] = "Wybierz miasto";
                System.out.println(loc);

            }
        }

        return arr;

    }

    public static String[] passengerList = {};
    public static String makeReservation(String firstName, String lastName, String reservationCode,String avilibeSeats){
        String passList;

        passengerList = Arrays.copyOf(passengerList, passengerList.length + 1);
        passengerList[passengerList.length - 1] = firstName + " " + lastName + " " + reservationCode + " " + avilibeSeats;
      passList = Arrays.toString(passengerList);
            System.out.println(Arrays.toString(passengerList));
      return passList;

    }
    public static void cancelReservation(String firstName, String lastName, String reservationCode,int avilibeSeats){
        passengerList = Arrays.copyOf(passengerList, passengerList.length - 1);
        System.out.println(Arrays.toString(passengerList));

    }


//    public static void findFlightTest(String searchedLocation){
//        String loc = searchedLocation;
//        Flight test = null;
//        String arr[] = new String[5];
//        loc.toString();
//        for(int i = 0; i < from_location.length;i++){
//            if (from_location ){
//                Flight  Lot1 = new Flight(ticketPrice[i], "300", "sdsd", from_location[i], to_location[i],
//                        date[i], "15-03-22");
//
//
//                arr[0] = Lot1.getFrom_location();
//                arr[1] = Lot1.getTo_location();
//                arr[2] = Lot1.getTotalSeats();
//                arr[3] = Lot1.getFlightDepartureDate();
//
//            test = Lot1;
//                loc =   "Flight founded from " + from_location[i] + " to " + to_location[i] + " Date " + date[i] +
//                        " " + ticketPrice[i] + "zł";
//                System.out.println(loc);
//                break;
//            }else if(searchedLocation == "-"){
//                arr[0] = "Wybierz miasto";
//                System.out.println(loc);
//                break ;
//
//            }
//        }
//        System.out.println();
//    return test;
//
//    }




}
