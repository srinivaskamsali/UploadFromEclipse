package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream ip=new FileInputStream("./src/test/resources/config.properties");
		Properties prop=new Properties();
		prop.load(ip);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println(prop.getProperty("username"));//user this prop value anywhere you want

	}

}
