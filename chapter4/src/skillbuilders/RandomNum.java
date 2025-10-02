package skillbuilders;

import java.util.Random;
import java.util.Scanner;

public class RandomNum 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		//ask user for Numbers
		System.out.print("Enter the minimun value: ");
		int min = input.nextInt();
		
		System.out.print("Enter the maximum value: ");
		int max = input.nextInt();
		
		//if the minimum number is greater than the maximum the display an error
		if (min > max) 
		{	
			System.out.println("Error: Minimun value cannot be greater than the maximum value");
			input.close();
			return;
		}
		
		// Generate the random number.
		int randomNumber = rand.nextInt((max - min)+ 1) + min;
		
		// Display result
        System.out.println("Random number between " + min + " and " + max + " is: " + randomNumber);
		
		input.close();
		
	}

}
