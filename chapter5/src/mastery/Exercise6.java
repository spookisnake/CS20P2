package mastery;

import java.util.Scanner;

public class Exercise6 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Ask user for a positive integer
		System.out.println("Enter a positive integer: ");
		int num = input.nextInt();
		
		
		//Sum all digits together 
		int sum = 0;
        int temp = num;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("The sum of the digits is: " + sum);
		
		input.close();
	}

}
