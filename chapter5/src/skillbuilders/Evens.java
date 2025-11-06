package skillbuilders;

public class Evens 
{
	 public static void displayEvenNumbers(int number) 
	    {
	        String evenNumbers;

	        switch (number) 
	        {
	            case 1: evenNumbers = "2"; break;
	            case 2: evenNumbers = "4"; break;
	            case 3: evenNumbers = "6"; break;
	            case 4: evenNumbers = "8"; break;
	            case 5: evenNumbers = "10"; break;
	            case 6: evenNumbers = "12"; break;
	            case 7: evenNumbers = "14"; break;
	            case 8: evenNumbers = "16"; break;
	            case 9: evenNumbers = "18"; break;
	            case 10: evenNumbers = "20"; break;
	            default: evenNumbers = "Number out of range"; break;
	        }
	        
	        System.out.println("" + evenNumbers);
	    }
	
	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 10; i++) 
        {
            displayEvenNumbers(i);
        }
		
	}

}
