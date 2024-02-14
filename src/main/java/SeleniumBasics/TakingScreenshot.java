package SeleniumBasics;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot {

	public static void main(String[] args) throws Exception {	 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https://the-internet.herokuapp.com/");
		
//		TakesScreenshot tss=(TakesScreenshot) driver;
//		File src=tss.getScreenshotAs(OutputType.FILE);
//		File dst=new File("C:/Selenium/Takscrshot.bmp");
//		FileUtils.copyFile(src, dst);
		
		
		Thread.sleep(10);
		
		
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:/Selenium/Takscrshot.bmp");
		FileUtils.copyFile(src, dst);

		driver.quit();
	}
}