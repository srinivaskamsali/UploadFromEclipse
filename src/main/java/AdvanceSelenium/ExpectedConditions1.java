package AdvanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpectedConditions1 {

	public static void main(String[] args) throws Exception {	 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://www.softaculous.com/demos/OpenCart");
		Thread.sleep(10);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@name=\"demobody\"]")));
		
		//wait.until(ExpectedConditions.attributeContains(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/h1[1]/a[1]"), "href", "soft"));
		
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/h1[1]/a[1]"), "softaculous")))
		{
			//wait.until(ExpectedConditions.urlToBe("https://www.softaculous.com/demos/OpenCart"));
		driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/h1[1]/a[1]")).click();
		}
//		WebElement element = wait.until(ExpectedConditions.and(
//                ExpectedConditions.visibilityOfElementLocated(By.id("exampleId")),
//                attributeContains(By.id("exampleId"), "attributeName", "expectedValue")));
		
		
		//WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/h1[1]/a[1]")));
	
		//driver.quit();
	}
}