package Jiya07;

import java.util.Scanner;
import java.util.Random;
public class NumberGame {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Random random = new Random();
	        int min = 1;
	        int max = 100;
	        int randomNumber = random.nextInt(max - min + 1) + min;
	        int attempts = 0;
	        boolean correctGuess = false;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

	        while (!correctGuess) {
	            System.out.print("Enter your guess: ");
	            int userGuess = input.nextInt();
	            attempts++;

	            if (userGuess == randomNumber) {
	                correctGuess = true;
	                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	            } else if (userGuess < randomNumber) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("Too high! Try again.");
	            }
	        }

	        System.out.println("Would you like to play again? (yes/no)");
	        String playAgain = input.next();

	        if (playAgain.equalsIgnoreCase("yes")) {
	            main(args); // Restart the game
	        } else {
	            System.out.println("Thanks for playing! Goodbye!");
	        }

	        input.close();
	    }
}
	

