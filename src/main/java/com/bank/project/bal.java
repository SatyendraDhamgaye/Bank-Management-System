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
import com.bank.project.conn;


public class bal extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b,b1,b2;
    
    JTextField t1,t2,t3,t4;
    
    
    PreparedStatement pst = null;
            ResultSet rs = null;
            conn c1 = new conn();
            Connection con = conn.getCon();
    
    
        
        
    
    bal(){
       setIconImage();
        setTitle("Automated Teller Machine");
        
        
        
        l1 = new JLabel("Balance Enquiry");
        l1.setFont(new Font("Raleway", Font.BOLD, 26));
        
        l2 = new JLabel("PIN:");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l3 = new JLabel("Balance:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        
        
        
        
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        b1 = new JButton("Search");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Back");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        
        
        
       
       
        
        setLayout(null);
        
        
       
        
        
        l1.setBounds(290,30,600,40);
        add(l1);
        
        l2.setBounds(100,140,100,30);
        add(l2);
        
       
        
        l3.setBounds(100,210,100,30);
        add(l3);
        
        
       
       
        
       
        
        t1.setBounds(300,140,320,30);
        add(t1);
        
       
        
        t2.setBounds(300,210,320,30);
        add(t2);
        t2.setEditable(false);
        
        
       
        
        
        
        b.setBounds(520,240,100,30);
        add(b);
        
        b1.setBounds(520,170,100,30);
        add(b1);
        
        b2.setBounds(520,275,100,30);
        add(b2);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
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
            
        String a = t1.getText();
            String sql = "select * from ball where pin=?";
                try {
                    pst=con.prepareStatement(sql);
                    pst.setString(1, a);
                    rs=pst.executeQuery();
                    if(rs.next()){
                        String add1=rs.getString("balle");
                        t2.setText(add1);
                        rs.close();
                        pst.close();
                    }else{
                        JOptionPane.showMessageDialog(null, "Enter correct value");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        } else if(ae.getSource()==b){
        new Transcations().setVisible(true);
            setVisible(false);
            
        }else if (ae.getSource()==b2) {
            new Transcations().setVisible(true);
                    setVisible(false);
        }
      
        
        
    
               
    }
    
    
    
    public static void main(String[] args){
        new bal();
        
    }
    
    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
    }
    
}
