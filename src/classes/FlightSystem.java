package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightSystem extends  JFrame {

    public  JPanel panel1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton findBtn;
    private JTabbedPane tabbedPane1;
    private JLabel label;
    private JLabel resLabel;
    private JButton rezerwujButton;
    private JLabel from_label;
    private JLabel to_label;
    private JLabel to_value;
    private JLabel date_value;
    private JLabel seats_value;
    private JLabel price_value;
    public  static String test = "chujnia";

//    public void displayFlight(JComboBox component){
//        String value = component.getSelectedItem().toString();
//        Reservation.findFlightTest(value);
//        //Flight flight = Reservation.findFlightTest(value);
//       // System.out.println(flight);
//        System.out.println(value);
//       // return flight;
//    }


    public String[] displayFlight2(JComboBox component){
        String value = component.getSelectedItem().toString();
        String[] flight = Reservation.findFlight2(value);
        System.out.println(value);
        return flight;
    }
    public void displayFlightTest(JComboBox c1,JComboBox c2,
                                      JComboBox c3){
        String value1 = c1.getSelectedItem().toString();
        String value2 = c2.getSelectedItem().toString();
        String value3 = c3.getSelectedItem().toString();

        if(value1 != "-"){

        }else if (value2 != "-"){

        }else if (value3 != "-"){

        }else{
            System.out.println("Nic");
        }


        //String[] flight = Reservation.findFlight2(value);
      //  System.out.println(value);
       // return flight;
    }
    public String[] displayFlight3(JComboBox component){
        String value = component.getSelectedItem().toString();
        String[] flight = Reservation.findFlight3(value);
        System.out.println(value);
        return flight;
    }

//    public void setVisibility(JComboBox component){
//        String  value =  comboBox1.getSelectedItem().toString();
//        String  value2 =  comboBox2.getSelectedItem().toString();
//        String  value3 =  comboBox3.getSelectedItem().toString();
//
//        if(value != "-"){
//            String[] flight = displayFlight(component);
//            label.setText(flight[0]);
//            label.setVisible(true);
//
//            to_value.setText(flight[1]);
//            to_value.setVisible(true);
//
//            seats_value.setText(flight[2]);
//            seats_value.setVisible(true);
//
//            date_value.setText(flight[3]);
//            date_value.setVisible(true);
//
//        }else if (value2 != "-"){
//            String[] flight = displayFlight2(component);
//            label.setText(flight[0]);
//            label.setVisible(true);
//
//            to_value.setText(flight[1]);
//            to_value.setVisible(true);
//
//            seats_value.setText(flight[2]);
//            seats_value.setVisible(true);
//
//            date_value.setText(flight[3]);
//            date_value.setVisible(true);
//
//        }else if (value3 != "-"){
//            String[] flight = displayFlight3(component);
//            label.setText(flight[0]);
//            label.setVisible(true);
//
//            to_value.setText(flight[1]);
//            to_value.setVisible(true);
//
//            seats_value.setText(flight[2]);
//            seats_value.setVisible(true);
//
//            date_value.setText(flight[3]);
//            date_value.setVisible(true);
//        }
//
//
//    }

//    public  FlightSystem() {
//
//        findBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String  value =  comboBox1.getSelectedItem().toString();
//                String  value2 =  comboBox2.getSelectedItem().toString();
//                String  value3 =  comboBox3.getSelectedItem().toString();
//                if(value != "-"){
//                    displayFlight(comboBox1);
//                   /Flight arr = displayFlight(comboBox1);
//                    displayFlight(comboBox1);
//                   //setVisibility(comboBox1);
//                   // System.out.println(arr[0]);
//                }else if (value2 != "-"){
//                    displayFlight2(comboBox2);
//                  //  setVisibility(comboBox2);
//                    System.out.println("combo2");
//                }else if (value3 != "-"){
//                    displayFlight3(comboBox3);
//                  //  setVisibility(comboBox3);
//                    System.out.println("combo3");
//                }else{
//                    System.out.println("Nic");
//                }
//
//
//            }
//        });
//
//    System.out.println();
//
//        Flight Lot1 = new Flight(300, "300","sdsd", "Madryt", "Warszawa",
//                "25=23=11","12-03-22");
//
//        rezerwujButton.addActionListener(new ActionListener() {
//
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String  value =  comboBox1.getSelectedItem().toString();
//                String  value2 =  comboBox2.getSelectedItem().toString();
//                String  value3 =  comboBox3.getSelectedItem().toString();
//                if(value != "-"){
//
//                    Flight  tempo;
//                    tempo = displayFlight(comboBox1);
//
//
//                    String  avilibeSeats = Lot1.getTotalSeats();
//                    int num = Integer.parseInt(avilibeSeats);
//                    num--;
//                    String temp = String.valueOf(num);
//                    Lot1.setTotalSeats(temp);
//                    String log = Lot1.getTotalSeats();
//
//                    seats_value.setText(log);
//                    Reservation.makeReservation("Maciek","Garbaczewski",Reservation.setResCode(),log);
//                    System.out.println(log);
//                }
//                }
//        });
//    }


}

