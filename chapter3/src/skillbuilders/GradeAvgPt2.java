package skillbuilders;

import java.util.Scanner;

public class GradeAvgPt2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int grade;
		int sum = 0;
		double average;
		
		//shortened the input part
		for (int i = 1; i <= 5; i++) 
		{
			System.out.print("Enter your grade " + i + ": ");
			grade = input.nextInt();
			
			sum += grade;
		}
		
		//changed the way the code calculates the grades
		average = sum / 5.0;
		
		//print the result
		System.out.println("Your average grade is: " + average);
		
		
		input.close();
			
	}
}
