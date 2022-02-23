package ASSIGNMENTS;

import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ans = "yes";
		System.out.println("This is RandomNumberGuesser");
		do {
			int highGuess = 100, lowGuess = 0;
			int count = 0;
			boolean statues = false;
			int random;
			random = RNG.rand();

			Scanner input = new Scanner(System.in);
			System.out.println("Enter your first guess");// Asking for the first time
			int guess = input.nextInt();
			do {// System.out.println(random);
				statues = false;
				count = RNG.getCount();// call the getcount method

				if (guess > random && highGuess > guess) {
					highGuess = guess;
					System.out.println("Number of guesses is " + count);// telling the user guess count
					System.out.println("Your guess is to high");// telling the user if the guess is higher

				} else if (guess < random && lowGuess < guess) {
					lowGuess = guess;
					System.out.println("Number of guesses is " + count);// telling the user guess count
					System.out.println("Your guess is to low");// telling the user if the guess is low

				}
				if (random != guess) {
					statues = RNG.inputValidation(guess, lowGuess, highGuess);// call for the input validation method
					guess = input.nextInt();
				}
				if (random == guess) // Execute when the user guess correctly
				{
					count++;
					System.out.println("Number of guesses is " + count);
					System.out.println("Congratulations, You guessed correctly");
					statues = true;
					count = RNG.resetCount();
				}
			} while (statues == false && count < 6);// loop it until user give the right answer

			System.out.println("Try again? (yes or no)");
			ans = input.next();

		} while ("yes".equals(ans));// loop if the user want to do it again

		System.out.println("Thanks for playing....");// thanks the user
		System.out.println("Programmer: Vishwa Dewatha Pejjalage");// programmer name
	}

}
