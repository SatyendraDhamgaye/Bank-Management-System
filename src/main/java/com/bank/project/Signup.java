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
import java.util.*;


public class Signup extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
    JButton b;
    JComboBox c1,c2,c3,c4,c5,c6,c7,c8;
    
    

    
    
    
    Signup(){
        

        
        setIconImage();


        setTitle("Automated Teller Machine");
        
        
        
            
        
        
        l1 = new JLabel("APPLICATION FORM");
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        
        
        l2 = new JLabel("Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l4 = new JLabel("Guardian's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l16 = new JLabel("Religion:");
        l16.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l17 = new JLabel("Category:");
        l17.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l18 = new JLabel("Income:");
        l18.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l19 = new JLabel("Educational");
        l19.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l20 = new JLabel("Qualification:");
        l20.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l21 = new JLabel("Occupation:");
        l21.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l22 = new JLabel("PAN Number:");
        l22.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l23 = new JLabel("Aadhar Number:");
        l23.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l24 = new JLabel("Senior Citizen:");
        l24.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l25 = new JLabel("Existing Account:");
        l25.setFont(new Font("Raleway", Font.BOLD, 18));
        
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t8 = new JTextField();
        t8.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t9 = new JTextField();
        t9.setFont(new Font("Raleway", Font.BOLD, 14));
        
       
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        
        r5 = new JRadioButton("Yes");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        
        r6 = new JRadioButton("No");
        r6.setFont(new Font("Raleway", Font.BOLD, 14));
        r6.setBackground(Color.WHITE);
        
        r7 = new JRadioButton("Yes");
        r7.setFont(new Font("Raleway", Font.BOLD, 14));
        r7.setBackground(Color.WHITE);
        
        r8 = new JRadioButton("No");
        r8.setFont(new Font("Raleway", Font.BOLD, 14));
        r8.setBackground(Color.WHITE);

        
     
        String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1 = new JComboBox(date);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        c2 = new JComboBox(month);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012"};
        c3 = new JComboBox(year);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Buddhist","Other"};
        c4 = new JComboBox(religion);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        c5 = new JComboBox(category);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c6 = new JComboBox(income);
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c7 = new JComboBox(education);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c8 = new JComboBox(occupation);
        c8.setBackground(Color.WHITE);
        c8.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        
        setLayout(null);
        l1.setBounds(530,20,600,40);
        add(l1);
        
        l2.setBounds(630,70,600,30);
        add(l2);
        
        l3.setBounds(70,140,100,30);
        add(l3);
        
        t1.setBounds(260,140,400,30);
        add(t1);
        
        l4.setBounds(70,190,200,30);
        add(l4);
        
        t2.setBounds(260,190,400,30);
        add(t2);
        
        l5.setBounds(70,240,200,30);
        add(l5);
        
        l13.setBounds(260,240,40,30);
        add(l13);
        
        c1.setBounds(300,240,60,30);
        add(c1);
        
        l14.setBounds(370,240,50,30);
        add(l14);
        
        c2.setBounds(420,240,100,30);
        add(c2);
        
        l15.setBounds(530,240,40,30);
        add(l15);
        
        c3.setBounds(570,240,90,30);
        add(c3);
        
        l6.setBounds(70,290,200,30);
        add(l6);
        
        r1.setBounds(260,290,60,30);
        add(r1);
        
        r2.setBounds(410,290,90,30);
        add(r2);
        
        l7.setBounds(70,340,200,30);
        add(l7);
        
        t3.setBounds(260,340,400,30);
        add(t3);
        
        l8.setBounds(70,390,200,30);
        add(l8);
        
        r3.setBounds(260,390,100,30);
        add(r3);
        
        r4.setBounds(410,390,100,30);
        add(r4);

        
        
        
        l9.setBounds(70,440,200,30);
        add(l9);
        
        t4.setBounds(260,440,400,30);
        add(t4);
        
        l10.setBounds(70,490,200,30);
        add(l10);
        
        t5.setBounds(260,490,400,30);
        add(t5);
        
        l11.setBounds(70,540,200,30);
        add(l11);
        
        t6.setBounds(260,540,400,30);
        add(t6);
        
        l12.setBounds(70,590,200,30);
        add(l12);
        
        t7.setBounds(260,590,400,30);
        add(t7);
        
        l16.setBounds(750,140,100,30);
        add(l16);    
        
        c4.setBounds(940,140,320,30);
        add(c4);  
        
        l17.setBounds(750,190,100,30);
        add(l17); 
        
        c5.setBounds(940,190,320,30);
        add(c5); 
        
        l18.setBounds(750,240,100,30);
        add(l18); 
        
        c6.setBounds(940,240,320,30);
        add(c6);
        
        l19.setBounds(750,290,150,30);
        add(l19);
        
        l20.setBounds(750,310,150,30);
        add(l20);
        
        c7.setBounds(940,310,320,30);
        add(c7);
        
        l21.setBounds(750,360,150,30);
        add(l21);
        
        c8.setBounds(940,360,320,30);
        add(c8);
        
        l22.setBounds(750,410,150,30);
        add(l22);
        
        t8.setBounds(940,410,320,30);
        add(t8);
        
        l23.setBounds(750,460,150,30);
        add(l23);
        
        t9.setBounds(940,460,320,30);
        add(t9);
        
        l24.setBounds(750,510,150,30);
        add(l24);
        
        r5.setBounds(940,510,100,30);
        add(r5);
        
        r6.setBounds(1050,510,100,30);
        add(r6);
        
        l25.setBounds(750,560,180,30);
        add(l25);
        
        r7.setBounds(940,560,100,30);
        add(r7);
        
        r8.setBounds(1050,560,100,30);
        add(r8);
        
        b.setBounds(1250,640,80,30);
        add(b);
        
        b.addActionListener(this); 
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(1400,750);
        setLocation(350,20);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
        
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
            
        });
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        String a = t1.getText();
        String b = t2.getText();
        
        String ac = (String)c1.getSelectedItem(); 
        String bc = (String)c2.getSelectedItem();
        String cc = (String)c3.getSelectedItem();
        
        String d = null;
        if(r1.isSelected()){ 
            d = "Male";
        }
        else if(r2.isSelected()){ 
            d = "Female";
        }
            
        String e = t3.getText();
        String f = null;
        if(r3.isSelected()){ 
            f = "Married";
        }else if(r4.isSelected()){ 
            f = "Unmarried";
        }
           
        String g = t4.getText();
        String h = t5.getText();
        String i = t6.getText();
        String j = t7.getText();
        
        
        
        
        String k = (String)c4.getSelectedItem(); 
        String l = (String)c5.getSelectedItem();
        String m = (String)c6.getSelectedItem();
        String n = (String)c7.getSelectedItem();
        String o = (String)c8.getSelectedItem();
        
        String p = t8.getText();
        String q = t9.getText();
        
        String r = "";
        if(r1.isSelected()){ 
            r = "Yes";
        }
        else if(r2.isSelected()){ 
            r = "No";
        }
           
        String s = "";
        if(r3.isSelected()){ 
            s = "Yes";
        }else if(r4.isSelected()){ 
            s = "No";
        }
        
            
            String name1 = a;
            String g_name1 = b;
            String dd1 = ac;
            String mm1 = bc;
            String yy1 = cc;
            String gender1 = d;
            String email1 = e;
            String m_status1 = f;
            String address1 = g;
            String city1 = h;
            String pin_code1 = i;
            String state1 = j;
            String religion1 = k;
            String category1 = l;
            String income1 = m;
            String education1 = n;
            String occupation1 = o;
            String pan1 = p;
            String addhar1 = q;
            String senior1 = r;
            String existing_account1 = s;
            new Finalize(name1, g_name1, dd1, mm1, yy1, gender1, email1, m_status1, address1, city1, pin_code1, state1, religion1, category1, income1, education1, occupation1, pan1, addhar1, senior1, existing_account1);
        

        try{
           
            if(t6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                
                
            
                
                
                
                String q1 = "insert into signup(name,g_name,dd,mm,yy,gender,email,m_status,address,city,pin_code,state,religion,category,income,education,occupation,pan,addhar,senior,existing_account) values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"','"+n+"','"+o+"','"+p+"','"+q+"','"+r+"','"+s+"')";
                InsertUpdateDelete.setData(q1);
                
               
                
                
                new Finalize().setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
        
    }
    
    
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
    
    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
    }
    
}
