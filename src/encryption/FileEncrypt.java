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
				if ((c >= minUpper && c <= maxUpper) || (c >= minLower && c <= maxLower)) {
					int newIndex = ((int) c + move) >= maxLower || ((int) c + move) >= maxUpper
							? minLower + ((int) c + move) - maxLower
							: (int) c + move;
					// System.out.print((char) newIndex);
					out.print((char) newIndex);
				} else {
					// System.out.println(" ");
					out.print(c);
				}
				i++;
			}
			out.println();
		}
		out.flush();
		out.close();
	}
}
