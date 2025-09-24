package skillbuilders;

import java.util.Scanner;

public class GradeAvg 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int grade1, grade2, grade3, grade4, grade5;
		double average;
		
		//input windows
		System.out.print("Enter your grade 1: ");
		grade1 = input.nextInt();
		
		System.out.print("Enter your grade 2: ");
		grade2 = input.nextInt();
		
		System.out.print("Enter your grade 3: ");
		grade3 = input.nextInt();
		
		System.out.print("Enter your grade 4: ");
		grade4 = input.nextInt();
		
		System.out.print("Enter your grade 5: ");
		grade5 = input.nextInt();
		
		//do the grade average
		average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;
		
		//print the result
		System.out.println("Your average grade is: " + average);
		
		
		input.close();
			
	}

}
