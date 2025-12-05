package mastery;

public class Piggybank 
{
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	
	public Piggybank() 
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	public void addPenny() 
	{
        pennies++;
    }

    public void addNickel() 
    {
        nickels++;
    }

    public void addDime() 
    {
        dimes++;
    }

    public void addQuarter() 
    {
        quarters++;
    }
	
}
