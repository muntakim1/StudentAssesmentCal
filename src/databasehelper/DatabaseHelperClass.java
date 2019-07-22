/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasehelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DatabaseHelperClass {
    Connection conn=null;
    public static Connection ConnectionDB(){
     try{
     Class.forName("org.sqlite.JDBC");
     Connection conn;
         conn = DriverManager.getConnection("jdbc:sqlite:student.db");
     System.out.print("Connected!!!");
     return conn;
     
     }
     catch(ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null,e);
          return null;
     }
    }
}
