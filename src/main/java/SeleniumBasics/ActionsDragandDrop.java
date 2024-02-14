package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDragandDrop {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement dragdrop1=driver.findElement(By.id("column-a"));
        WebElement dragdrop2=driver.findElement(By.id("column-b"));

		Actions ac1=new Actions(driver);
		Thread.sleep(10000);
		
		ac1.dragAndDrop(dragdrop1, dragdrop2).perform();
		ac1.clickAndHold(dragdrop1).moveToElement(dragdrop2).release(dragdrop1).build().perform();


	}
}
