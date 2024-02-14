package SeleniumBasics;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoboClassScreenshot {

	public static void main(String[] args) throws Exception {	 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		//Below script captures whole of the desktop window, so even Web URL / system time/ Alerts
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Robot robotClassObject = new Robot();
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage tmp = robotClassObject.createScreenCapture(screenSize);
		String path=System.getProperty("user.dir")+"/ScreenCapturesPNG/"+"sc"+System.currentTimeMillis()+".png"; 
		ImageIO.write(tmp, "png",new File(path)); 

		driver.quit();
	}
}
