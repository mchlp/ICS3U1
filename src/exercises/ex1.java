package exercises;

import java.util.Scanner;

public class ex1 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number you want a factorial of: ");
		int end = in.nextInt();
		int product = 1;
		for (int i = 1; i <= end; i++) {
			product *= i;
		}
		System.out.println("The factorial of " + end + " is " + product);
		in.close();
	}
}
