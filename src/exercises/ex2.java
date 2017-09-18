package exercises;

import java.util.Scanner;

public class ex2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (true) {
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
