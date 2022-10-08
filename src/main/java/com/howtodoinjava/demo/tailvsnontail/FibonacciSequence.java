package tailvsnontail;

public class FibonacciSequence {
	public static void main(String[] args) {
		print(8, 0, 1);
	}

	/***
	 * @author Chandresh Thakkar
	 * @param n->
	 *            fibonacci squence until n
	 * @param a->
	 *            first number in fibonacci squence
	 * @param b->
	 *            second number in fibonacci squence
	 */
	public static void print(int n, int a, int b) {
		if (n > 2) {
			if (a == 0) {
				System.out.print(a + " ");
				System.out.print(b + " ");
			}
			System.out.print((a + b) + " ");
			print(--n, b, a + b);
		} else {
			System.out.println("size must be >2");
		}
	}
}
