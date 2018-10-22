/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamscorekeeper;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridLayout;


/**
 *
 * @author grant.egyed
 */
public class TeamScoreKeeper {
    private static Frame mainFrame;
    private static Panel topPanel;
    private static Panel bottomPanel;
    private static Button button1;
    private static Button button2;
    private static Button button3;
    private static Label instructionLabel;
    private static Label instructionLabel2;
    private static Label pushedButton1;
    private static Label pushedButton2;
    private static FlowLayout centeredText;
    private static Font labelFont;
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreBoard();
        // TODO code application logic here
    }//close main 
    public static void ScoreBoard(){
        mainFrame = new Frame("Team Score Keeper");
        mainFrame.setLayout(new GridLayout());
        mainFrame.setSize(800,600);
        
        
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        centeredText = new FlowLayout(FlowLayout.CENTER,35,35);
        topPanel = new Panel(centeredText);
        bottomPanel = new Panel(centeredText);
        
        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
        button1 = new Button("score");
        button2 = new Button("score");
        button3 = new Button("reset");
        
        Dimension buttonSize = new Dimension (175,55);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        
        instructionLabel = new Label("Blue Team");
        topPanel.add(instructionLabel);
        instructionLabel2 = new Label ("Red Team");
        topPanel.add(instructionLabel2);
        
        
        topPanel.add(button1);
        topPanel.add(button2);
        bottomPanel.add(button3);
        
        
        mainFrame.setVisible(true);
        
        
        
        
        
    }//Close ScoreBoard
    
}//close TeamScoreKeeper Class
