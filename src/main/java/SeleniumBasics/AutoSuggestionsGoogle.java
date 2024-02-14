package SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AutoSuggestionsGoogle {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		StringBuilder str3=new StringBuilder("selenium");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys(str3);
		List<WebElement>elements=driver.findElements(By.className("//ul[@role='listbox']/li"));
		
		Iterator<WebElement> iterator = elements.iterator();
        while (iterator.hasNext()) {
            WebElement element = iterator.next();
            System.out.println("Element Text: " + element.getText());
        }
	}
}