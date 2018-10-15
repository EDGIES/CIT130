/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twofactorsauthentication;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;

/**
 *class is for creating a random number
//generator that changes in amount of time
//creating a code to use to authenicate to login
* got the code from https://www.geeksforgeeks.org/java-util-timer-class-java/
 * @author grant.egyed
 */

class RandomNumberGenerator extends TimerTask { 
    public int n;
   
    public int play() 
    { 
         Random rand = new Random();
        int n = rand.nextInt(99999999) + 11111111;
        Timer timer = new Timer(); 
        TimerTask task = new RandomNumberGenerator(); 
          
        timer.schedule(task, 1, 15000); 
        
      
        return  n;
        
    } 

    @Override
    public void run() {
        Random rand = new Random();
        int n = rand.nextInt(99999999) + 11111111;
        
      
       
    }

 } 
  


 
  

    


