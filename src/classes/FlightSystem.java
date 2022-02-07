package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import classes.Reservation;

public class FlightSystem extends  JFrame {

    public  JPanel panel1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton findBtn;
    private JTabbedPane tabbedPane1;
    private JLabel label;

    public  FlightSystem() {
        findBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = comboBox1.getSelectedItem().toString();
                String flight = Reservation.findFlight(value);
                label.setText(flight);
                System.out.println(value);
            }
        });
    }


}

