package garbage_collections;

import java.util.ArrayList;

public class Numbers {
	public void genNumbers() {
		ArrayList numbers = new ArrayList();
		for (int i = 0; i < 10; i++) {
			int value = i * ((int) Math.random());
			Integer intObj = new Integer(value);
			numbers.add(intObj);
		}
		System.out.println(numbers);
	}
}// class
/*
 * Which line of code marks the earliest point that an object referenced by
 * intObj becomes a candidate for garbage collection? A. Line 16 B. Line 17 C.
 * Line 18 D. Line 19 E. The object is NOT a candidate for garbage collection.
 * Answer: D
 */
