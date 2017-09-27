package exercises;

import java.util.Scanner;

public class MoreDataType {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/* QUESTION 1
		 * INPUT: N, positive integer, the amount of change that is due in cents
		 * OUTPUT: the number of toonies, loonies, quarters, dimes, and nickels, pennies needed
		 */
		
		System.out.print("Enter the amount in cents: ");
		int cents = in.nextInt();
		in.nextLine();
		int T = cents/200;
		cents %= 200;
		int L = cents/100;
		cents %= 100;
		int Q = cents/25;
		cents %= 25;
		int D = cents/10;
		cents %= 10;
		int N = cents/5;
		cents %= 5;
		int P = cents;
		
		System.out.println("Return " + T + " toonies, " + L + " loonies, " + Q + " quarters, " + D + " dimes, " + N + " nickels, " + P + " pennies.");
	
		/*
		 * QUESTION 2
		 * INPUT: a positive number, the number of seconds the brick has traveled
		 * OUTPUT: a positive integer, the number of 
		 */
		
		System.out.print("Enter the number of seconds: ");
		double S = in.nextDouble();
		in.nextLine();
		double dis = ((double)1/2)*9.81*(S*S);
		System.out.println("In " + S + " seconds, the brick travelled " + dis + " metres.");
		
		/*
		 * QUESTION 3
		 * INPUT: a string of text, your name
		 * OUTPUT: a string of text, your name plus HELLO
		 */
		
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.println("Hello, " + name);
		
		/*
		 * QUESTION 4
		 * INPUT: A string of text, your full name
		 * OUTPUT: A string of text, you initials 
		 */
		
		System.out.print("Enter you full name: ");
		String[] fullName = in.nextLine().split(" ");
		for (String namePart : fullName) {
			System.out.print(namePart.toUpperCase().charAt(0));
		}
		System.out.println();
		
		/*
		 * QUESTION 5
		 * INPUT: A string of text, your full name
		 * OUTPUT: A string of text, your first and last name
		 */
		
		System.out.print("Enter you full name: ");
		fullName = in.nextLine().split(" ");
		System.out.println(fullName[0] + " " + fullName[fullName.length-1]);
		
		/*
		 * QUESTION 6
		 * INPUT: A string of text, a word
		 * OUTPUT: A string of text, the word reversed
		 */
		
		System.out.print("Enter the word: ");
		String word = in.nextLine();
		for (int i=word.length()-1; i>-1; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		
		/*
		 * QUESTION 7
		 * INPUT: A string of text, a word
		 * OUTPUT: A string of text, the word capitalized
		 */
		
		System.out.print("Enter the word: ");
		word = in.nextLine();
		System.out.println(word.toUpperCase());
		
		/*
		 * QUESTION 8
		 * INPUT: A string of text, a word with an odd number of letters
		 * OUTPUT: A string of text, the word with the middle character removed
		 */
		
		System.out.print("Enter the word: ");
		word = in.nextLine();
		int middle = word.length()/2;
		System.out.println(word.substring(0, middle) + word.substring(middle+1));
	}
}
