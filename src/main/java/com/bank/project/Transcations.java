/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.project;

/**
 *
 * @author satye
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Transcations extends JFrame implements ActionListener{
    
     JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    
    Transcations(){
        
        setIconImage();
        setTitle("Automated Teller Machine");
    
        l1 = new JLabel("Please Select Your Transaction");
        l1.setFont(new Font("System", Font.BOLD, 38));
    
       
        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("CASH WITHDRAWL");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b4 = new JButton("CHANGE ACC");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5 = new JButton("PIN CHANGE");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        
        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        l1.setBounds(70,100,700,40);
        add(l1);
        
        b1.setBounds(40,250,300,60);
        add(b1);
        
        b2.setBounds(360,250,300,60);
        add(b2);
        
        
        b4.setBounds(360,360,300,60);
        add(b4);
        
        b5.setBounds(40,360,300,60);
        add(b5);
        
        b6.setBounds(40,470,620,60);
        add(b6);
        
        b7.setBounds(200,600,300,60);
        add(b7);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(700,750);
        setLocation(350,20);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
        
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
            
        });
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){ 
            
            new Deposit().setVisible(true);
            setVisible(false);
            
        }
        else if(ae.getSource()==b2){ 
            
            new Withdrawl().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b4){ 
            
            new Login().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b5){ 
            
            new Pin().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b6){ 
            
            
            new bal().setVisible(true);
            setVisible(false);
  
                    
            
        }else if(ae.getSource()==b7){ 
            
           System.exit(0);
            setVisible(false); 
            
        }
        
            
        
        
    }
    
    public static void main(String[] args){
        new Transcations().setVisible(true);
    }
    
    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
    }
    
}
