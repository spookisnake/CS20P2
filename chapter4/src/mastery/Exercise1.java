package mastery;

import java.util.Scanner;

public class Exercise1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
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

        double totalCost = copies * pricePerCopy;

        System.out.println("Price per copy: $" + pricePerCopy);
        System.out.println("Total cost: $" + totalCost);

        input.close();
    }
}
