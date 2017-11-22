/*
 * Michael Pu
 * ICS3U1 - InputOutput
 * ICS3U1 - November 2017
 * Mr. Radulovic
 */

package intro;

import java.util.Random;
import java.util.Scanner;

//Exercises for input/output

public class InputOutput {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		Question1();
		Question2();
		Question3();
		Question4();
		Question5();
		Question6();

		in.close();
	}

	private static void Question1() {
		/*-
		 * QUESTION 1
		 * INPUT: positive integer, radius
		 * OUTPUT: double, the area of the circle
		 */

		System.out.print("Enter the radius: ");
		int r = in.nextInt();
		System.out.println("The area is: " + Math.PI * Math.pow(r, 2));
	}

	private static void Question2() {
		/*-
		 * QUESTION 2
		 * INPUT: positive integer, cents
		 * OUTPUT: integers, dollars and cents
		 */

		final int cents = 100;

		System.out.print("Enter the cents: ");
		int c = in.nextInt();
		int d = c / cents;
		c = c % cents;
		System.out.println("That is " + d + " dollars and " + c + " cents.");
	}

	private static void Question3() {
		/*-
		 * QUESTION 3
		 * INPUT: a positive integer, guess
		 * OUTPUT: boolean, if the guess was correct
		 */

		int num = new Random().nextInt(10) + 1;
		System.out.print("Guess a number between 1 and 10: ");
		int guess = in.nextInt();
		if (guess == num) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong guess! The number was " + num);
		}
	}

	private static void Question4() {
		/*-
		 * QUESTION 4
		 * INPUT: a positive integer, guess
		 * The user is given 3 guesses
		 * OUTPUT: boolean, if the guess was correct
		 */

		int num = new Random().nextInt(10) + 1;
		int numGuess = 0;
		while (numGuess < 3) {
			System.out.print("Guess a number between 1 and 10: ");
			int guess = in.nextInt();
			if (guess == num) {
				System.out.println("Correct!");
				break;
			} else {
				System.out.print("Wrong guess! ");
				numGuess++;
			}
		}
	}

	private static void Question5() {
		/*-
		 * QUESTION 5
		 * INPUT: a positive integer, guess
		 * The user is given 3 guesses and hint after each guess
		 * OUTPUT: boolean, if the guess was correct
		 */

		int num = new Random().nextInt(10) + 1;
		int numGuess = 0;
		while (numGuess < 3) {
			System.out.print("Guess a number between 1 and 10: ");
			int guess = in.nextInt();
			if (guess == num) {
				System.out.println("Correct!");
				break;
			} else {
				System.out.print("Wrong guess! ");
				if (guess < num) {
					System.out.println("Too low.");
				} else {
					System.out.println("Too high.");
				}
				numGuess++;
			}
		}
	}

	private static void Question6() {
		/*-
		 * QUESTION 6
		 * INPUT: a positive integer, guess; string, their name
		 * The user is given 3 guesses and hint after each guess
		 * OUTPUT: boolean, if the guess was correct
		 */

		in.nextLine();
		System.out.print("Enter you name: ");
		String name = in.nextLine();

		boolean play = true;
		int win = 0;
		int total = 0;

		while (play) {
			int num = new Random().nextInt(10) + 1;
			int numGuess = 0;
			while (numGuess < 3) {
				System.out.print(name + ", guess a number between 1 and 10: ");
				int guess = in.nextInt();
				if (guess == num) {
					System.out.println("Correct!");
					win++;
					break;
				} else {
					System.out.print("Wrong guess! ");
					if (guess < num) {
						System.out.println("Too low.");
					} else {
						System.out.println("Too high.");
					}
					numGuess++;
				}
			}
			total++;
			int choice;
			do {
				System.out.println("Do you want to play again? 0=no, 1=yes");
				choice = in.nextInt();
			} while (!(choice == 1 | choice == 0));
			if (choice == 0) {
				break;
			}
		}

		System.out.println("You won " + win + " games out of " + total + ", giving you a score of "
				+ (win * 100) / total + "%. Bye!");
	}
}
