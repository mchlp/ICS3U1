/*
 * Michael Pu
 * ICS3U1 - LoopExercises
 * ICS3U1 - Mr. Radulovic
 * November 27, 2017
 */

package intro;

import java.util.Scanner;

public class LoopExercises {

    private static Scanner in;

    public static void main(String[] args) {

        in = new Scanner(System.in);

        Question1();
        Question2();
        Question3();
        Question4();
        Question5();
        Question6();
    }

    private static void Question1() {
        /*-
		 * QUESTION 1
		 * INPUT: integers, start and end
		 * OUTPUT: integers, from start to end
		 */

        System.out.print("Enter Start: ");
        int start = in.nextInt();
        System.out.print("Enter End: ");
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
        in.nextLine();
    }

    private static void Question2() {
        /*-
		 * QUESTION 2
		 * INPUT: string, a word
		 * OUTPUT: strings, the word as many times as there are letters in the word
		 */

        System.out.print("Enter a word: ");
        String word = in.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
        }
    }

    private static void Question3() {
        /*-
		 * QUESTION 3
		 * INPUT: strings, two words
		 * OUTPUT: string, two words plus dots so that the length is 30
		 */

        System.out.print("Enter the first word: ");
        String word1 = in.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = in.nextLine();

        System.out.print(word1);
        for (int i = 0; i < (30 - word1.length() - word2.length()); i++) {
            System.out.print(".");
        }
        System.out.println(word2);
    }

    private static void Question4() {
        /*-
		 * QUESTION 4
		 * INPUT: a positive integer, a number N
		 * OUTPUT: an integer, the sum of the first N natural numbers
		 */

        System.out.print("Enter N: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }

    private static void Question5() {
        /*-
		 * QUESTION 5
		 * INPUT: a positive integer, a number N
		 * OUTPUT: a double, the sum of the reciprocals of all numbers from 1 to N
		 */

        System.out.print("Enter N: ");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        System.out.println("The sum is: " + sum);
    }

    private static void Question6() {
        /*-
		 * QUESTION 6
		 * INPUT: integer, the number of queries N; integers, the queries 
		 * OUTPUT: a double, the sum of the reciprocals of all numbers from 1 to N
		 */

        System.out.print("Enter the number of queries: ");
        int n = in.nextInt();
        int x = 0;
        int x2 = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            x += num;
            x2 += num * num;
        }
        System.out.println("The standard deviation is " + Math.sqrt(((double) x2 / n) - Math.pow(((double) x / n), 2)));
    }
}
