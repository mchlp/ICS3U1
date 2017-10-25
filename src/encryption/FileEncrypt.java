package encryption;

/*
 * Michael Pu
 * File Encryption/Decryption Assignment - Part 1 - Encryption
 * ICS3U1
 * 2017/10/26
 * Mr. Radulovic 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileEncrypt {
	
	/**
	 * 1. Reads a file named "test.txt", 
	 * 2. Encrypts the text inside the file using a 3 letter shift, 
	 * 3. Outputs the encrypted text to text_encrypted.txt
	 */

	public static void main(String[] args) {
		
		final String inputFile = "src/encryption/test.txt"; //path to input file
		final String outputFile = "src/encryption/test_encrypted.txt"; //path to output file
		final int move = 3; //shift
		
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

		//set up output file
		File outFile = new File(outputFile);
		PrintStream out = null;
		try {
			out = new PrintStream(outFile);
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
				int newChar; //ascii value for encrypted character
				
				if (c >= minUpper && c <= maxUpper) { //if character is an upper case letter
					newChar = minUpper + ((int) c - minUpper + move + 26) % 26;
				} else if (c >= minLower && c <= maxLower) { //if character is a lower case letter
					newChar = minLower + ((int) c - minLower + move + 26) % 26;
				} else if (c >= minNum && c <= maxNum) { //if character is a number
					newChar = minNum + ((int) c - minNum + move + 30) % 10;
				} else {
					newChar = c;
				}
				out.print((char) newChar); //print the encrypted char to the file
				i++; //set counter to next character
			}
			out.println(); //add new line to encrypted file after reading one line from original file
		}
		
		//housekeeping stuff
		in.close();
		out.flush();
		out.close();
	}
}
