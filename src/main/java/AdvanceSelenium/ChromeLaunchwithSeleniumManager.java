package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class ChromeLaunchwithSeleniumManager {

	public static void main(String[] args) {
		//System.setProperty("webdriver.http.factory","jdk-http-client");
		//SeleniumManager.getInstance().getDriverPath("chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver = webdriver.Chrome(service=ChromeService(ChromeDriverManager().install()))
		driver.get("https://the-internet.herokuapp.com/inputs");

	}

}
