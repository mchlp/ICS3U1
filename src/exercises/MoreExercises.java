package exercises;

import java.util.*;

public class MoreExercises {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Question 1
		int n = in.nextInt();
		int sum = 0;
		while(n > 0) {
			sum += n;
			n -= 1;
		}
		System.out.println(sum);
		//Question 2
		int n2 = in.nextInt();
		int product = 1;
		while (n2 > 1) {
			product *= n2;
			n2 -= 1;
		}
		System.out.println(product);
		//Question 3
		int n3 = (int)(Math.random()*100); 
		int guess;
		int numGuess = 0;
		while (true) {
			numGuess += 1;
			System.out.print("Enter your guess: ");
			guess = in.nextInt();
			if (guess > n3) {
				System.out.println("Your guess was too large.");
			}
			else if (guess < n3) {
				System.out.println("Your guess was too small.");
			}
			else {
				System.out.println("You got it! It took " + numGuess + " guesses.");
				break;
			}
		}
		//Question 4
		System.out.print("Enter a word: ");
		String word = in.nextLine();
		boolean doubloon;
		if (word.length() % 2 == 0) {
			doubloon = false;	
		}
		else {
			char[] chars = new char[(int)(word.length()/2)];
			for (int i=0; i<(int)(word.length()); i++) {
				char c = word.charAt(i);
				for (int j=0; j<chars.length; j++) {
					if (chars[j] == c) {
						break;
					}
				}
				
			}
		}
		if (doubloon) {
			System.out.println(word + " is a doubloon.");
		}
		else {
			System.out.println(word + "is not a doubloon.");
		}
		
		
		in.close();
	}
}
