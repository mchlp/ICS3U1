package encryption;

public class FileEncrypt {

	public static void main(String[] args) {

		final String text = "hello world!";
		final int move = 5;
		int min = 97;
		int max = 123;

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c != ' ') {
				int newIndex = ((int) c + move) >= max ? min + ((int) c + move) - max : (int) c + move;
				System.out.print((char) newIndex);
			} else {
				System.out.print(" ");
			}
		}
	}
}
