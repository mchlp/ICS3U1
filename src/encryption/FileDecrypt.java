/*
 * Michael Pu
 * ICS3U1 - FileDecrypt
 * November 2017
 */

package encryption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDecrypt {

	/*
	 * 1. Reads a file named "encrypted_file.txt",
	 * 2. Decrypts the text inside the file using a -4 letter shift, 
	 * 3. Outputs the decrypted text to the console
	 */

	public static void main(String[] args) {

		final String inputFile = "encrypted_file.txt"; // path to input file
		// final String inputFile = "src/encryption/encrypted_file.txt";
		final int move = -4; // shift

		// limits for upper case letters
		final int minUpper = 'A';
		final int maxUpper = 'Z';
		final int numUpper = maxUpper - minUpper + 1;
		final int addBeforeModUpper = numUpper;

		// limits for lower case letters
		final int minLower = 'a';
		final int maxLower = 'z';
		final int numLower = maxLower - minLower + 1;
		final int addBeforeModLower = numLower;

		// limits for numbers
		final int minNum = '0';
		final int maxNum = '9';
		final int numNum = maxNum - minNum + 1;
		final int addBeforeModNum = 30; // in case the shift is less than -10

		// set up input file
		File inFile = new File(inputFile);
		Scanner in = null;
		try {
			in = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// read from input file
		String line;
		while (in.hasNextLine()) {
			// read next line in input file
			line = in.nextLine();
			// loop through all characters in that line
			int i = 0;
			while (i < line.length()) {
				// get each character in the line
				char c = line.charAt(i);
				int newChar; // ascii value for decrypted character

				if (c >= minUpper && c <= maxUpper) { // if character is an upper case letter
					newChar = minUpper + ((int) c - minUpper + move + addBeforeModUpper) % numUpper;
				} else if (c >= minLower && c <= maxLower) { // if character is a lower case letter
					newChar = minLower + ((int) c - minLower + move + addBeforeModLower) % numLower;
				} else if (c >= minNum && c <= maxNum) { // if character is a number
					newChar = minNum + ((int) c - minNum + move + addBeforeModNum) % numNum;
				} else {
					newChar = c;
				}
				System.out.print((char) newChar); // print the decrypted char to the console
				i++; // set counter to next character
			}
			System.out.println(); // print new line to console after reading one line from encrypted file
		}

		// housekeeping stuff
		in.close();
	}
}
