package mastery;

public class Exercise1 
{
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	
	public Exercise1() 
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	public void addPennies(int amount) 
	{
		pennies += amount;
	}
	
	public void addNickels(int amount) 
	{
		nickels += amount;
	}
	
	public void addDimes(int amount) 
	{
		dimes += amount;
	}
	
	public void addQuarters(int amount) 
	{
		quarters += amount;
	}
	
	
}
