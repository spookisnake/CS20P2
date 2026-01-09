package mastery;

import com.phidget22.*;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class Thermostat {

	public static void main(String[] args) throws Exception
	{
		TemperatureSensor temperatureSensor = new TemperatureSensor();
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalOutput greenLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalInput redButton = new DigitalInput(); 
	    
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	    
	    greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
	    
	    temperatureSensor.open(1000);
	    redLED.open(1000);
	    greenLED.open(1000);
	    redButton.open(1000);
	    greenButton.open(1000);
	    
	    int setTemperature = 21;

        long lastPrintTime = 0;

        while (true) 
        {

            double currentTemperature = temperatureSensor.getTemperature();

            if (greenButton.getState()) 
            {
                setTemperature++;
                Thread.sleep(300);
            }

            if (redButton.getState()) 
            {
                setTemperature--;
                Thread.sleep(300);
            }

            if (Math.abs(currentTemperature - setTemperature) <= 2) 
            {
                greenLED.setState(true);
                redLED.setState(false);
            } else 
            {
                greenLED.setState(false);
                redLED.setState(true);
            }

            if (System.currentTimeMillis() - lastPrintTime >= 10000) 
            {
                System.out.println("Current Temperature: " 
                    + currentTemperature + " °C");
                System.out.println("Set Temperature: " 
                    + setTemperature + " °C");
                System.out.println("---------------------------");
                lastPrintTime = System.currentTimeMillis();
            }

            Thread.sleep(100);
        }
	}
}
