package mastery;

import java.util.Random;

public class EvensAndOdds 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int[] numbers = new int[25];
		
		for(int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = rand.nextInt(100);
		}
		
		System.out.print("Evens: ");
        for(int num : numbers) 
        {
            if (num % 2 == 0) 
            {
                System.out.print(num + " ");
            }
        }
        
        System.out.print("Odds: ");
        for (int num : numbers) 
        {
            if (num % 2 != 0) 
            {
                System.out.print(num + " ");
            }
        }
		
        System.out.println();
        
	}

}
