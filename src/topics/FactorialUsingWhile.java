package topics;

public class FactorialUsingWhile {
	public static void main(String arg[])
    {
        int factorial = 1;
        int number = 6;
        
        int i = 1;
        while(i <= number)
        {
            factorial *= i;
            i++;
        }
        
        System.out.println("Factorial of number " + number + " is " + factorial);
    
    }
}
