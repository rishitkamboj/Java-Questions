/*
q1 wap in java to design following login page using frame
                          Username []
                          Password []
                            submit
 */






package oopslab.gui;
import javax.swing.*;
import java.awt.*;

public class login {
    JFrame f;
    JLabel p1;
    JLabel p2;
    JTextField a1;
    JTextField a2;
    JButton sub;

    login(){
        f = new JFrame("Login App");
        sub = new JButton("SUBMIT");
        p1 = new JLabel("Username");
        p2 = new JLabel("Password");
        a1 = new JTextField();
        a2 = new JTextField();

        f.setLayout(null);

        p1.setBounds(100,50,60,20);
        a1.setBounds(200,50,120,20);
        p2.setBounds(100,100,60,20);
        a2.setBounds(200,100,120,20);
        sub.setBounds(150,150,100,30);

        f.add(sub);
        f.add(p1);
        f.add(p2);
        f.add(a1);
        f.add(a2);

        f.setSize(400,250);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        login login = new login();
    }
}
