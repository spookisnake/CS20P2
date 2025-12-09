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
	
    public void removeMoney(double amount) 
    {
    	double total = getTotal();
    	
    	if (amount > total ) 
    	{
    		System.out.println("Not enough money in Piggybank.");
    		return;
    	}
    	
    	double newTotal = total - amount;
    	
    	pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;

        while (newTotal >= 0.25) { quarters++; newTotal -= 0.25; }
        while (newTotal >= 0.10) { dimes++; newTotal -= 0.10; }
        while (newTotal >= 0.05) { nickels++; newTotal -= 0.05; }
        while (newTotal >= 0.01) { pennies++; newTotal -= 0.01; }
    	
    }
    
    public double getTotal() 
    {
    	return pennies * 0.01 +
    			nickels * 0.05 +
    			dimes * 0.10 +
    			quarters * 0.25;
    }
}
