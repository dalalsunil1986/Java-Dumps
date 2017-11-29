package operators;

public class Example {
	public static void main(String[] args) {
		Short s = 15;
		Boolean b;
		// insert code here
	}
}
/*
 * Answer is:::: Which, inserted independently at line 5, will compile? (Choose
 * all that apply.) A. b = (Number instanceof s); B. b = (s instanceof Short);
 * C. b = s.instanceof(Short); D. b = (s instanceof Number); E. b =
 * s.instanceof(Object); F. b = (s instanceof String); Answer: -> B and D
 * correctly use boxing and instanceof together. -> A is incorrect because the
 * operands are reversed. C and E use incorrect instance of syntax. F is wrong
 * because Short isn't in the same inheritance tree as String.
 */