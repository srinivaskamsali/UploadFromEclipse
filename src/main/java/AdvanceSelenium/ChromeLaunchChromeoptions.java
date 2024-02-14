package AdvanceSelenium;

import java.time.Duration;

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

public class ChromeLaunchChromeoptions {

	public static void main(String[] args) throws Exception {	 
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions browserOptions=new ChromeOptions();
		browserOptions.setPlatformName("windows 11");
		
		browserOptions.setBrowserVersion("119.0");
		//HashMap<String, Object> ltoptions=new HashMap<String, Object>;
		ChromeDriver driver=new ChromeDriver(browserOptions);
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.quit();

	}
}