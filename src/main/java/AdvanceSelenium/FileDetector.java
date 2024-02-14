package AdvanceSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDetector {

	public static void main(String[] args) throws Exception {	 
		
		WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.setFileDetector(new LocalFileDetector());

		Thread.sleep(10);

		WebElement upload = driver.findElement(By.id("drag-drop-upload"));

		upload.sendKeys("C:\\Users\\ksrin\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-12-27 121222.png");
		driver.findElement(By.id("file-submit"));
		
		driver.quit();
	}	
}


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.LocalFileDetector;
//import org.openqa.selenium.remote.RemoteWebElement;
//
//public class FileUploadExample {
//    public static void main(String[] args) {
//        // Set the path to the ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//
//        // Create a new instance of the ChromeDriver
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            // Navigate to the webpage with a file upload input
//            driver.get("https://example.com/upload");
//
//            // Locate the file input element by its ID
//            WebElement fileInput = driver.findElement(By.id("fileInput"));
//
//            // Create an instance of LocalFileDetector
//            LocalFileDetector fileDetector = new LocalFileDetector();
//
//            // Convert the local file path to a remote file path
//            String localFilePath = "path/to/local/file.txt";
//            String remoteFilePath = fileDetector.getLocalFileDetector().uploadFile(localFilePath).toString();
//
//            // Set the remote file path to the file input element
//            ((RemoteWebElement) fileInput).setFileDetector(fileDetector);
//            fileInput.sendKeys(remoteFilePath);
//
//            // Perform actions with the file input if needed (e.g., submit a form)
//
//            // Optionally, wait for the next page to load, perform further actions, etc.
//        } finally {
//            // Close the browser
//            driver.quit();
//        }
//    }
//}
//
//
