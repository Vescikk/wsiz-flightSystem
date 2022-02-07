package main;
import classes.Flight;
import classes.Passenger;
import classes.Reservation;
import classes.Connect;
import java.util.*;
import java.util.Arrays;
import classes.FlightSystem;

import javax.swing.*;


public class Main {

    public static void  main(String[] arg){
     //  Passenger Maciek = new Passenger("Maciek","Monarczyk",Reservation.setResCode());
     //  Passenger Paweł = new Passenger("Paweł","Monarczyk",Reservation.setResCode());
     //  Passenger Chuj = new Passenger("Marcin","Monarczyk",Reservation.setResCode());

       //Flight Lot1 = new Flight(123,300,"sdsd",
              // "Paris","Berlin","12-03-22","13-03-22");


       // Maciek.getFirstName();
     // Reservation.findFlight("Spain");
    Connect.connect();
    JFrame frame = new JFrame("FlightSystem");
        frame.setContentPane(new FlightSystem().panel1);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
       frame.setVisible(true);

       // Lot1.setTotalSeats(Lot1.getTotalSeats() -1);
       // Reservation.makeReservation(Maciek.getFirstName(),Maciek.getLastName(),Reservation.setResCode(),Lot1.getTotalSeats());
      //  Lot1.setTotalSeats(Lot1.getTotalSeats() -1);
       // Reservation.makeReservation(Maciek.getFirstName(),Maciek.getLastName(),Reservation.setResCode(),Lot1.getTotalSeats());

    }




}
