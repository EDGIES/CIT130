/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twofactorsauthentication;

import java.util.Scanner;
import java.util.HashMap;


/**
 *
 * @author egyedg
 */
public class TwoFactorsAuthentication {
    public static boolean mainLoop = true;

    static HashMap<String,String> usersMap = new HashMap<>();
    
    public static void main(String[] args) {
        while (mainLoop){
            
        
        System.out.println("Please Select the following Options Underneath");
        Scanner userInputScanner = new Scanner(System.in);
            System.out.println("1. Login");
            System.out.println("2. Create a new user");
            
            int userOptions = userInputScanner.nextInt();

            switch (userOptions) {
                case 1:
                    LoggingIn();

                    break;
                case 2:

                    CreatingAUser();

                    break;
                
                default:
                    System.out.println("Error please select the given options");
                    break;
           
        }//end mainLoop
    }//close of Main 
    
    //public static void Login(){
        //Login Method that requires a Username and Password
        // And Requires 2 Factor Code
        
    
}//close of Login 
    public static void CreatingAUser(){
        // Method to create a New user.
        //user will create a username and a password
        
        UsernameAndPassword user = new UsernameAndPassword();
        
        System.out.println("Please Enter a username:");
        Scanner userInputScanner = new Scanner (System.in);
        user.username = userInputScanner.nextLine();
        System.out.println("Please Enter a Password:");
        user.password =userInputScanner.nextLine();
        usersMap.put(user.username,user.password);
             
    }//close CreatingAUser
    public static void LoggingIn(){
       String username;
       String password;
       boolean login =false;
        //This method simulates Logging-In 
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Please Type In Username:");
        username = userInputScanner.nextLine();
        System.out.println("Please type In Password:");
        password = userInputScanner.nextLine();
        
        if(usersMap.containsKey(username) && usersMap.get(username).equals(password)){
            login = true;
            System.out.println("Unlocked");
            
        }else{
            System.out.println("Wrong Username or Password Please try again");
        login = false;
        }//close else
            
      
    }//close LoggingIn
    
    
}//close of class
