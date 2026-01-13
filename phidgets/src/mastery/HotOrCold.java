package mastery;

import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class HotOrCold {

	public static void main(String[] args) throws Exception
	{

	      TemperatureSensor temperatureSensor = new TemperatureSensor();
	      DigitalOutput redLED = new DigitalOutput();
	      DigitalOutput greenLED = new DigitalOutput();
	      
	      redLED.setHubPort(1);
	      redLED.setIsHubPortDevice(true);
	      greenLED.setHubPort(4);
	      greenLED.setIsHubPortDevice(true);
	      
	      temperatureSensor.open(1000);
	      redLED.open(1000);
	      greenLED.open(1000);
	      
	      while (true) 
	      {
	            double temperature = temperatureSensor.getTemperature();

	            if (temperature >= 20 && temperature <= 24) 
	            {
	                greenLED.setState(true);
	                redLED.setState(false);
	                System.out.println("Temperature in range: " + temperature + " °C");
	            } else 
	            {
	                greenLED.setState(false);
	                redLED.setState(true);
	                System.out.println("Temperature out of range: " + temperature + " °C");
	            }
	          
	          Thread.sleep(150);
	      }
	  }
}
