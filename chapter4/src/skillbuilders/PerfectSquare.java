package skillbuilders;

import java.util.Scanner;

public class PerfectSquare 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input an integer: ");
		double num = input.nextDouble();
		
		double sqrt = Math.sqrt(num);
		
		if (num % 1 != 0) 
		{
		    System.out.println("The number isn't a perfect square.");
		} 
		else 
		{
		    System.out.println("The number is a perfect square.");
		}
		
		
		input.close();

	}

}
