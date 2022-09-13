/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.project;

/**
 *
 * @author satye
 */

import java.sql.*;
import javax.swing.JOptionPane;


public class InsertUpdateDelete {
    
     public static void setData(String Query){
        Connection con = null;
        Statement st = null;
        try {
            con = conn.getCon();
            st = con.createStatement();
            st.executeUpdate(Query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try {
            
        } catch (Exception e) {
        }
        }
    }
    
}
