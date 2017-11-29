package garbage_collections;

public class GC {
	private Object o;

	private void doSomethingElse(Object obj) {
		o = obj;
	}

	public void doSomething() {
		Object o = new Object();
		doSomethingElse(o);
		o = new Object();
		doSomethingElse(null);
		o = null;
	}

}
/*
 * When the doSomething method is called, after which line does the Object
 * created in line 5 become available for garbage collection? A. Line 5 B. Line
 * 6 C. Line 7 D. Line 14 E. Line 9 F. Line 10 Answer: D
 */