package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {

	public static void main(String[] args) {


		 
		 	WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/nested_frames");
			
			Cookie cookie=new Cookie("key","value");
			driver.manage().addCookie(cookie);
			
			Cookie cook=new Cookie("key","value");
			driver.manage().addCookie(cook);
			
			Set<Cookie> allcookies=driver.manage().getCookies();
			
			for(Cookie loadedcookie:allcookies)
			{
				String n=loadedcookie.getName();
				String v=loadedcookie.getValue();
				System.out.println(n + " "+ v);
				
			}
		}

}
