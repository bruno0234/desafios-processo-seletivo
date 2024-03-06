/*
	This source code has two different solutions, namely isFibNum1() and
	isFibNum2() for the second challenge
*/

public class Challenge2 {
	public static void main(String[] args) {
		System.out.println("Using solution 1:\n");
		for (int i = -10; i < 11; i++) {
			System.out.println(
				"Is " + i + " a Fibonacci number? " + isFibNum1(i)
			);
		}
		System.out.println("\nUsing solution 2:\n");
		for (int i = -10; i < 11; i++) {
			System.out.println(
				"Is " + i + " a Fibonacci number? " + isFibNum2(i)
			);
		}
	}

	public static boolean isFibNum1(int num) {
		int a = 0;
		int b = 1;
		while (a < num) {
			b += a;
			a = b - a;
		}
		return a == num;
	}

	public static boolean isFibNum2(int num) {
		/*
			A number n is Fibonnaci if and only if (5 * n² + 4) or (5 * n² - 4)
			is a perfect square	
		*/
		return num >= 0 && (isPerfectSquare(5 * (Math.pow(num, 2)) + 4)
			|| isPerfectSquare(5 * (Math.pow(num, 2)) - 4));
	}

	public static boolean isPerfectSquare(double num) {
		int squareRoot = (int) Math.sqrt(num);
		return Math.pow(squareRoot, 2) == num;
	}
}
