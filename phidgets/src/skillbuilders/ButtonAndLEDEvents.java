package skillbuilders;

//Add Phidgets Library
import com.phidget22.*;

public class ButtonAndLEDEvents {
	
    static int redCount = 0;
    static int greenCount = 0;
    
    static boolean gameOver = false;
    
    //static int totalPresses = 0;
    
    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create
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

        // Red Button Event
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (!gameOver && e.getState()) {
                    redCount++;
                    System.out.println("Red presses: " + redCount);

                    if (redCount >= 10) {
                        gameOver = true;
                        System.out.println("RED PLAYER WINS!");
                        flashLED(redLED);
                    }
                }
            }
        });

        // Green Button Event
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (!gameOver && e.getState()) {
                    greenCount++;
                    System.out.println("Green presses: " + greenCount);

                    if (greenCount >= 10) {
                        gameOver = true;
                        System.out.println("GREEN PLAYER WINS!");
                        flashLED(greenLED);
                    }
                }
            }
        });

        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //Use your Phidgets 
        while(true) {
            Thread.sleep(150);
        }
    }
    
 // Flash winning LED 5 times
    public static void flashLED(DigitalOutput led) {
        try {
            for (int i = 0; i < 5; i++) {
                led.setState(true);
                Thread.sleep(300);
                led.setState(false);
                Thread.sleep(300);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

