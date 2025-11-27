package skillbuilders;

public class TestRectangle 
{

	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle();
		
		Rectangle.displayAreaFormula();
		
		System.out.println("Rectangle Area: " + r1.getArea());
		System.out.println("Rectangle Perimeter: " + r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(7, 6);
		
		System.out.println("Rectangle 2 Area: " + r2.getArea());
		System.out.println("Rectangle 2 Perimeter: " + r2.getPerimeter());
	}

}
