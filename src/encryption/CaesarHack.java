package encryption;

/*
 * Michael Pu
 * File Encryption/Decryption Assignment - Part 3 - Brute Force Attack
 * ICS3U1
 * 2017/10/26
 * Mr. Radulovic 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CaesarHack {
	/**
	 * 1. Reads a file named "secret_message.txt", 
	 * 2. Brute forces through all 25 possible decryptions
	 * 3. Outputs the original and all possibilities of decrypted text to the console
	 */

	public static void main(String[] args) {
		
		final String inputFile = "src/encryption/secret_message.txt"; //path to input file
		
		//limits for upper case letters
		final int minUpper = 'A';
		final int maxUpper = 'Z';
		
		//limits for lower case letters
		final int minLower = 'a';
		final int maxLower = 'z';
			
		//limits for numbers
		final int minNum = '0';
		final int maxNum = '9';
		
		//string for storing contents for input file
		String allText = "";
		
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
			//add next line to a string of all text from the input file
			allText = allText.concat(line + "\n");
		}
		
		//print out original message
		System.out.println("Original Message");
		System.out.println("-");
		System.out.print(allText);
		System.out.println("--------------------------");
		
		int move = -1;
		while (move > -26) {
			System.out.println("Decrypting Using Encryption Key of " + -move);
			System.out.println("-");
			//loop through all characters in the contents of the input file
			int i = 0;
			while (i < allText.length()) {
				//get each character
				char c = allText.charAt(i);
				int newChar; //ascii value for decrypted character
				
				//is the new ASCII value less than the lower limit for that character type ? 
				//YES - new ASCII value = upper limit - (lower limit - new ASCII value) + 1
				//NO - new ASCII value = new ASCII value
				
				if (c >= minUpper && c <= maxUpper) { //if character is an upper case letter
					newChar = minUpper + ((int) c - minUpper + move + 26) % 26;
				} else if (c >= minLower && c <= maxLower) { //if character is a lower case letter
					newChar = minLower + ((int) c - minLower + move + 26) % 26;
				} else if (c >= minNum && c <= maxNum) { //if character is a number
					newChar = minNum + ((int) c - minNum + move + 30) % 10;
				} else {
					newChar = c;
				}
				System.out.print((char) newChar); //print the decrypted char to the console
				i++; //set counter to next character
			}
			//move onto next possible encryption key
			move--;
			System.out.println("--------------------------");
		}
		
		//housekeeping stuff
		in.close();
	}
}
