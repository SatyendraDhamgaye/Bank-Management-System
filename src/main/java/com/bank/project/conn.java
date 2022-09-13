/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.project;

/**
 *
 * @author satye
 */

import java.sql.Connection;
import java.sql.DriverManager;


public class conn {
    public static Connection getCon(){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
           return con;
       } catch (Exception e) {
           return null;
       }
   }
}
