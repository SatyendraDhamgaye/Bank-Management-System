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
import java.time.Clock;


public class Login extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1, b2, b3;
    JComboBox c1;

    Login() {
        
        setTitle("Automated Teller Machine");
        
        setIconImage();
        


        l1 = new JLabel("Customer's Login");
        l1.setFont(new Font("Osward", Font.BOLD, 35));

        l2 = new JLabel("Account No:");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));

        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);

        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        setLayout(null);

        l1.setBounds(195, 10, 450, 200);
        add(l1);

        l2.setBounds(125, 150, 375, 200);
        add(l2);

        l3.setBounds(125, 225, 375, 200);
        add(l3);

        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        tf1.setBounds(300, 235, 230, 30);
        add(tf1);

        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300, 310, 230, 30);
        add(pf2);

        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300, 400, 100, 30);
        add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430, 400, 100, 30);
        add(b2);

        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300, 450, 230, 30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(700, 750);
        setLocation(350, 20);
        setVisible(true);
        

        addWindowListener(new WindowAdapter() {
        
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
            
        });
        
    }

    public void actionPerformed(ActionEvent ae) {

        try {
            String a = tf1.getText();
            String b = pf2.getText();
            String q = "select * from login where cardno = '" + a + "' and pin = '" + b + "'";
            ResultSet rs = Select.getData(q);

            if (ae.getSource() == b1) {
                if (rs.next()) {
                    new Transcations().setVisible(true);
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Password");

                }
            } else if (ae.getSource() == b2) {
                tf1.setText("");
                pf2.setText("");
            } else if (ae.getSource() == b3) {
                new Signup().setVisible(true);
                setVisible(false);

            }else{
                System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }

    }
    
    
   

    public static void main(String[] args) {
        
        
        new Login().setVisible(true);
    }

    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
    }
    
}
