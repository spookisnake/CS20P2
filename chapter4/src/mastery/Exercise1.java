package mastery;

import java.util.Scanner;

public class Exercise1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Ask the user how many copies they're going to print
		System.out.print("Enter the number of copies to be printed: ");
		int copies = input.nextInt();
		
		double pricePerCopy;
		
        if (copies <= 99) 
        {
            pricePerCopy = 0.30;
        } 
        else if (copies <= 499) 
        {
            pricePerCopy = 0.28;
        } 
        else if (copies <= 749) 
        {
            pricePerCopy = 0.27;
        } 
        else if (copies <= 1000) 
        {
            pricePerCopy = 0.26;
        } 
        else 
        {
            pricePerCopy = 0.25;
        }
        
        //Calculate the cost
        double totalCost = copies * pricePerCopy;
        
        //Print out both the Price per copy and the total cost
        System.out.println("Price per copy: $" + pricePerCopy);
        System.out.println("Total cost: $" + totalCost);

        input.close();
    }
}
