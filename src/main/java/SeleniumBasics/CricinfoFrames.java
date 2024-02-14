package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoFrames {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/afghanistan-in-india-2023-24-1389384");
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(3000);
		String topframe=driver.switchTo().frame("google_ads_iframe_21783347309/espn.cricinfo.com/series_135").getTitle();
		System.out.println(topframe);
//		String stnestframe=driver.switchTo().frame("frame-middle").getCurrentUrl();
//	
//		System.out.println(stnestframe);
//		String backframe=driver.switchTo().defaultContent().getCurrentUrl();
//		System.out.println(backframe);
//		
//		driver.quit();
		


	}

	
}
