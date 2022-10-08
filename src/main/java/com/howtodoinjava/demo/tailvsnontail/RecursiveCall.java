package tailvsnontail;

public class RecursiveCall {

	/***
	 * @author Chandresh Thakkar
	 * @return void
	 * @param n->
	 *            starts printing from n and prints until 1
	 */
	public static void printNNumbers(int n) {
		if (n == 0)
			return;
		else {
			System.out.print(n + " ");

			// Recursive Call
			printNNumbers(--n);
		}
	}

	public static void main(String[] args) {
		printNNumbers(10);
	}

}
