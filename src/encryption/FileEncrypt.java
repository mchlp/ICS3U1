package encryption;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileEncrypt {

	public static void main(String[] args) {

		String text = "hello world!";
		final int move = 3;
		final int min = 97;
		final int max = 123;

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
			for (int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				if (c != ' ') {
					int newIndex = ((int) c + move) >= max ? min + ((int) c + move) - max : (int) c + move;
					// System.out.print((char) newIndex);
					out.append((char) newIndex);
				} else {
					// System.out.println(" ");
					out.append(" ");
				}
			}
		}
		out.close();
		System.out.println("Test");
	}
}
