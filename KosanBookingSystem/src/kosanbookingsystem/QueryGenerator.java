/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosanbookingsystem;

import java.sql.ResultSet;

/**
 *
 * @author Asus
 */

//This class generates sql strings. The method gets the input number from the model and later
//passes the string into database connector class.
public class QueryGenerator extends DatabaseConnector{
    
    public ResultSet login(String username, String password){
        ResultSet result = null;
        String customerSQL = "";
        executeQuery(customerSQL);
        if(executeQuery(customerSQL) != null){
            result = executeQuery(customerSQL);
        }
        else if(executeQuery(customerSQL) == null){
            String ownerSQL = "";
            result = executeQuery(ownerSQL);
        }
        else{
            result = null;
        }
        
        return result;
    }
    
}
