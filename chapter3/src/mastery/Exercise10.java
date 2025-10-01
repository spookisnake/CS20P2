package mastery;

import java.util.Scanner;

public class Exercise10 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int birthYear;
		int birthMonth;
		int birthDay;
		
		int currentYear;
		int currentMonth;
		int currentDay;
		
		//ask user for the year, month, and day of their birthdate
		System.out.println("Enter your Birthdate");
		
		System.out.print("Enter the Year: ");
		birthYear = input.nextInt();
		
		System.out.print("Enter the Month: ");
		birthMonth = input.nextInt();
		
		System.out.print("Enter the Day: ");
		birthDay = input.nextInt();
		
		// ask user to input the year, month, and day of current date
		System.out.println("Enter the current date");
		
		System.out.print("Enter the Year: ");
		currentYear = input.nextInt();
		
		System.out.print("Enter the Month: ");
		currentMonth = input.nextInt();
		
		System.out.print("Enter the Day: ");
		currentDay = input.nextInt();
		
		//calculate how many days the years have apart
		int birthTotalDays = (birthYear * 365) + (birthMonth * 30) + birthDay;
        int currentTotalDays = (currentYear * 365) + (currentMonth * 30) + currentDay;
        
        //calculate an approximate of the days the the user is alive
        int daysAlive = currentTotalDays - birthTotalDays;
        
        int hoursSlept = daysAlive * 8;
        
        System.out.println("You have been alive for " + daysAlive + " days.");
        System.out.println("You have slept " + hoursSlept + " hours.");
		
		input.close();
	}

}
