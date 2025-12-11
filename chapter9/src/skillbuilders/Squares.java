package skillbuilders;

import java.util.Scanner;

public class Squares 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		int[] squares = new int[5];
		
		for(int i = 0; i < squares.length; i++) 
		{
			squares[i] = i * i;
		}
		
		System.out.println("Squares array values: ");
		for(int i = 0; i < squares.length; i++) 
		{
			System.out.println("Index " + i + ": " + squares[i]);
		}
		
	}

}
