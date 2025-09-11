package skillbuilders;

import java.util.Scanner;

public class RectanglePerimeter 
{

	public static void main(String[] args) 
	{	
		// Declare Variables
		int width;
		int length;
		
		// Create scanner
		Scanner input = new Scanner(System.in); 
		
		//Get width
		System.out.print("Enter a width: ");
		width = input.nextInt(); 
		
		// Get Length 
		System.out.print("Enter a length: ");
		length = input.nextInt(); 
		
		// Show the inputs
		System.out.println("Your width is:" + width);
		System.out.println("Your length is:" + length);
		
		// Calculate perimeter
        int perimeter = 2 * (length + width);
        
        // Show result
        System.out.println("The total perimeter is: " + perimeter);
        
        input.close();
		
	}

}
