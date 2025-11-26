package skillbuilders;

public class Rectangle 
{
	private double length;
	private double width; 
	
	public Rectangle() //Default constructor method
	{
		length = 1.0;
		width = 1.0; 
	}
	
	public Rectangle(double l, double w) // overload constructor method 
	{
		length = l;
		width = w; 
	}
	
	public void setLength(double l) 
	{
		length = l;
	}
	
	public void setWidth(double w) 
	{
		width = w;
	}
	
	public double getLength() 
	{
		return length;
	}
	
	public double getWidth() 
	{
		return width;
	}
	
	public double getArea() 
	{
		return length * width;
	}
	
	public double getPerimeter() 
	{
		return 2 * (length + width);
	}
	
}
