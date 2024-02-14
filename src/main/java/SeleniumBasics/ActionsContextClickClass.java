package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsContextClickClass {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement context=driver.findElement(By.id("hot-spot"));

		Actions ac1=new Actions(driver);
		Thread.sleep(10000);
		
		ac1.contextClick(context).build().perform();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();// it appears that this is not an alert, But some
		//how it is handling it.
		//ac1.contextClick(context).keyDown(Keys.ARROW_DOWN ).perform();

	}
}
