package paperprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiprep  implements ActionListener {
    JFrame frame;

    JButton red;
    JButton blue;
    JButton orange;

    guiprep(){
        frame=new JFrame("Colour Change");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
        red=new JButton("Red");
        blue=new JButton("Blue");
        orange=new JButton("Orange");
        red.setBounds(100,20,100,20);
        blue.setBounds(100,50,100,20);
        orange.setBounds(100,100,100,20);
        frame.add(red);
        frame.add(blue);
        frame.add(orange);
        red.addActionListener(this);
        blue.addActionListener(this);
        orange.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==red){
           frame.getContentPane().setBackground(Color.RED);
       }
       else if(e.getSource()==blue){
           frame.getContentPane().setBackground(Color.BLUE);
       }
       else{
           frame.getContentPane().setBackground(Color.ORANGE);
       }
    }

    public static void main(String[] args) {
        guiprep gp=new guiprep();
    }

}
