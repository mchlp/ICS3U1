/*
 * Michael Pu
 * ICS3U1 - FileInput
 * November 2017
 */

package intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./res/random1.txt");
        Scanner in = new Scanner(file);
        int numNum = 0;
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;

        while (in.hasNextInt()) {
            int curNum = in.nextInt();
            numNum++;
            total += curNum;
            if (curNum > max) {
                max = curNum;
            }
            if (curNum < min) {
                min = curNum;
            }
        }

        System.out.println("Total number of integers read: " + numNum);
        System.out.println("Average of all numbers: " + (double) total / numNum);
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
        in.close();
    }

}
