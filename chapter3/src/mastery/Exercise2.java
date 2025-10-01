package mastery;

import java.util.Scanner;

public class Exercise2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// Constants
        final double LABOR_COST = 0.75;
        final double RENT_COST = 1.00;
        final double MATERIAL_COST_FACTOR = 0.05;

        // Prompt user for pizza diameter
        System.out.print("Enter the diameter of the pizza in inches: ");
        double diameter = input.nextDouble();

        // Calculate material cost
        double materialCost = MATERIAL_COST_FACTOR * diameter * diameter;

        // Calculate total cost
        double totalCost = LABOR_COST + RENT_COST + materialCost;

        // Display result
        System.out.println("The cost of making a " + diameter + " inch pizza is $" + totalCost);

		input.close();
		
	}

}
