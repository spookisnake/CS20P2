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
		System.out.println("The formula to calculate the area of"
				+ " a circle is A = PI * r * r");
	}
	
	public boolean equals(Object c) {
	    if (this == c) {
	        return true;
	    }
	    if (c == null || getClass() != c.getClass()) {
	        return false;
	    }

	    Circle other = (Circle) c;
	    return this.radius == other.radius;
	}
	
	public String toString() 
	{
		return ("The radius is: " + radius);
	}
	
}
