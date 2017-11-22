/*
 * Michael Pu
 * ICS3U1 - MoreExercises
 * ICS3U1 - November 2017
 * Mr. Radulovic
 */

package intro;

import java.util.Scanner;

public class MoreExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Question 1
        System.out.println("Question 1");
        System.out.print("Enter an integer to add up to: ");
        int n = in.nextInt();
        System.out.println(((n) * (n + 1)) / 2);

        //Question 2
        System.out.println("Question 2");
        System.out.print("Enter an integer to multiply up to: ");
        int n2 = in.nextInt();
        int product = 1;
        while (n2 > 1) {
            product *= n2;
            n2 -= 1;
        }
        System.out.println(product);

        //Question 3
        System.out.println("Question 3");
        int n3 = (int) (Math.random() * 100);
        int guess;
        int numGuess = 0;
        while (true) {
            numGuess += 1;
            System.out.print("Enter your guess: ");
            guess = in.nextInt();
            if (guess > n3) {
                System.out.println("Your guess was too large.");
            } else if (guess < n3) {
                System.out.println("Your guess was too small.");
            } else {
                System.out.println("You got it! It took " + numGuess + " guesses.");
                break;
            }
        }

        //Question 4
        in.nextLine();
        System.out.println("Question 4");
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        boolean doubloon = true;
        if (word.length() % 2 == 1) {
            doubloon = false;
        } else {
            for (int i = 0; i < word.length(); i++) {
                boolean foundMatch = false;
                for (int j = 0; j < word.length(); j++) {
                    if (j != i) {
                        if (word.charAt(j) == word.charAt(i)) {
                            foundMatch = true;
                            break;
                        }
                    }
                }
                if (!foundMatch) {
                    doubloon = false;
                    break;
                }
            }
        }

        if (doubloon) {
            System.out.println(word + " is a doubloon.");
        } else {
            System.out.println(word + " is not a doubloon.");
        }

        //Question 5
        System.out.println("Question 5");
        System.out.print("Enter the number of months that have passed: ");
        int months = in.nextInt();
        int prevRabbits = 1;
        int rabbits = 1;

        for (int i = 3; i <= months; i++) {
            int old = rabbits;
            rabbits += prevRabbits;
            prevRabbits = old;
        }

        System.out.println("The number of rabbits after " + months + " months is " + rabbits * 2);

        //Question 6
        System.out.println("Question 6");
        System.out.print("Enter the binary number: ");
        String binNum = in.nextLine();
        int total = 0;
        int pow = 0;

        for (int i = binNum.length() - 1; i >= 0; i--) {
            if (binNum.charAt(i) == '1') {
                total += Math.pow(2, pow);
            }
            pow++;
        }
        System.out.println(binNum + " in decimal format is " + total);

        //Question 7
        System.out.println("Question 7");
        System.out.print("Enter the list of numbers separated by a space between each number: ");
        String[] line = in.nextLine().split(" ");
        for (String string : line) {
            if (Integer.parseInt(string) % 2 == 1) {
                System.out.println(string);
            }
        }


        //Question 8
        System.out.println("Question 8");
        System.out.print("Enter the birthdays in the format 'MM DD', one per line, and -1 to end inputting: ");
        boolean foundMatch = false;
        boolean[][] arr = new boolean[13][32];
        System.out.println("There are duplicate birthdays on the following days: ");
        String output = "";
        while (true) {
            String input = in.nextLine();
            if (input.equals("-1")) {
                break;
            }
            String[] splitInput = input.split(" ");
            int month = Integer.parseInt(splitInput[0]);
            int day = Integer.parseInt(splitInput[1]);
            if (arr[month][day] == true) {
                foundMatch = true;
                output = output.concat("\n" + month + " " + day);
            } else {
                arr[month][day] = true;
            }
        }

        if (!foundMatch) {
            System.out.println("There were no duplicates found.");
        } else {
            System.out.println(output);
        }

        in.close();

    }
}

