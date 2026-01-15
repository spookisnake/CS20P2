package skillbuilders;
//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEvents {

	public static void main(String[] args) throws Exception {
   
    	//Create
    	TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
      //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
    	//Temperature Data Event
    	temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
        	public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
            	System.out.println("Temperature: " + e.getTemperature() + "°C");
        	}
    	});

    	//Temperature Attach Event
    	temperatureSensor.addAttachListener(new AttachListener() {
        	public void onAttach(AttachEvent e) {
            	System.out.println("Attach Temperature Sensor");
        	}
    	});

    	//Temperature Detach Event
    	temperatureSensor.addDetachListener(new DetachListener() {
        	public void onDetach(DetachEvent e) {
            	System.out.println("Detach Temperature Sensor");
        	}
    	});

    	//LED Attach Event
    	redLED.addAttachListener(new AttachListener() {
        	public void onAttach(AttachEvent e) {
            	System.out.println("Attach LED");
        	}
    	});

    	//LED Detach Event
    	redLED.addDetachListener(new DetachListener() {
        	public void onDetach(DetachEvent e) {
            	System.out.println("Detach LED");
        	}
    	});

    	//Button Attach Event
    	redButton.addAttachListener(new AttachListener() {
        	public void onAttach(AttachEvent e) {
            	System.out.println("Attach Button");
        	}
    	});

    	//Button Detach Event
    	redButton.addDetachListener(new DetachListener() {
        	public void onDetach(DetachEvent e) {
        		System.out.println("Detach Button");
       		}
    	});

    	//Open
    	temperatureSensor.open(1000);
    	redLED.open(1000);
    	redButton.open(1000);

    	//Keep program running
    	while (true) {
    		Thread.sleep(150);
    	}
	}
}

/*//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEvents {

  public static void main(String[] args) throws Exception {
     
       //Create
      TemperatureSensor temperatureSensor = new TemperatureSensor();

      //Data Event | Event code runs when data from sensor changes. 
      temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
          public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
              //Print temperature
              System.out.println("Temperature: " + e.getTemperature() + "°C");
          }
      });

      //Attach Event | Attach Events run when a Phidget is connected to the Object
      temperatureSensor.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Attach!");
          }
      });

      //Detach Event | Detach Events run when a Phidget is disconnected from the Object
      temperatureSensor.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("Detach!");
          }
      });

      //Open
      temperatureSensor.open(1000);

      //Keep program running
      while (true) {
          Thread.sleep(150);
      }
  }
}*/
