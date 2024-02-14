package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsTabsSwitchTo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(5000);
		Set<String> winhandles=driver.getWindowHandles();
		Iterator<String> it=winhandles.iterator();
		System.out.println(it.next());//first window handle is printed here

		while(it.hasNext())
		{
			//it.next();
			
			driver.switchTo().window(it.next());
			System.out.println(it.next());//second window handle is printed here

		}
		//driver.switchTo().window(null)
		
		//driver.quit();
		
	}
}