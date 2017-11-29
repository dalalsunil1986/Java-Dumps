package inner_classes;

public class Hexy {
	public static void main(String[] args) {
		Integer i = 42;
		String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
		System.out.println(s);
	}
}
/*
 * Answer: ->D is correct. This is a ternary nested in a ternary with a little
 * unboxing thrown in. Both of the ternary expressions are false. -> A, B, C, E,
 * and F are incorrect based on the above.
 */
