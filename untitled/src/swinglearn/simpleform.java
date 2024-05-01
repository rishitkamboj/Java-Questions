package swinglearn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleform implements ActionListener {
    JFrame f;
    JLabel l;
    JTextField t;
    JLabel l1;
    JTextField t1;
    JButton b;
    JTextField t2 ;

    simpleform(){
        f=new JFrame("Add two numbers");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        l=new JLabel("Enter First Number");
        l1=new JLabel("Enter Second Number");
        t=new JTextField();
        t1=new JTextField();
        b=new JButton("Add");
        t2=new JTextField();
        f.add(l);
        f.add(l1);
        f.add(t);
        f.add(t1);
        f.add(b);
        f.add(t2);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(t.getText());
        int b=Integer.parseInt(t1.getText());
        t2.setText(Integer.toString(a+b));
    }
}
