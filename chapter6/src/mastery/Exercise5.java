package mastery;

import java.util.Scanner;

public class Exercise5 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your amount of coins:");
		
		System.out.print("Quarters: ");
		double quarters = input.nextDouble();
		
		System.out.print("Dimes: ");
		double dimes = input.nextDouble();
		
		System.out.print("Nickels: ");
		double nickels = input.nextDouble();
		
		System.out.print("Pennies: ");
		double pennies = input.nextDouble();
		
		double totalAmount = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);
		
		System.out.println("Total: $" + totalAmount);
		
		input.close();
	}

}
