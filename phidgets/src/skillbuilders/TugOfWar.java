package skillbuilders;

import com.phidget22.*;

public class TugOfWar 
{
	public static void main(String[] args) throws Exception 
	{
		DigitalInput redButton = new DigitalInput();
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalInput greenButton = new DigitalInput();
	    DigitalOutput greenLED = new DigitalOutput();
		
	    redButton.setHubPort(0);
	    redButton.setIsHubPortDevice(true);
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenButton.setHubPort(5);
	    greenButton.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	    
	    redButton.open(1000);
	    redLED.open(1000);
	    greenButton.open(1000);
	    greenLED.open(1000);
	    
	    boolean lastRedState = false;
	    boolean lastGreenState = false;
	    
	    int position = 0;     
        int WIN_LIMIT = 5;
        
        System.out.println("Start!");
        
        while (true) {

            boolean redState = redButton.getState();
            boolean greenState = greenButton.getState();

            // Red button press → pull right
            if (redState && !lastRedState) {
                position++;
                System.out.println("Red pulls! Position: " + position);
            }

            // Green button press → pull left
            if (greenState && !lastGreenState) {
                position--;
                System.out.println("Green pulls! Position: " + position);
            }

            // Show who is winning
            redLED.setState(position > 0);
            greenLED.setState(position < 0);

            // Win conditions
            if (position >= WIN_LIMIT) {
                System.out.println("RED TEAM WINS!");
                redLED.setState(true);
                Thread.sleep(1000);
                redLED.setState(false);
                Thread.sleep(1000);
                
                redLED.setState(true);
                Thread.sleep(1000);
                redLED.setState(false);
                Thread.sleep(1000);
                
                redLED.setState(true);
                Thread.sleep(1000);
                redLED.setState(false);
                Thread.sleep(1000);
                
                redLED.setState(true);
                Thread.sleep(1000);
                redLED.setState(false);
                Thread.sleep(1000);
                
                redLED.setState(true);
                Thread.sleep(1000);
                redLED.setState(false);
                Thread.sleep(1000);
                break;
            }

            if (position <= -WIN_LIMIT) {
                System.out.println("GREEN TEAM WINS!");
                greenLED.setState(true);
                Thread.sleep(1000);
                greenLED.setState(false);
                Thread.sleep(1000);
                
                greenLED.setState(true);
                Thread.sleep(1000);
                greenLED.setState(false);
                Thread.sleep(1000);
                
                greenLED.setState(true);
                Thread.sleep(1000);
                greenLED.setState(false);
                Thread.sleep(1000);
                
                greenLED.setState(true);
                Thread.sleep(1000);
                greenLED.setState(false);
                Thread.sleep(1000);
                
                greenLED.setState(true);
                Thread.sleep(1000);
                greenLED.setState(false);
                Thread.sleep(1000);
                break;
            }

            lastRedState = redState;
            lastGreenState = greenState;

            Thread.sleep(150);
        
        }
	}

}
