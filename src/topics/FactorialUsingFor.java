package topics;

public class FactorialUsingFor {
	public static void main(String arg[])
    {
        int factorial = 1;
        int number = 6;
        
        for(int i = 1; i <= number; i++)
        {
            factorial *= i;
        }
        
        System.out.println("Factorial of number " + number + " is " + factorial);
    
    }
}
