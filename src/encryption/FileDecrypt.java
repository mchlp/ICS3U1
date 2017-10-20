package encryption;

public class FileDecrypt {

	public static void main(String[] args) {
		System.out.println((int) 'a');

		final String word = "lipps asvph";

		int min = 97;
		int max = 123;

		// TODO change for loop to while loop

		for (int i = 0; i <= 26; i++) {
			for (int j = 0; j < word.length(); j++) {
				char c = word.charAt(j);
				if (c != ' ') {
					int newIndex = ((int) c + i) >= max ? min + ((int) c + i) - max : (int) c + i;
					System.out.print((char) newIndex);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
