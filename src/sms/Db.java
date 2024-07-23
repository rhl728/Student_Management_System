/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.sql.*;

/**
 *
 * @author DA 2018tx
 */
public class Db {
    
    public static Connection mycon(){
        
        String url = "jdbc:mysql://localhost:3308/student";
        String user = "root";
        String password = "";
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,password);
            
            return con;
            
        } catch (Exception e) {
        }
        
        return null;
        
    }
    
}
