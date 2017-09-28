package intro;

import java.util.Scanner;

public class BranchingExercises {
	
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		/*
		Question1();
		Question2();
		Question3();
		Question4();
		Question5();*/
		Question6();
		Question7();
		in.close();
	}
	
	private static void Question1() {
		/* QUESTION 1
		 * INPUT: an integer, the cost of the purchase
		 * OUTPUT: an integer, the discounted price
		 */
		System.out.print("Enter the amount of purchase: ");
		int price = in.nextInt();
		double discount = 0.15;
		System.out.print("Discounted Price: ");
		if (price > 100) {
			System.out.println((price)*(int)(1-discount));
		} else {
			System.out.println(price);
		}
	}
	
	private static void Question2() {
		/* QUESTION 2
		 * INPUT: integers, the number of bolts, nuts, and washers
		 * OUTPUT: whether it is a correct order and the total cost of the order
		 */
		
		final int boltPrice = 5;
		final int nutPrice = 3;
		final int washerPrice = 1;
		
		System.out.print("Number of bolts: ");
		int bolts = in.nextInt();
		System.out.print("Number of nuts: ");
		int nuts = in.nextInt();
		System.out.print("Number of washers: ");
		int washers = in.nextInt();
		
		if (nuts < bolts) {
			System.out.println("Check the Order: Too Few Nuts");
		}
		if (washers < bolts*2) {
			System.out.println("Check the Order: Too Few Washers");
		}
		
		int cost = bolts*boltPrice + nuts*nutPrice + washers*washerPrice;
		
		System.out.println("Total Cost: " + cost);	
	}
	
	private static void Question3() {
		/* QUESTION 3
		 * INPUT: integers, tank capacity, gauge reading, and miles per gallon
		 * OUTPUT: boolean, whether to get gas or not
		 */
		
		final int distance = 200;
		
		System.out.print("Tank Capacity: ");
		int tankCap = in.nextInt();
		System.out.print("Gauge Reading: ");
		int gaugeReading = in.nextInt();
		System.out.print("Miles Per Galloon: ");
		int milesPerGallon = in.nextInt();
		
		if (((tankCap*gaugeReading)/100) >= distance*milesPerGallon) {
			System.out.println("Safe to Proceed");
		} else {
			System.out.println("Get Gas!");
		}
	}
	
	private static void Question4() {
		/* QUESTION 4
		 * INPUT: integer, the weight of the contestant
		 * OUTPUT: boolean, if the contestant is allowed in the contest
		 */
		
		final int max = 280;
		final int min = 220;
		
		System.out.print("Enter the contestant's weight: ");
		int weight = in.nextInt();
		String text = (weight <= max && weight >= min) ? "allowed" : "not allowed";
		System.out.println("This contestant is " + text + " in the contest");		
	}
	
	private static void Question5() {
		/* QUESTION 5
		 * INPUT: integers, the price per pound and percent lean for package A and package B
		 * OUTPUT: integers, cost per pound of lean for package A and B, and string, which is the best value
		 */

		System.out.print("Price per pound package A: ");
		double priceA = in.nextDouble();
		System.out.print("Percent lean package A: ");
		double leanA = in.nextDouble();
		System.out.print("Price per pound package B: ");
		double priceB = in.nextDouble();
		System.out.print("Percent lean package B: ");
		double leanB = in.nextDouble();
		
		double pricePerA = priceA/leanA*100;
		double pricePerB = priceB/leanB*100;
		
		char better = (pricePerA < pricePerB) ? 'A' : 'B';
		System.out.println("Package A cost per pound of lean: " + pricePerA);
		System.out.println("Package B cost per pound of lean: " + pricePerB);
		System.out.println("Package " + better + " is the best value");
	}
	
	private static void Question6() {
		/* QUESTION 6
		 * INPUT: integers, year of birth and current year
		 * OUTPUT: integers, your age
		 */
		
		System.out.print("Year of Birth: ");
		int yearBirth = in.nextInt();
		System.out.print("Current Year: ");
		int curYear = in.nextInt();
		if (curYear < yearBirth) {
			curYear += 100;
		}
		System.out.println("Your age: " + (curYear-yearBirth));
	}
	
	private static void Question7() {
		/* QUESTION 7
		 * INPUT: integers, year of birth and current year
		 * OUTPUT: integers, your age
		 */
		
		System.out.print("Year of Birth: ");
		int yearBirth = in.nextInt();
		System.out.print("Current Year: ");
		int curYear = in.nextInt();
		if (curYear < yearBirth) {
			curYear += 100;
		}
		System.out.println("Your age: " + (curYear-yearBirth));
	}
}
