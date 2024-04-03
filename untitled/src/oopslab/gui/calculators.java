package oopslab.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculators implements ActionListener {
    JFrame f1;
    JLabel a;
    JLabel s;
    JTextField num1;
    JTextField num2;
    JButton add;
    JButton sub;
    JButton clear;
    JTextField result;

    calculators() {
        f1=new JFrame("Calculator");
        a=new JLabel("NUM 1");
        s=new JLabel("NUM 2");
        num1=new JTextField();
        num2=new JTextField();
        add=new JButton("ADD");
        sub=new JButton("SUB");
        clear=new JButton("CLEAR");
        result=new JTextField();

        f1.add(a);
        f1.add(s);
        f1.add(num1);
        f1.add(num2);
        f1.add(add);
        f1.add(sub);
        f1.add(clear);
        f1.add(result);
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);


        a.setBounds(10,10,100,40);
        num1.setBounds(120,10,100,50);
        s.setBounds(10,70,100,40);
        num2.setBounds(120,70,100,50);
        add.setBounds(10,130,100,40);
        sub.setBounds(120,130,100,40);
        clear.setBounds(230,130,100,40);
        result.setBounds(10,190,100,40);

        add.addActionListener(this);
        sub.addActionListener(this);
        clear.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            double a=Double.parseDouble(num1.getText());
            double b=Double.parseDouble(num2.getText());
            result.setText(Double.toString(a+b));
        }
        else if(e.getSource()==sub){
            double a=Double.parseDouble(num1.getText());
            double b=Double.parseDouble(num2.getText());
            result.setText(Double.toString(a-b));
        }
        else{
            num1.setText("");
            num2.setText("");
            result.setText("");
        }
    }

    public static void main(String[] args) {
        calculators c1=new calculators();
    }

}
