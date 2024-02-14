package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		//Thread.sleep(10);
		//driver.findElement(By.tagName("A/B Testing")).click();
		//Thread.sleep(10);
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(RelativeLocator.with(By.id("input-password")).below(By.id("input-email"))).sendKeys("abcde");
		
		
	}
}