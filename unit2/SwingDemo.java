/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit2;

import javax.swing.*;
import java.awt.*;


class SwingControls extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;
    JButton b1;
    public void setControls(){
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3=new JLabel("Confirm Password");
        l4=new JLabel("Gender");
        l5=new JLabel("course");
        t1=new JTextField(20);
        p1=new JPasswordField(20);
        p2=new JPasswordField(20);
        r1=new JRadioButton("male");
        r2=new JRadioButton("Female");
        c1= new JCheckBox("java");
        c2= new JCheckBox("c++");
        c3= new JCheckBox("c#");
       b1=new JButton("Submit");
       //adding button group for radio
       ButtonGroup bg=new ButtonGroup();
       bg.add(r1);
       bg.add(r2);
       //adding components to window
       add(l1);
       add(t1);

       add(l2);
       add(p1);

       add(l3);
       add(p2);

       add(l4);
       add(r1);

       add(r2);

       
       add(l5);
       add(c1);
       add(c2);
       add(c3);
       add(b1);
       //adding featuresof window
       setVisible(true);
       setSize(500,500);
       setLayout(new FlowLayout());
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
     
      

    }
}
    

/**
 *
 * @author ASUS
 */
public class SwingDemo {
    public static void main(String[] args) {
        SwingControls s=new SwingControls();
        s.setControls();
    }
    
}
