package SeleniumBasics;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsHeadless {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		 ChromeOptions co= new ChromeOptions();

		 co.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(co);
						
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement dragdrop1=driver.findElement(By.id("column-a"));
        
        int reclen=dragdrop1.getRect().getX();
        System.out.println(reclen);
        
        String color=dragdrop1.getCssValue("color");
        System.out.println(color);
        driver.close();

	}
}
