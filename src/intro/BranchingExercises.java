package intro;

import java.util.Scanner;

public class BranchingExercises {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		Question1();
		Question2();
		Question3();
		Question4();
		Question5();
		Question6();
		Question7();
		Question8();
		Question9();
		Question10();
		Question11();
		Question12();
		Question13();
		Question14();
		in.close();
	}

	private static void Question1() {
		/*-
		 * QUESTION 1 
		 * INPUT: an integer, the cost of the purchase 
		 * OUTPUT: an integer, the discounted price
		 */
		System.out.print("Enter the amount of purchase: ");
		int price = in.nextInt();
		double discount = 0.15;
		System.out.print("Discounted Price: ");
		if (price > 100) {
			System.out.println((price) * (int) (1 - discount));
		} else {
			System.out.println(price);
		}
	}

	private static void Question2() {
		/*-
		 * QUESTION 2 
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
		if (washers < bolts * 2) {
			System.out.println("Check the Order: Too Few Washers");
		}

		int cost = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;

		System.out.println("Total Cost: " + cost);
	}

	private static void Question3() {
		/*-
		 * QUESTION 3 
		 * INPUT: integers, tank capacity, gauge reading, and miles per gallon 
		 * OUTPUT: boolean, whether to get gas or not
		 */

		final int DISTANCE = 200;

		System.out.print("Tank Capacity: ");
		int tankCap = in.nextInt();
		System.out.print("Gauge Reading: ");
		int gaugeReading = in.nextInt();
		System.out.print("Miles Per Galloon: ");
		int milesPerGallon = in.nextInt();

		if (((tankCap * gaugeReading) / 100) >= DISTANCE * milesPerGallon) {
			System.out.println("Safe to Proceed");
		} else {
			System.out.println("Get Gas!");
		}
	}

	private static void Question4() {
		/*-
		 * QUESTION 4 
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
		/*-
		 * QUESTION 5 
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

		double pricePerA = priceA / leanA * 100;
		double pricePerB = priceB / leanB * 100;

		char better = (pricePerA < pricePerB) ? 'A' : 'B';
		System.out.println("Package A cost per pound of lean: " + pricePerA);
		System.out.println("Package B cost per pound of lean: " + pricePerB);
		System.out.println("Package " + better + " is the best value");
	}

	private static void Question6() {
		/*-
		 * QUESTION 6 
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
		System.out.println("Your age: " + (curYear - yearBirth));
	}

	private static void Question7() {
		/*-
		 * QUESTION 7 
		 * INPUT: integers, the temperature in Fahrenheit and the wind speed in MPH 
		 * OUTPUT: double, the wind chill index
		 */

		System.out.print("Enter the Temperature in Fahrenheit: ");
		int temp = in.nextInt();
		System.out.print("Enter the speed of the wind in MPH: ");
		int v = in.nextInt();
		double wci;

		if (0 <= v && v <= 4) {
			wci = temp;
		} else if (v >= 45) {
			wci = (1.6 * temp) - 55;
		} else {
			wci = 91.4 + ((91.4 - temp) * ((0.0203 * v) - (0.304 * (Math.sqrt(v))) - 0.474));
		}
		System.out.println("Wind Chill Index: " + wci);
	}

	private static void Question8() {
		/*-
		 * QUESTION 8 
		 * INPUT: integers, age and time on 24-hour clock 
		 * OUTPUT: integer, the cost of the ticket in dollars
		 */

		final int adultPrice = 8;
		final int adultMPrice = 5;
		final int childPrice = 4;
		final int childMPrice = 2;
		final int mTime = 1700;
		final int adultAge = 18;

		System.out.print("Enter your age: ");
		int age = in.nextInt();
		System.out.print("Enter the time on a 24-hour clock: ");
		int time = in.nextInt();

		int price;

		if (time < mTime) {
			if (age < adultAge) {
				price = childMPrice;
			} else {
				price = adultMPrice;
			}
		} else {
			if (age < adultAge) {
				price = childPrice;
			} else {
				price = adultPrice;
			}
		}

		System.out.println("The price of the ticket is " + price + " dollars.");
	}

	private static void Question9() {
		/*- 
		 * QUESTION 9
		 * INPUT: string, name of item; integer, price in cents; integer, overnight delivery (yes/or)
		 * OUTPUT: doubles, the cost of the item, delivery cost, and total cost
		 */

		System.out.print("Enter the item: ");
		String itemName = in.nextLine();
		System.out.print("Enter the price: ");
		double price = in.nextInt() / 100.0;
		System.out.print("Overnight delivery (0 == no, 1 == yes): ");
		int overniteDel = in.nextInt();

		int ship = price < 10 ? 2 : 3;
		if (overniteDel == 1) {
			ship += 5;
		}

		System.out.println("Invoice:");
		System.out.printf("%s:\t\t\t%.2f\n", itemName, price);
		System.out.printf("Shipping:\t\t%.2f\n", ship * 1.0);
		System.out.printf("Total:\t\t\t%.2f\n", price + ship);
	}

	private static void Question10() {
		/*-
		 * QUESTION 10
		 * INPUT: integers, the number of items to heat and double, the single-item heating time
		 * OUTPUT: the recommended heating time
		 */

		System.out.print("Enter the number of items to heat: ");
		int numItem = in.nextInt();
		System.out.print("Enter the single-item heating time: ");
		double singleTime = in.nextDouble();

		double totalTime;
		if (numItem == 1) {
			totalTime = singleTime;
		} else if (numItem == 2) {
			totalTime = singleTime * 1.5;
		} else if (numItem == 3) {
			totalTime = singleTime * 2;
		} else {
			totalTime = -1;
		}

		if (totalTime == -1) {
			System.out.println("It is not recommended that you heat more than three items at once.");
		} else {
			System.out.println("The recommended heating time is: " + totalTime);
		}
	}

	private static void Question11() {
		/*-
		 * QUESTION 11
		 * INPUT: doubles, the balance of the chequing and savings accounts
		 * OUTPUT: double/string, the service charge per check
		 */

		System.out.print("Enter the balance of the Chequing account: ");
		double cheq = in.nextDouble();
		System.out.print("Enter the balance of the Savings accont: ");
		double save = in.nextDouble();

		if (cheq > 4000 || save > 5500) {
			System.out.println("There is no service charge.");
		} else {
			System.out.print("The service charge is $0.15 per check.");
		}
	}

	private static void Question12() {
		/*-
		 * QUESTION 12
		 * INPUT: integers, the pressures of all four tires
		 * OUTPUT: string, whether the tire pressures are OK
		 */

		System.out.print("Input right front pressure: ");
		int rightFront = in.nextInt();
		System.out.print("Input left front pressure: ");
		int leftFront = in.nextInt();
		System.out.print("Input right rear pressure: ");
		int rightBack = in.nextInt();
		System.out.print("Input left rear pressure: ");
		int leftBack = in.nextInt();

		if (rightFront == leftFront && rightBack == leftBack) {
			System.out.println("Inflation is OK.");
		} else {
			System.out.println("Inflation is BAD.");
		}
	}

	private static void Question13() {
		/*-
		 * QUESTION 13
		 * INPUT: integers, the pressures of all four tires
		 * OUTPUT: string, whether the tire pressures are OK (front tires are equal and back tires are equal)
		 */

		boolean bad = false;

		System.out.print("Input right front pressure: ");
		int rightFront = in.nextInt();
		if (rightFront > 45 || rightFront < 35) {
			System.out.println("WARNING: Pressure is Out of Range");
			bad = true;
		}

		System.out.print("Input left front pressure: ");
		int leftFront = in.nextInt();
		if (leftFront > 45 || leftFront < 35) {
			System.out.println("WARNING: Pressure is Out of Range");
			bad = true;
		}

		System.out.print("Input right rear pressure: ");
		int rightBack = in.nextInt();
		if (rightBack > 45 || rightBack < 35) {
			System.out.println("WARNING: Pressure is Out of Range");
			bad = true;
		}

		System.out.print("Input left rear pressure: ");
		int leftBack = in.nextInt();
		if (leftBack > 45 || leftBack < 35) {
			System.out.println("WARNING: Pressure is Out of Range");
			bad = true;
		}

		if (rightFront == leftFront && rightBack == leftBack && !bad) {
			System.out.println("Inflation is OK.");
		} else {
			System.out.println("Inflation is BAD.");
		}
	}

	private static void Question14() {
		/*-
		 * QUESTION 13
		 * INPUT: integers, the pressures of all four tires
		 * OUTPUT: string, whether the tire pressures are OK (front tires are in range of each other and back tires are in range of each other)
		 */

		boolean bad = false;

		System.out.print("Input right front pressure: ");
		int rightFront = in.nextInt();
		if (rightFront > 45 || rightFront < 35) {
			System.out.println("WARNING: Pressure is Out of Range");
			bad = true;
		}

		System.out.print("Input left front pressure: ");
		int leftFront = in.nextInt();
		if (leftFront > 45 || leftFront < 35) {
			System.out.println("WARNING: Pressure is Out of Range");
			bad = true;
		}

		System.out.print("Input right rear pressure: ");
		int rightBack = in.nextInt();
		if (rightBack > 45 || rightBack < 35) {
			System.out.println("WARNING: Pressure is Out of Range");
			bad = true;
		}

		System.out.print("Input left rear pressure: ");
		int leftBack = in.nextInt();
		if (leftBack > 45 || leftBack < 35) {
			System.out.println("WARNING: Pressure is Out of Range");
			bad = true;
		}

		if (Math.abs(rightFront - leftFront) <= 3 && Math.abs(rightBack - leftBack) <= 3 && !bad) {
			System.out.println("Inflation is OK.");
		} else {
			System.out.println("Inflation is BAD.");
		}
	}
}
