package skillbuilders;

//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness 
{
  //Handle Exceptions 
  public static void main(String[] args) throws Exception
  {
      //Create 
      DigitalOutput redLED = new DigitalOutput();

      //Address 
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);

      //Open 
      redLED.open(1000);

      //slowly increase brightness
      for(double duty = 0.0; duty <= 1.0; duty += 0.05) {
    	  redLED.setDutyCycle(duty);
    	  Thread.sleep(100);
      }
      
      //slowly decrease brightness
      for(double duty = 1.0; duty >= 0.0; duty -= 0.05) {
    	  redLED.setDutyCycle(duty);
    	  Thread.sleep(100);
      }
      
      redLED.setDutyCycle(0.0);
  }
}
