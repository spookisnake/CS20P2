package skillbuilders;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{	
		//Declare Variables
		int number;
		int ones;
		int tens;
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Ask for two digit number
		System.out.print("Enter a two digit number: ");
		number = input.nextInt();
		
		ones = number % 10;
		tens = number / 10;
		
		System.out.println("Tens Place: " + tens); 
		System.out.println("Ones Place: " + ones);
		
		input.close();
		
		
	}

}
