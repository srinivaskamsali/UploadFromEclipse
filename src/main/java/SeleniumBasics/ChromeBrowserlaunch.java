package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserlaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumDrivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		driver.findElement(By.linkText("Inputs")).click();
		//driver.findElement((By.xpath(null))
		
		String curl=driver.getCurrentUrl();
		
		if(curl.equals("https://the-internet.herokuapp.com/inputs"))
		{
			System.out.println("equal");
		}
	}
}
