/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nilusha De Silva
 */
public class ConnectionManager {
    public static String url = "jdbc:mysql://localhost:3306/institution";    
    public static String driverName = "com.mysql.jdbc.Driver";   
    public static String username = "root";   
    public static String password = "123";
    public static Connection con;
   

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Driver not found."); 
        }
        return con;
    }
}