package tailvsnontail;

public class FactorialUsingNonTail {
	public static void main(String[] args) {
		System.out.println(factorial(6)); // 720
	}

	/***
	 * @author Chandresh Thakkar
	 * @param n->
	 *            number we want to find factorial of
	 * @return int
	 */
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(--n);
		}
	}
}
