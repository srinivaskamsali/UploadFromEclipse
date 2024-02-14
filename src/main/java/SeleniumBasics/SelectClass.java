package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

	public static void main(String[] args) throws Throwable {
		
			WebDriverManager.chromedriver().setup();
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dropdown");
			
			WebElement seldrop=driver.findElement(By.id("dropdown"));
			Select sel=new Select(seldrop);
			sel.selectByIndex(1);
			
			Thread.sleep(5000);
			//sel.selectByValue("Option 1");
			sel.selectByVisibleText("Option 2");
			driver.quit();
			//driver.switchTo().
			
	}

}
