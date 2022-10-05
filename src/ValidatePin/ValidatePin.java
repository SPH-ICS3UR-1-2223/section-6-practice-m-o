package ValidatePin;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    	int pin = 4698;
    	System.out.println("Enter PIN now.");
    	int userPIN = in.nextInt();
    	int userGuesses = 1;
    	while (userPIN!=pin) {
    		System.out.println("Invaild PIN, please enter correct PIN.");
    		if (userGuesses>=3) {
    			break;
    		}
    		userGuesses++;
    		userPIN=in.nextInt();
    		
    	}
    	if (userPIN!=pin) {
    		System.out.println("Too many invailid answers! The police have been alerted to your location!");
    	}else {
    		System.out.println("Pin correct! Access granted!");
    	}
    	
    	
    	
    	
    	
    	
    	
    }
}
