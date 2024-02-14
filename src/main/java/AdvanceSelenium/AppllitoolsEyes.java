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

import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppllitoolsEyes {

	public static void main(String[] args) throws Exception {	 
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https://www.qtpselenium.com/");
		
//		Eyes eyes= new Eyes();
//		
//		eyes.setApiKey(System.getenv("yJeSq4L104W3pMrLS1WMq101qmAmfUn109VqsWYdFetwpSl108E110"));
//		eyes.open(driver,"https://www.qtpselenium.com/","Test Name1");
//		eyes.check(Target.window().fully().withName("Full Page Screenshot"));

		driver.quit();
	


	}

}
