package skillbuilders;

public class Circle 
{
	private static final double PI = 3.14;
	private double radius;
	
	public Circle() //default constructor method 
	{
		radius = 1;
	}
	
	public Circle(double r) //Overload constructor Method 
	{
		radius = r;		
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public void setRadius(double r) 
	{
		radius = r;
	}
	
	public double area() 
	{
		double circArea = PI * radius * radius;
		
		return circArea;
	}
	
	public double circumference() 
	{
		double circ = 2 * PI * radius;
		
		return circ;
	}
	
	public static void displayAreaFormula() 
	{
		System.out.println("The formula for the area of "
				+ "a circle is a=Pi*r*r");
	}
	
	public String toString() 
	{
		return ("The radius is: " + radius);
	}
	
}
