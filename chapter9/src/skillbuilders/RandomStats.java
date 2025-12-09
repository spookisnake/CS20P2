package skillbuilders;

public class RandomStats 
{

	public static void main(String[] args) 
	{
		//Declare an that one dimensional
		int[] outcomes = new int[10];
		int outcome;
		
		//storing values in the array 
		for(int i = 0; i < 100; i++) 
		{
			outcome = (int)(10*Math.random());
			
			outcomes[outcome] += 1;
		}
		
		//Display what is in the array
		for(int i = 0; i < 100; i++) 
		{
			System.out.println(outcomes[i]);
			System.out.println(" ");
			
		}
	}

}
