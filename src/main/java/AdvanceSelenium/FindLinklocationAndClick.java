package AdvanceSelenium;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinklocationAndClick {

	public static void main(String[] args) throws Exception {	 
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https://account.box.com/login?redirect_url=%2Ffile%2F919698407885");
		Thread.sleep(20);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			String ss=links.get(i).getText();
			System.out.println(ss);
			if(ss.equals("Box Blog"))
			{
				links.get(i).click();
			}
		}
		
		WebDriver augmentedDriver=new Augmenter().augment(driver);
        File screenshot =((TakesScreenshot)augmentedDriver).
getScreenshotAs(OutputType.FILE);


		//driver.quit();
	}

}
