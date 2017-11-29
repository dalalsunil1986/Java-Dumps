package oops;

public class Alpha {
	public void foo(String[] args) {
		System.out.print("Alpha:foo");
	}

	public void bar(String a) {
		System.out.print("Alpha:bar");
	}
}

public class Beta extends Alpha {
	public void foo(String a) {
		System.out.print("Beta:foo");
	}

	public void bar(String a) {
		System.out.print("Beta:bar");
	}

	public void main(String[] argv) {
		Alpha a = new Beta();
		Beta b = (Beta) a;
		a.foo("test");
		b.foo("test");
		a.bar("test");
		b.bar("test");
	}

}
