/*
 * Michael Pu
 * ICS3U1 - MoreDataType
 * ICS3U1 - November 2017
 * Mr. Radulovic
 */

package intro;

import java.util.Scanner;

public class MoreDataType {

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
        in.close();
    }

    private static void Question1() {

		/*
		 * QUESTION 1 INPUT: N, positive integer, the amount of change that is due in
		 * cents OUTPUT: the number of toonies, loonies, quarters, dimes, and nickels,
		 * pennies needed
		 */

        final int centsPerTonnie = 200;
        final int centsPerLoonie = 100;
        final int centsPerQuarter = 25;
        final int centsPerDime = 10;
        final int centsPerNickel = 5;

        System.out.print("Enter the amount in cents: ");
        int cents = in.nextInt();
        in.nextLine();
        int T = cents / centsPerTonnie;
        cents %= centsPerTonnie;
        int L = cents / centsPerLoonie;
        cents %= centsPerLoonie;
        int Q = cents / centsPerQuarter;
        cents %= centsPerQuarter;
        int D = cents / centsPerDime;
        cents %= centsPerDime;
        int N = cents / centsPerNickel;
        cents %= centsPerNickel;
        int P = cents;

        System.out.println("Return " + T + " toonies, " + L + " loonies, " + Q + " quarters, " + D + " dimes, " + N
                + " nickels, " + P + " pennies.");
    }

    private static void Question2() {
        /*
		 * QUESTION 2 INPUT: a positive number, the number of seconds the brick has
		 * traveled OUTPUT: a positive integer, the number of
		 */

        final double gravity = 9.8;

        System.out.print("Enter the number of seconds: ");
        double S = in.nextDouble();
        in.nextLine();
        double dis = ((double) 1 / 2) * gravity * (S * S);
        System.out.println("In " + S + " seconds, the brick travelled " + dis + " metres.");
    }

    private static void Question3() {

		/*
		 * QUESTION 3 INPUT: a string of text, your name OUTPUT: a string of text, your
		 * name plus HELLO
		 */

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }

    private static void Question4() {

		/*
		 * QUESTION 4 INPUT: A string of text, your full name OUTPUT: A string of text,
		 * you initials
		 */

        System.out.print("Enter you full name: ");
        String[] fullName = in.nextLine().split(" ");
        for (String namePart : fullName) {
            System.out.print(namePart.toUpperCase().charAt(0));
        }
        System.out.println();
    }

    private static void Question5() {

		/*
		 * QUESTION 5 INPUT: A string of text, your full name OUTPUT: A string of text,
		 * your first and last name
		 */

        System.out.print("Enter you full name: ");
        String[] fullName = in.nextLine().split(" ");
        System.out.println(fullName[0] + " " + fullName[fullName.length - 1]);
    }

    private static void Question6() {

		/*
		 * QUESTION 6 INPUT: A string of text, a word OUTPUT: A string of text, the word
		 * reversed
		 */

        System.out.print("Enter the word: ");
        String word = in.nextLine();
        for (int i = word.length() - 1; i > -1; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }

    private static void Question7() {

		/*
		 * QUESTION 7 INPUT: A string of text, a word OUTPUT: A string of text, the word
		 * capitalized
		 */

        System.out.print("Enter the word: ");
        String word = in.nextLine();
        System.out.println(word.toUpperCase());
    }

    private static void Question8() {
        /*
		 * QUESTION 8 INPUT: A string of text, a word with an odd number of letters
		 * OUTPUT: A string of text, the word with the middle character removed
		 */

        System.out.print("Enter the word: ");
        String word = in.nextLine();
        int middle = word.length() / 2;
        System.out.println(word.substring(0, middle) + word.substring(middle + 1));
    }
}
