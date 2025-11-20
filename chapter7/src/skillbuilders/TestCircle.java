package skillbuilders;

public class TestCircle {
	
	public static void main(String[] args) 
	{
		Circle spot = new Circle();
		
		//System.out.println(spot);
		
		System.out.println("Circle radius:" + spot.getRadius());
		System.out.println("Circle area: " + spot.area());
		Circle.displayAreaFormula();
		
	}

}
