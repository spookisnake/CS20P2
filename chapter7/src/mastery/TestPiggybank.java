package mastery;

import java.util.Scanner;

public class TestPiggybank 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Piggybank bnk = new Piggybank();
		
		int choice;
		
		do 
		{
            System.out.println("1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit");

            System.out.print("Enter you choice: ");
            choice = input.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.printf("Total in bank: $%.2f\n", bnk.getTotal());
                    break;

                case 2:
                    bnk.addPenny();
                    break;

                case 3:
                    bnk.addNickel();
                    break;

                case 4:
                    bnk.addDime();
                    break;

                case 5:
                    bnk.addQuarter();
                    break;

                case 6:
                    System.out.print("Enter amount to remove: $");
                    double amount = input.nextDouble();
                    bnk.removeMoney(amount);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println();

        } while (choice != 0);
		
		input.close();
	}

}
