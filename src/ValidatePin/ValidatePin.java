package ValidatePin;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pin = 7891;
        System.out.println("Enter a PIN");
        int userPin=in.nextInt();
        int userGuesses=1;
        while (userPin!=pin) {
        	System.out.println("Incorrect PIN. Please try again.");
        	if (userGuesses>=3) {
        		break;
        	}
        	userGuesses++;
        	userPin=in.nextInt();
        }
        if (userPin!=pin) {
        	System.out.println("You ran out out of guesses. You are going to brazil");
        }
        else {
        	System.out.println("Correct PIN. Access granted.");
        }
    }
}
