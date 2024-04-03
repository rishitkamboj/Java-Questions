package oopslab.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorCHANGE implements ActionListener {
    JFrame f;
    JButton b;
    JButton r;
    JButton y;
    colorCHANGE(){
        f=new JFrame("Colour Change");
        b=new JButton("BLUE");
        r=new JButton("RED");
        y=new JButton("YELLOW");
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.add(b);
        f.add(r);
        f.add(y);
        b.setBounds(20,20,100,40);
        r.setBounds(130,20,100,40);
        y.setBounds(240,20,100,40);
        b.addActionListener(this);
        r.addActionListener(this);
        y.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            f.getContentPane().setBackground(Color.BLUE);
        }
        else if(e.getSource()==r){
            f.getContentPane().setBackground(Color.RED);
        }
        else{
            f.getContentPane()  .setBackground(Color.yellow);
        }
    }

    public static void main(String[] args) {
        colorCHANGE a=new colorCHANGE();
    }
}
