package exception_handling;

import java.io.IOException;

public class B extends A {
	public void process() throws IOException {
		super.process();
		System.out.print("B,");
		throw new IOException();
	}

	public static void main(String[] args) {
		try {
			new B().process();
		} catch (IOException e) {
			System.out.println("Exception");
		}
	}
}//classB
//Ans:
//Compilation fails because of an error in line 6.
