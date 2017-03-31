/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosanbookingsystem;

/**
 *
 * @author Asus
 */
public class Customer {
    private int id;
    private String name;
    private String username;
    private String password;
    private String contactNumber;
    private String email;
    
    public void signUp(String name, String username, String password, String contactNumber, String email){
        this.name = name;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
        this.email = email;
        
        //pass to query generator
    }
    
    public int login(String username, String password){
        this.username = username;
        this.password = password;
        
        //pass to query generator to get found status
        
        //change later
        return 0;
    }
    
    public void book(/*get the house data*/){
        //pass to query generator
    }
    
    public void cancelBooking(/*get house data*/){
        //pass to query generator
    }
    
    public void payBooking(/*get house data*/){
        //pass to query generator
    }
}
