/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.project;

/**
 *
 * @author satye
 */

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class Finalize extends JFrame implements ActionListener{
    
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JRadioButton r1,r2,r3,r4;
    JButton b1;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JTextField t1;
    String name1,g_name1,dd1,mm1,yy1,gender1,email1,m_status1,address1,city1,pin_code1,state1,religion1,category1,income1,education1,occupation1,pan1,addhar1,senior1,existing_account1;
    
    
    
    
    
    Finalize(){
        
        setIconImage();
        setTitle("Automated Teller Machine");
    
        
        l1 = new JLabel("One Step to Finalize Your Account:");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
    
        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Aadhar Card UID:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        
        
        
        
        
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
       
        
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
         
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
       
        
        
        
        
        setLayout(null);
        
        
        
        
        
        l1.setBounds(180,10,400,40);
        add(l1); 
        
        //
        
        l2.setBounds(100,70,200,30);
        add(l2);
        
        r1.setBounds(100,110,150,30);
        add(r1);
        
        r2.setBounds(350,110,300,30);
        add(r2);
        
        r3.setBounds(100,150,250,30);
        add(r3);
        
        r4.setBounds(350,150,250,30);
        add(r4);
        
        //
        
        l3.setBounds(100,200,200,30);
        add(l3);
        
        l4.setBounds(330,200,250,30);
        add(l4);
        
        l5.setBounds(100,230,200,20);
        add(l5);
        
        l6.setBounds(330,230,500,20);
        add(l6);
        
        l7.setBounds(100,270,200,30);
        add(l7);
        
        l8.setBounds(330,270,200,30);
        add(l8);
        
        l9.setBounds(100,300,200,20);
        add(l9);
        
        //
        
        l10.setBounds(100,340,200,30);
        add(l10);
        
        c1.setBounds(100,390,200,30);
        add(c1);
        
        c2.setBounds(350,390,200,30);
        add(c2);
        
        c3.setBounds(100,440,200,30);
        add(c3);
        
        c4.setBounds(350,440,200,30);
        add(c4);
        
        c5.setBounds(100,490,200,30);
        add(c5);
        
        c6.setBounds(350,490,200,30);
        add(c6);
        
        //
        
        l11.setBounds(100,540,200,30);
        add(l11);
        
        t1.setBounds(100,580,500,30);
        add(t1);
        
        //
        
        c7.setBounds(80,635,600,20);
        add(c7);
        
        b1.setBounds(240,665,200,30);
        add(b1);
        
        
        
        

        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(700,750);
        setLocation(350,20);
        setVisible(true);
        
        b1.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
        
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
            
        });
        
    }
    
    public Finalize(String name,String g_name,String dd,String mm,String yy,String gender,String email,String m_status,String address,String city,String pin_code,String state,String religion,String category,String income,String education,String occupation,String pan,String addhar,String senior,String existing_account){
            
        
            
            name1 = name;
            g_name1 = g_name;
            dd1 = dd;
            mm1 = mm;
            yy1 = yy;
            gender1 = gender;
            email1 = email;
            m_status1 = m_status;
            address1 = address;
            city1 = city;
            pin_code1 = pin_code;
            state1 = state;
            religion1 = religion;
            category1 = category;
            income1 = income;
            education1 = education;
            occupation1 = occupation;
            pan1 = pan;
            addhar1 = addhar;
            senior1 = senior;
            existing_account1 = existing_account;
            
            Document doc = new Document();
                        try {
                            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\satye\\Documents\\NetBeansProjects\\Bank\\Recipts\\Print.pdf"));
                            doc.open();
                            Paragraph para1 = new Paragraph("                                                            Automated Teller Machine\n");
                            doc.add(para1);
                            
                            Paragraph para2 = new Paragraph("****************************************************************************************************************\n");
                            doc.add(para2);
                            
                            Paragraph para3 = new Paragraph("                                                                  Personal Details\n");
                            doc.add(para3);
                            doc.add(para2);
                            
                            Paragraph para4 = new Paragraph("\tName: "+name1+"\nGuardian Name:"+g_name1+"\nDate of Birth:"+dd1+"/"+mm1+"/"+yy1+"\nGender:"+gender1+"\nEmail:"+email1+"\nMarital Status:"+m_status1+"\nAddress:"+address1+"\nCity:"+city1+"\nPin Code:"+pin_code1+"\nState:"+state1+"\nReligion:"+religion1+"\nCategory:"+category1+"\nIncome:"+income1+"\n Education:"+education1+"\nOccupation:"+occupation1+"\nPanCard Number:"+pan1+"\nAddharCard Number:"+addhar1+"\nSenior Citizen:"+senior1+"\nExisting Account:"+existing_account1+"\n");
                            doc.add(para4);
                            
                            doc.add(para2);
                            
                            
                            
                            
                            doc.close();
                            writer.close();
                            
                            
                        } catch (DocumentException e) {
                            e.printStackTrace();
                        } catch (FileNotFoundException e){
                            e.printStackTrace();
                        }
    }
    
    public void actionPerformed(ActionEvent ae){
       
        
        String a = null;
        if(r1.isSelected()){ 
            a = "Savings Account";
        }
        else if(r2.isSelected()){ 
            a = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            a = "Current Account";
        }else if(r4.isSelected()){ 
            a = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90L) + 7654321000L;
        String first8 = Long.toString(Math.abs(first7));
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String first4 = Long.toString(Math.abs(first3));
        
        String b = "";
        if(c1.isSelected()){ 
            b = b+" ATM Card";
        }
        if(c2.isSelected()){ 
            b = b+" Internet Banking";
        }
        if(c3.isSelected()){ 
            b = b+" Mobile Banking";
        }
        if(c4.isSelected()){ 
            b = b+" EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            b = b+" Cheque Book";
        }
        if(c6.isSelected()){ 
            b = b+" E-Statement";
        }
        
        String c = t1.getText();
        
        
        
        
        try{
            
            if(ae.getSource()==b1){
                
                if(b.equals("")){
                
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                
                }else{
                
                    
                    String q1 = "insert into finalize values('"+a+"','"+b+"','"+c+"')";  
                    InsertUpdateDelete.setData(q1);
                    String q2 = "insert into login values('"+first8+"','"+first4+"')";
                    InsertUpdateDelete.setData(q2);
                    String d = JOptionPane.showInputDialog("Enter First amount minmum 1000rs");
                    String q3 = "insert into ball values('"+first4+"','"+d+"')";
                    InsertUpdateDelete.setData(q3);
                    JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin:"+ first4);
                    
                   
                    
                        
                        
                        
                        
                        
                    
                        Document doc = new Document();
                        try {
                            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\satye\\Documents\\NetBeansProjects\\bank\\Recipts\\Pin.pdf"));
                            doc.open();
                            Paragraph para1 = new Paragraph("                                                            Automated Teller Machine\n");
                            doc.add(para1);
                            
                            Paragraph para2 = new Paragraph("****************************************************************************************************************\n");
                            doc.add(para2);
                            
                            
                            
                            Paragraph para4 = new Paragraph("\tAccount Type: "+a+"\n");
                            doc.add(para4);
                            Paragraph para5 = new Paragraph("\tChosen Sevices: "+b+"\n");
                            doc.add(para5);
                            
                            doc.add(para2);
                            
                            Paragraph para6 = new Paragraph("\tAccount Number OR Card Number: "+first8+"\n");
                            doc.add(para6);
                            Paragraph para7 = new Paragraph("\tPin: "+first4+"\n");
                            doc.add(para7);
                            doc.add(para2);
                            
                            
                            doc.close();
                            writer.close();
                            
                            
                        } catch (DocumentException e) {
                            e.printStackTrace();
                        } catch (FileNotFoundException e){
                            e.printStackTrace();
                        }
                        
                    
                    
                    
                    
                    new Transcations().setVisible(true);
                    setVisible(false);
                    
                    try {
                        Desktop.getDesktop().open(new File("C:\\Users\\satye\\Documents\\NetBeansProjects\\bank\\Recipts\\Print.pdf"));
                        Desktop.getDesktop().open(new File("C:\\Users\\satye\\Documents\\NetBeansProjects\\bank\\Recipts\\Pin.pdf"));
                    } catch (Exception e) {
                    }
                }
            
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Finalize().setVisible(true);
         
    }
    
    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
    }
    
}
