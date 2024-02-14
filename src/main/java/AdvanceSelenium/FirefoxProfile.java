package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirefoxProfile {

	public static void main(String[] args) {
		
		 WebDriverManager.firefoxdriver().setup(); 
		 		 
		 FirefoxProfile profile = new FirefoxProfile();
		 String PROXY = "xx.xx.xx.xx:xx";
		 Proxy proxy = new Proxy();
		 proxy.setHttpProxy(PROXY);
		 proxy.setFtpProxy(PROXY);
		 proxy.setSslProxy(PROXY);
		
	
		 
		 profile.SetProxyPreferences(proxy);
		 
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://the-internet.herokuapp.com/nested_frames");
		 
		 
	}
}
