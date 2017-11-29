package oops;

public class Sub extends Super {
	public static final char[] FOO = null;

	public Sub(int a) {
		super(a);
	}

	public Sub() {
		//super(a);
		super(5);
	}

}
/*
 * Change line 13 to :public Sub() { super(5); } Change line 13 to :public Sub()
 * { super(a); }
 */