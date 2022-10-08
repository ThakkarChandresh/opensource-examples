package tailvsnontail;

public class FactorialUsingTail {
	
	public static void main(String[] args) {
		System.out.println(factorial(5, 1));
	}
	
	/***
	 * @author Chandresh Thakkar
	 * @param currentNumber
	 * @param previousMultiplication
	 * @return int
	 */
	static int factorial(int currentNumber, int previousMultiplication) {
		if (currentNumber == 0)
			return previousMultiplication;
		else
			return factorial(currentNumber - 1, currentNumber * previousMultiplication);
	}
}
