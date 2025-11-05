package skillbuilders;

import java.util.Scanner;

public class TimeConverter 
{
	public static void hoursToMinutes() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount of hours: ");
		
		input.close(); 
	}
	
	public static void daysToHours() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount of days: ");
		
		input.close(); 
	}
	
	public static void minutesToHours() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount of minutes: ");
		
		input.close(); 
	}
	
	public static void hoursToDays() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount of hours: ");
		
		input.close(); 
	}
	
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.Convert Hours to minutes");
		System.out.println("2.Convert Days to hours");
		System.out.println("3.Convert Minutes to hours");
		System.out.println("4.Convert Hours to days");
		System.out.print("Enter a number according to what time do you want to convert: ");
		int num = input.nextInt();
		
		if (num == 1) 
		{	
			hoursToMinutes();	
		} 
		else if (num == 2)
		{
			daysToHours();
		}
		else if (num == 3)
		{
			minutesToHours();
		}
		else if (num == 4)
		{
			hoursToDays();
		}
		else 
		{
			System.out.print("Invalid number, please enter a number between 1 and 4 ");
		}
		
		
		
		input.close(); 
		
		
	}

}
