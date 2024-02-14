package AdvanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExe {

	public static void main(String[] args) throws Exception {	 
		
		//use "throws Exception" or "throws Throwable" basing on the error
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
						
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		String buttext=js.executeScript("return arguments[0].getText();", button).toString();
		System.out.println(buttext);
		js.executeScript("arguments[0].click();", button);
		
		String DomainName =js.executeScript("return document.domain;").toString();
		System.out.println(DomainName);
		
		String url =js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println(TitleName);
		
		//Navigate to a new Page i.e to generate an access page. (launch new url)		
		js.executeScript("window.location = 'https://www.naukri.com/selenium-jobs-in-hyderabad-secunderabad?k=selenium&l=hyderabad'");
		
		js.executeScript("return document.getElementByID(“login_Layer”).value;");
		
		//Vertical scroll down by 600  pixels		
		js.executeScript("window.scrollBy(0,600)");
		
		//Refresh a Browser
		js.executeScript("history.go(0)");
		
		//Go to backpage: 
		js.executeScript("history.go(-1)");
		
		//Go to forwardpage: 
		js.executeScript("history.go(1)");
		
		
		//js.executeScript("return document.getElementById(“sdsdf”).value");//not working
				
		driver.quit();
	}
}
