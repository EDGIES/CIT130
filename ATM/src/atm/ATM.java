/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;
import atm.Account;
import java.util.HashMap;


/**
 *
 * @author grant.egyed
 */
public class ATM{
    // loop for switch
    public static boolean mainLoop = true;
    
   static HashMap<String,Long> usersMap = new HashMap<>(); 
   
    
    public static void main (String [] args){
        while (mainLoop){
            System.out.println("Welcome to Grant's ATM");
            System.out.println("Please select the following options underneath");
            Scanner userInputScanner = new Scanner(System.in);
            System.out.println(".1 Type in your Pin");
            System.out.println("2. Create a new account");
            System.out.println("3. Exit");
            
            int atmOptions = userInputScanner.nextInt();
            
            switch (atmOptions){
                case 1:
                    CreateAUser();
                    break;
                case 2:
                    LogIn();
                    break;
                case 3:
                    Exit();
                    break;
                default:
                    System.out.println("ERROR PLEASE SELECT THE GIVEN OPTIONS");
                    break;
                    
            }//close loop
        }//close switch
    }//close main 
    
    public static void CreateAUser(){
        User user = new User();        
        Scanner userInputScanner = new Scanner(System.in);
        user.accountHolderFirstName = userInputScanner.nextLine();
        System.out.println("Please enter a 5 digit pin");
        user.pin = userInputScanner.nextInt();
       
        }//close CreateAUser
   
   public static void VeiwAccountBalance(){
       
   }//close ViewAccountBalance
 
    public static void LogIn(){
        System.out.println("Please Enter your Pin Number:");
        
        
     
        
        
    }
    
    public static void Exit(){
        System.out.println("Exiting ATM");
    }//close Exit
    
}
