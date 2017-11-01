package methods;

public class BealConjecture {

	public static void main(String[] args) {
		System.out.println(commonPrimeFactor(13, 39, 26));
	}

	public static int smallestNumber(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}

	public static int largestNumber(int a, int b, int c) {
		return Math.max(a, (Math.max(b, c)));
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return the common prime factor of a, b, c or -1 if no common prime factor is
	 *         found
	 */
	public static int commonPrimeFactor(int a, int b, int c) {
		int smallest = smallestNumber(a, b, c);
		int largest = largestNumber(a, b, c);
		int medium = (a + b + c) - smallest - largest;
		for (int i = 2; i <= smallest; i++) {
			if (smallest % i == 0) {
				if (medium % i == 0) {
					if (largest % i == 0) {
						return i;
					}
				}
			}
		}
		return 0;
	}
}
