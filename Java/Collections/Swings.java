/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Prashanth
 */
public class TestClass {

    public static void main(String[] args) {
        JFrame f=new JFrame("Button Colour change");
        JButton b=new JButton("Click!");
        b.setBounds(130,100,100, 40);
        
       b.addActionListener(new ActionListener(){  
@Override
public void actionPerformed(ActionEvent e){  
            f.getContentPane().setBackground(Color.YELLOW);
        }  
    });  
        
        
        f.add(b);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
    }

}
    