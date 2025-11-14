package skillbuilders;

import java.util.Scanner;

public class Exponentiation 
{
	public static double powerOf(double base, double exponent) 
	{
        return Math.pow(base, exponent);
    }
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your base number: ");
		double base = input.nextDouble();
		
		System.out.print("Enter your exponent number: ");
		double exponent = input.nextDouble();
		
		double result = powerOf(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
		
		input.close();
	}

}
