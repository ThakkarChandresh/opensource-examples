package tailvsnontail;

/***
 * 
 * @author Chandresh Thakkar
 *
 */
public class StackRepresentation {
	public static void main(String[] args) {
		sayHello();
	}

	static void sayHello() {
		System.out.println("Hello There!");
		callMyChild();
	}

	static void callMyChild() {
		System.out.println("Hello In Child!");
		printStackTrace();
	}

	// helper method to print the stack trace of current executing thread.
	static void printStackTrace() {
		System.out.println("\n\n----Stack Trace----");
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

		for (StackTraceElement element : stackTrace) {
			System.out.println(element);
		}
	}
}
