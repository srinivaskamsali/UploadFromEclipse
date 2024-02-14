package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearch {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		StringBuilder str3=new StringBuilder("srinvias");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys(str3);
		//driver.findElement(By.cssSelector("#APjFqb")).submit();
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		//Actions act=new Actions(driver);
		//act.click(driver.findElement(By.xpath("//input[@value='Google Search']")));
		//act.sendKeys(Keys.RETURN).perform();
		//driver.wait(1000);
		//driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();

	}

}
