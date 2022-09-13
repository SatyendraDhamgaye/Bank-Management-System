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


public class Pin extends JFrame implements ActionListener{
    
    JPasswordField t1,t2,t3;
    JButton b1,b2;                               
    JLabel l1,l2,l3,l4;
    
    Pin(){
        
        setIconImage();
        setTitle("Automated Teller Machine");
        
        
        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 35));
        
        l2 = new JLabel("Current PIN:");
        l2.setFont(new Font("System", Font.BOLD, 22));
        
        l3 = new JLabel("New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 22));
        
        l4 = new JLabel("Re-Enter New PIN:");
        l4.setFont(new Font("System", Font.BOLD, 22));
        
        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 22));
        
        t3 = new JPasswordField();
        t3.setFont(new Font("Raleway", Font.BOLD, 22));
        
        b1 = new JButton("SAVE");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        setLayout(null);
        
        l1.setBounds(210,130,800,60);
        add(l1);
        
        l2.setBounds(70,240,150,40);
        add(l2);
        
        l3.setBounds(70,300,150,40);
        add(l3);
        
        l4.setBounds(70,360,200,40);
        add(l4);
        
        t1.setBounds(300,240,360,40);
        add(t1);
        
        t2.setBounds(300,300,360,40);
        add(t2);
        
        t3.setBounds(300,360,360,40);
        add(t3);
        
        b1.setBounds(190,460,160,50);
        add(b1);
        
        b2.setBounds(370,460,160,50);
        add(b2);
        
        
        
        
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
       
        try{        
           
            String a = t1.getText();
            String b = t2.getText();
            String c = t3.getText();
            
            
            
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Please Enter Current PIN");
                
                }
                if(t2.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (t3.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                if(t2.getText().equals(t3.getText())){
                    
                    String q1 = "update ball set pin = '"+b+"' where pin = '"+a+"' ";
                    String q2 = "update login set pin = '"+b+"' where pin = '"+a+"' ";
                    
                    InsertUpdateDelete.setData(q1);
                    InsertUpdateDelete.setData(q2);
                    
                    JOptionPane.showMessageDialog(null, "Pin Changed Successfully");
                    
                    new Transcations().setVisible(true);
                    setVisible(false);
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "PIN entered doesn't match");
                }
                    
                    
                    
                    
                
            }else if(ae.getSource()==b2){
                
                new Transcations().setVisible(true);
                setVisible(false);
                
            }
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("error: "+e);
        }
            
    }

    
        
    
    public static void main(String[] args){
        new Pin().setVisible(true);
    }
    
    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
    }
    
}
