package SeleniumBasics;
import java.io.File;
import java.lang.reflect.Proxy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumDrivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.google.com");
        
        
	}

}
