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
import java.sql.Connection;


public class Deposit extends JFrame implements ActionListener{
    
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    PreparedStatement pst = null;
            ResultSet rs = null;
            conn c1 = new conn();
            Connection con = conn.getCon();
            
    
    Deposit(){
        
        setIconImage();
        setTitle("Automated Teller Machine");
        
        
        l1 = new JLabel("Amount :");
        l1.setFont(new Font("System", Font.BOLD, 20));
        
        l2 = new JLabel("Press Confirm to Deposit the Amount");
        l2.setFont(new Font("System", Font.BOLD, 20));
        
        l3 = new JLabel("Enter Pin :");
        l3.setFont(new Font("System", Font.BOLD, 20));
        
        l4 = new JLabel("Enter Amount :");
        l4.setFont(new Font("System", Font.BOLD, 20));
        
        l5 = new JLabel("Total Amount :");
        l5.setFont(new Font("System", Font.BOLD, 20));
        
        l6 = new JLabel("Balanced");
        l6.setFont(new Font("System", Font.BOLD, 20));
        
        l7 = new JLabel("DEPOSIT");
        l7.setFont(new Font("Raleway", Font.BOLD, 26));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("Total");
        b1.setFont(new Font("System", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("Search");
        b2.setFont(new Font("System", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("Confirm");
        b3.setFont(new Font("System", Font.BOLD, 14));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("Back");
        b4.setFont(new Font("System", Font.BOLD, 14));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        l3.setBounds(100,140,100,30);
        add(l3);
        
        t2.setBounds(300,140,320,30);
        add(t2);
        
        l1.setBounds(100,210,100,30);
        add(l1);
        
        l2.setBounds(100,400,800,60);
        add(l2);
        
        t1.setBounds(300,210,320,30);
        add(t1);
        t1.setEditable(false);
        
        b1.setBounds(520,290,100,30);
        add(b1);
        
        l4.setBounds(100,260,210,30);
        add(l4);
        
        t4.setBounds(300,340,320,30);
        add(t4);
        t4.setEditable(false);
        
        t3.setBounds(300,260,320,30);
        add(t3);
        
        b2.setBounds(520,170,100,30);
        add(b2);
        
        b3.setBounds(520,415,100,30);
        add(b3);
        
        b4.setBounds(520,450,100,30);
        add(b4);
        
        l5.setBounds(100,340,150,30);
        add(l5);
        
        l6.setBounds(100,190,150,30);
        add(l6);
        
        l7.setBounds(290,30,600,40);
        add(l7);

        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
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
            
                try {
                    String add1 = t1.getText();
                    String add2 = t3.getText();
                    int sum = Integer.parseInt(add1)+Integer.parseInt(add2);
                    String sum1=String.valueOf(sum);
                    t4.setText(sum1);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            
        }else if(ae.getSource()==b2){
            String a = t2.getText();
            String sql = "select * from ball where pin=?";
                try {
                    pst=con.prepareStatement(sql);
                    pst.setString(1, a);
                    rs=pst.executeQuery();
                    if(rs.next()){
                        String add1=rs.getString("balle");
                        t1.setText(add1);
                        rs.close();
                        pst.close();
                    }else{
                        JOptionPane.showMessageDialog(null, "Enter correct value");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            
            
            
           
        }else if(ae.getSource()==b3){
            try{
                        String val1=t2.getText();
                        String val2=t4.getText();
                        String q1 = "update ball set balle='"+val2+"' where pin='"+val1+"'";
                        pst=con.prepareStatement(q1);
                        pst.execute();
                        new Transcations().setVisible(true);
            setVisible(false);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
            
            
        else if (ae.getSource()==b4) {
            new Transcations().setVisible(true);
                    setVisible(false);
        }
            
       
            
    }
    
    public static void main(String[] args){
        new Deposit().setVisible(true);
    }
    
    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
    }
    
}
