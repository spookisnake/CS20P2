package skillbuilders;

public class TestCircle {
	
	public static void main(String[] args) 
	{
		Circle spot = new Circle();
		
		System.out.println(spot);
		
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle area: " + spot.area());
		Circle.displayAreaFormula();
		
		Circle spot2 = new Circle(6);
		Circle spot3 = new Circle(7);
		
		System.out.println(spot2);
		System.out.println(spot3);
		
	}

}
