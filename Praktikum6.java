/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum6;

/**
 *
 * @author User
 */
import javax.swing.*;
public class Praktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("title");
               JPanel p = new JPanel();
               JButton b = new JButton("proses me");
               
               p.add(b);                    //add button to panel
               f.setContentPane(p);         // add panel to frame
               
              f.show();
        
    }
    
}
