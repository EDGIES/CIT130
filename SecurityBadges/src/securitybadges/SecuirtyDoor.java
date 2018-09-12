/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitybadges;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;



/**
 *
 * @author egyedg
 */
public class SecuirtyDoor {

    // loop for switch
    public static boolean mainLoop = true;

    //array for users
    static LinkedList<Users> usersList = new LinkedList<Users>();
    
    //Created stacks for users
   public static Stack<String> stackOfUsers = new Stack<>();
   
   public static String LastUser = Users.class.getName();
   
 
     
    
    
   

    public static void main(String[] args) {
         

        //loop for switch
        while (mainLoop) {

            System.out.println("Please Select the following Options Underneath");
            //scanner for user input for switch 
            Scanner userInputScanner = new Scanner(System.in);
            System.out.println("1. Type in your code");
            System.out.println("2. Create a new user");
            System.out.println("3. See the last user ");
            System.out.println("4. Show list of all users");

            int doorOptions = userInputScanner.nextInt();

            switch (doorOptions) {
                case 1:
                    UnlockingDoor();

                    break;
                case 2:

                    FirstTimeUsers();

                    break;
                case 3: 
                    LastUser();
                    break;
                case 4:
                    showUsers();
                    break;
                default:
                    System.out.println("Error please select the given options");
                    break;

            }//close loop

        }//close switch

    }// close main

    public static void FirstTimeUsers() {
        Users user = new Users();

        System.out.println("Please Enter your Name: ");
        Scanner userInputScanner = new Scanner(System.in);
        user.setName(userInputScanner.nextLine());
        System.out.println("Please enter 5 digit Passcode:");
        user.setPasscode(userInputScanner.nextInt());
        usersList.add(user);
    }//close FirstTimeUsers

    private static void UnlockingDoor() {
        
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Please Type in your code:");

        int typedCode = userInputScanner.nextInt();
        boolean doorUnlocked = false;
        for (Users user : usersList) {
            if (typedCode == user.getPasscode()) {
                
                doorUnlocked = true;
                
                Object LastUser = stackOfUsers.push(user.getName());
                break;
            }
        }//close if
        if (!doorUnlocked) {
            System.out.println("Wrong Passcode Door is locked");
        }//close if 
    }// close UnlockingDoor
    
    public static void LastUser(){
        System.out.println("Last Person:"+ stackOfUsers.peek());
        //System.out.println("Last user walked in the door" +userStack.pop());
        
    }
    
    public static void showUsers(){
       for (Users user:usersList){
           System.out.println(user.getName());
       }


    }
    



}//close main
    
        
    

