/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosanbookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */

//This class connects the program to mysql database. The query(s) will be passed from the QueryGenerator class.
public class DatabaseConnector {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultset;
    
    public void connect(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");
            statement = connection.createStatement();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't connect to database! " + e);
        }
    }
    
    public ResultSet executeQuery(String sql){
        try{
            resultset = statement.executeQuery(sql);
            
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Wrong SQL entry! Check your SQL code.");
        }
        return resultset;
    }
    
    public void closeConnection(){
        try{
            connection.close();
        }catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, "Either the connection has been terminated or an unknown error occured!");
        }
    }
    
}
