package exercises;

import java.util.*;

public class MoreExercises {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Question 1
		System.out.println("Question 1");
		System.out.print("Enter a number to add to: ");
		int n = in.nextInt();
		int sum = 0;
		while(n > 0) {
			sum += n;
			n -= 1;
		}
		System.out.println(sum);
		//Question 2
		System.out.println("Question 2");
		System.out.println("Enter a number to multiply to: ");
		int n2 = in.nextInt();
		int product = 1;
		while (n2 > 1) {
			product *= n2;
			n2 -= 1;
		}
		System.out.println(product);
		//Question 3
		System.out.println("Question 3");
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
		System.out.println("Question 4");
		//Question 5
		System.out.println("Question 5");
		int numReproduce = 0;
		int[] numWaiting = new int[2];
		System.out.print("Enter the number of months that have passed: ");
		int numMonths = in.nextInt();
		for (int i=0; i<numMonths; i++) {
			numReproduce += numWaiting[1];
			numWaiting[1] = numWaiting[0];
			numWaiting[0] += numReproduce*2;
			if (i==0) {
				numWaiting[0] = 2;
			}
		}
		System.out.println("There are " + (numReproduce+numWaiting[0]+numWaiting[1]) + " bunnies after " + numMonths + ".");
		in.close();
		//Question 6
		System.out.println("Question 6");
		System.out.print("Enter a binary number to convert to a decimal: ");
		String binNum = in.nextLine();
		int pow = 0;
		int total = 0;
		boolean realNum;
		for (int i=binNum.length(); i>0; i--) {
			if (binNum.charAt(i) == '1') {
				total += Math.pow(2, pow);
				pow++;
			}
			else if (binNum.charAt(i) != '0') {
				System.out.println("That is not a valid binary number.");
				realNum = false;
				break;
			}
		}
		System.out.println(binNum + " in decimal format is " + total);
		//Question 7 
		System.out.println("Question 7");
		System.out.println("Enter the birthdays on each person in the format MM DD (one per line) and enter -1 to end");
		String input;
		int month;
		int day;
		boolean[][] arr = new boolean[13][32];
		while (true) {
			input = in.nextLine();
			String[] splitInput = input.split(" ");
		}
		
	}
}
