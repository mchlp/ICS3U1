/*
 * Michael Pu
 * ICS3U1 - DataTypes
 * ICS3U1 - Mr. Radulovic
 * November 27, 2017
 */

package intro;

import java.util.Scanner;

public class DataTypes {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		 * QUESTION 1
		 * INPUT: a number, N
		 * OUTPUT: the cube of N
		 */

		System.out.print("Enter a number: ");
		double N = in.nextInt();
		System.out.println("The cube of " + N + " is " + Math.pow(N, 3));
		
		/*
		 * QUESTION 2
		 * INPUT: a positive integer, N
		 * OUTPUT: the square root of N
		 */

		System.out.print("Enter a number: ");
		N = in.nextInt();
		System.out.println("The square root of " + N + " is " + Math.sqrt(N));
		
		/*
		 * QUESTION 3
		 * INPUT: integers a, b, c 
		 * OUTPUT: the roots of the equation y = ax^2 + bx + c
		 */

		System.out.print("Enter a: ");
		int a = in.nextInt();
		System.out.print("Enter b: ");
		int b = in.nextInt();
		System.out.print("Enter c: ");
		int c = in.nextInt();

		double thingUnderRoot = Math.sqrt((b*b) - (4*a*c));
		double x1 = ((b*-1) + thingUnderRoot)/(2*a);
		double x2 = ((b*-1) - thingUnderRoot)/(2*a);

		System.out.println("The roots are " + x1 + " and " + x2);
		
		/*
		 * QUESTION 4
		 * INPUT: the number of children, seniors, and adults
		 * OUTPUT: the price of the tickets
		 */

		System.out.print("Enter number of children: ");
		int children = in.nextInt();
		System.out.print("Enter the number of seniors: ");
		int seniors = in.nextInt();
		System.out.print("Enter the number of adults: ");
		int adults = in.nextInt();

		System.out.println("The total cost of the tickets is $" + ((children*8)+(seniors*6)+(adults*16)));

		in.close();
	}
}
