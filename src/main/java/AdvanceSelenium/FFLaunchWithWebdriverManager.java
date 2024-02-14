package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FFLaunchWithWebdriverManager {

	public static void main(String[] args) {
		
		 WebDriverManager.firefoxdriver().setup(); 
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://the-internet.herokuapp.com/nested_frames");
		 
	}
}
