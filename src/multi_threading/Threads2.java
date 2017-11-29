package multi_threading;

public class Threads2 implements Runnable {

	public void run() {
		System.out.println("run.");
		throw new RuntimeException("Problem");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Threads2());
		t.start();
		System.out.println("End of method.");
	}
}//class
/*
 * Which two can be results? (Choose two.) A. java.lang.RuntimeException:
 * Problem B. run. java.lang.RuntimeException: Problem C. End of method.
 * java.lang.RuntimeException: Problem D. End of method. run.
 * java.lang.RuntimeException: Problem E. run. java.lang.RuntimeException:
 * Problem End of method. Answer: D, E
 */