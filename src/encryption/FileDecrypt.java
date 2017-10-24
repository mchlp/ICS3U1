package encryption;

/*
 * Michael Pu
 * File Encryption/Decryption Assignment - Part 2 - Decryption
 * ICS3U1
 * 2017/10/26
 * Mr. Radulovic 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDecrypt {

	/**
	 * 1. Reads a file named "encrypted_file.txt", 
	 * 2. Decrypts the text inside the file using a -4 letter shift, 
	 * 3. Outputs the decrypted text to the console
	 */

	public static void main(String[] args) {
		
		final String inputFile = "src/encryption/encrypted_file.txt"; //path to input file
		final int move = -4; //shift
		
		//limits for upper case letters
		final int minUpper = 'A';
		final int maxUpper = 'Z';
		
		//limits for lower case letters
		final int minLower = 'a';
		final int maxLower = 'z';
			
		//limits for numbers
		final int minNum = '0';
		final int maxNum = '9';
		
		//set up input file
		File inFile = new File(inputFile);
		Scanner in = null;
		try {
			in = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//read from input file
		String line;
		while (in.hasNextLine()) {
			//read next line in input file
			line = in.nextLine();
			//loop through all characters in that line
			int i = 0;
			while (i < line.length()) {
				//get each character in the line
				char c = line.charAt(i);
				int newChar; //ascii value for decrypted character
				
				//is the new ASCII value less than the lower limit for that character type ? 
				//YES - new ASCII value = upper limit - (lower limit - new ASCII value) + 1
				//NO - new ASCII value = new ASCII value
				
				if (c >= minUpper && c <= maxUpper) { //if character is an upper case letter
					newChar = ((int) c + move) < minUpper ? maxUpper - (minUpper - ((int) c + move)) + 1 : (int) c + move;
				} else if (c >= minLower && c <= maxLower) { //if character is a lower case letter
					newChar = ((int) c + move) < minLower ? maxLower - (minLower - ((int) c + move)) + 1 : (int) c + move;
				} else if (c >= minNum && c <= maxNum) { //if character is a number
					newChar = ((int) c + move) < minNum ? maxNum - (minNum - ((int) c + move)) + 1 : (int) c + move;
				} else {
					newChar = c;
				}
				System.out.print((char) newChar); //print the decrypted char to the console
				i++; //set counter to next character
			}
			System.out.println(); //print new line to console after reading one line from encrypted file
		}
		
		//housekeeping stuff
		in.close();
	}
}
