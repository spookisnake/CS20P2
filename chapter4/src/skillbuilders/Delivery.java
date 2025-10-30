package skillbuilders;

import java.util.Scanner;

public class Delivery 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// Ask for the length of the box
		System.out.print("Enter the Length of the package: ");
		int length = input.nextInt();
		
		// Check if the length is within accepted range
		if (length > 10) 
		{
			System.out.println("Rejected! length is over 10. Please restart the program.");
			input.close();
			return;
		} 
		else 
		{
			System.out.println("Accepted Length!");
		}
		
		// Ask for the width of the box
		System.out.print("Enter the width of the package: ");
		int width = input.nextInt();
		
		// Check if the Width is within accepted range
		if (width > 10) 
		{
			System.out.println("Rejected! width is over 10. Please restart the program.");
			input.close();
			return;
		} 
		else 
		{
			System.out.println("Accepted width!");
		}
		
		// Ask for the Height of the box
		System.out.print("Enter the Height of the package: ");
		int height = input.nextInt();
		
		// Check if the Height is within accepted range
		if (height > 10) 
		{
			System.out.println("Rejected! height is over 10. Please restart the program.");
			input.close();
			return;
		} 
		else 
		{
			System.out.println("Accepted height!");
		}
		
		System.out.println("Accepted the package!");
		
		input.close();
	}

}
