/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.event.*;

public  abstract class JavaApplication11 implements ActionListener {
    /**
     */
    public static void createAndShowGUI() {
        // TODO code application logic here
        //Make Frame
        JFrame frame = new JFrame ("I am a Frame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout (null);
        //make a button
        JButton butt=new JButton("click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20,200,20);
        
        //instamtiate an application object
        JavaApplication11 app = new JavaApplication11() {};
        //make the label
        app.label = new JLabel("Nama Saya Merupakan");
        app.label.setBounds(20, 40, 200,20);
        frame.getContentPane().add(app.label);
        
        //set the application object to be the thing  which
        // listens to the button
        butt.addActionListener(app);
        frame.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e)
    {
        //ini akan dieksekusi ketika button diklik
        //clickCount++;
        label.setText("Nama Saya Getrudis Luruk Forek");
    }
    public static void main(String[] args) {
        //Memulai Swing GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            
            }
        });
        
    }
    
//application object fields
// int clickCount=0;
    JLabel label;
                
}


