/**
 * Michael Pu
 * ICS3U1
 * Beginning Exercises
 */

package intro;

import java.util.Scanner;

public class BeginExercises {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Exercise 1
		System.out.print("Enter the number you want a factorial of: ");
		int end = in.nextInt();
		int product = 1;
		for (int i = 1; i <= end; i++) {
			product *= i;
		}
		System.out.println("The factorial of " + end + " is " + product);
		
		//Exercise 2
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (true) {
			System.out.print("Enter the next number: ");
			int num = in.nextInt();
			if (num < 0) {
				break;
			}
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("The max number is: " + max);
		System.out.println("The min number is: " + min);
		in.close();
	}
}
