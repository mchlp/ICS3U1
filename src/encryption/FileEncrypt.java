package encryption;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileEncrypt {

	public static void main(String[] args) {

		String text = "hello world!";
		final int move = 3;
		final int minUpper = 65;
		final int maxUpper = 90;
		final int minLower = 97;
		final int maxLower = 122;

		File inFile = new File("src/encryption/in.txt");
		Scanner in = null;
		try {
			in = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		File outFile = new File("src/encryption/out.txt");
		PrintStream out = null;
		try {
			out = new PrintStream(outFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (in.hasNextLine()) {
			text = in.nextLine();
			System.out.println(text);
			int i = 0;
			while (i < text.length()) {
				char c = text.charAt(i);
				int newIndex;
				if (c >= minUpper && c <= maxUpper) {
					newIndex = ((int) c + move) >= maxUpper ? minUpper + ((int) c + move) - minUpper : (int) c + move;
				} else if (c >= minLower && c <= maxLower) {
					newIndex = ((int) c + move) >= maxLower ? minLower + ((int) c + move) - minLower : (int) c + move;
				} else {
					newIndex = c;
				}
				out.print((char) newIndex);
				i++;
			}
			out.println();
		}
		out.flush();
		out.close();
	}
}
