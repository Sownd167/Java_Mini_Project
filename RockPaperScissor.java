package Coding_Questions;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        int userPoints = 0;
        int systemPoints = 0;

        while (true) {
            System.out.println("***************************************");
            System.out.println("ENTER YOUR MOVE (ROCK/PAPER/SCISSORS)");
            System.out.println("ENTER 'QUIT' TO END THE GAME!!");
            System.out.println("***************************************");

            String userinput = sc.nextLine().toLowerCase();
            if (userinput.equals("quit")) {
            	 System.out.println("THANK YOU! SEE YOU AGAIN!");
                 break;
              }
            int random = ran.nextInt(3);
            	String systeminput = getComputerMove(random);
                System.out.println("USER'S MOVE: " + userinput);
                System.out.println("SYSTEM'S MOVE: " + systeminput);
           	
           	if (userinput.equals(systeminput)) {
                   System.out.println("IT'S A TIE...");
               } 
           	else if ((userinput.equals("paper") && systeminput.equals("rock"))
                       || (userinput.equals("rock") && systeminput.equals("scissors"))
                       || (userinput.equals("scissors") && systeminput.equals("paper"))) {
                  
                   userPoints++;
               } 
               else {
                   systemPoints++;
               }

               System.out.println("USER POINTS: " + userPoints);
               System.out.println("SYSTEM POINTS: " + systemPoints);
            }  
        if(userPoints > systemPoints) {
           	System.out.println("USER WON!!!....");
           }
           else if(userPoints == systemPoints) {
        	   System.out.println("IT'S A TIE !!...");
           }
           else {
           	System.out.println("SYSTEM WON!!!....");
           }
             
    }  
              
              
    
    public static String getComputerMove(int r) {
    	if(r==0) {
			return "rock";
		}
		else if(r==1) {
			return "paper";
		}
		else {
			return "scissors";
		}
    }

    
    	
    }

