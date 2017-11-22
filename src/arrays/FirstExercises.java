/*
 * Michael Pu
 * ICS3U1 - FirstExercises
 * ICS3U1 - November 2017
 * Mr. Radulovic
 */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstExercises {

    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        question1();
        question2();
        question3();
    }

    private static void question1() {
        System.out.println("Exercise 1");
        double[] decimalList = new double[10];
        for (int i = 0; i < decimalList.length; i++) {
            decimalList[i] = in.nextDouble();
        }
        System.out.println(Arrays.toString(decimalList));
    }

    private static void question2() {
        System.out.println("Exercise 2");
        String[] stringList = new String[10];
        for (int i = 0; i < stringList.length; i++) {
            stringList[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(stringList));
    }

    private static void question3() {
        System.out.println("Exercise 3");
        int[] intList = new int[100];
        int sum = 0;
        int nn = 0;
        for (int i = 0; i < intList.length; i++) {
            int num = in.nextInt();
            if (num < 0) {
                break;
            } else {
                intList[i] = num;
                sum += num;
                nn++;
            }
        }
        System.out.println(Arrays.toString(intList));
        System.out.println("Average of Numbers Entered: " + sum / (double) nn);
    }
}
