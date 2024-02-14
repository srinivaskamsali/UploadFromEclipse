package AdvanceSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robotclass {
    public static void main(String[] args) {
    	
    	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
    	
    	
    	try {
            // Create an instance of the Robot class
            Robot robot = new Robot();

            // Simulate pressing the Enter key using Robot
            robot.keyPress(KeyEvent.VK_A);//enter some key from keyboard
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            
          //Wait for File Upload Dialog (some case study)
          	StringSelection ss = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
          	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
          	robot.delay(2000);

            // You can add additional delays or other key events as needed

        	} 
        catch (AWTException e) 
        {
            e.printStackTrace();
        }
    }
}
