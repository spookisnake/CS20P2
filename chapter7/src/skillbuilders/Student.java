package skillbuilders;

public class Student 
{
	private String firstName;
	private String lastName;
	private String address;
	private int stuId;
	
	public Student() //Default Constructor Method
	{
		firstName = "Unknown";
		lastName = "Unknown";
		address = "Unknown";
		stuId = 00000;
	}
	
	public Student(String f, String l, String ad, int id) //Overload Constructor method
	{
		firstName = f;
		lastName = l;
		address = ad;
		stuId = id;	
		
	}
	
	//Accessor Methods
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String f) 
	{
		firstName = f;	
	}
	
	public String toString()
	{
		return("First Name: " + firstName
				+ "\n Last Name: " + lastName
				+ "\n Address: " + address
				+ "\n Student ID: " + stuId);
		
	}
	
}
