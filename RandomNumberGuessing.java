package Coding_Questions;

import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		//int number = 1+(int)(50*Math.random());   
		Random ran = new Random(); 
		int number = 1+ran.nextInt(50); //1-50 numbers
		int trials = 5;
		int i;
		for( i=1;i<=trials;i++) {
		System.out.println("----------------------------------------------");
		System.out.println("Enter your guess (Trial " + i + " of " + trials + "):");
		System.out.println("----------------------------------------------");
		int userinput = sc.nextInt();
		

        if (userinput == number) {
            System.out.println("Congratulations! You guessed correctly..!!!");
            break;
        } else if (userinput < number) {
            System.out.println("Your guess is too low....");
        } else {
            System.out.println("Your guess is too high....");
        }
    }

    if (i > trials) {
        System.out.println("***********************");
        System.out.println("TRIALS ARE OVER......");
        System.out.println("The number was: " + number);
        System.out.println("***********************");
    }
	}

}
