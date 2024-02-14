package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

//		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
//		Thread.sleep(5000);
//		String st=driver.switchTo().frame("mce_0_ifr").getTitle();
//		System.out.println(st);
		
		//driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		Thread.sleep(10000);
		String topframe=driver.switchTo().frame("frame-top").getCurrentUrl();
		System.out.println(topframe);
		String stnestframe=driver.switchTo().frame("frame-middle").getCurrentUrl();
	
		System.out.println(stnestframe);
		String backframe=driver.switchTo().defaultContent().getCurrentUrl();
		System.out.println(backframe);
		
		driver.quit();
		


	}

}
