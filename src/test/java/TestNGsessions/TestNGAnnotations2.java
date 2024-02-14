package TestNGsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations2 {
	
	    WebDriver driver;
	    
	    @DataProvider
	    public Object[][] getLogindata()
	    {
	    	return new Object[][]
	    	{
	    		{"srini@gmail", "robin" },
	    		{" "," "}
	    	};
	    }
	    

	    @BeforeSuite //import suggestion gets displayed only after method signature is written
	    public void WebdriverInitiate2()
	    {
	        WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/login");
	        
	    }
	    
	    @BeforeTest
	    public void befTest2()
	    {
	        System.out.println("in BT2");
	    }
	    
	    @BeforeClass
	    public void befclass2()
	    {
	        System.out.println("in BC2");
	    }
	    
	    @BeforeMethod
	    public void BefM2()
	    {
	    	System.out.println("in BM2");
	    	driver.get("https://the-internet.herokuapp.com/login");
	        String clas1=driver.findElement(By.xpath("//h2[text()=\"Login Page\"]")).getText();
	        Assert.assertEquals(clas1, "Login Page");
	    }
	    
	    @Test(dataProvider="getLogindata")
	    public void validTest2(String username, String password)
	    {
	    	System.out.println("in validTest1");
	    	String clas1=driver.findElement(By.xpath("//input[@id='username']")).getAttribute("type");
	        Assert.assertEquals(clas1, "text");
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	        
	        
	    }
	    
	    @Test(enabled=true, priority=1)
	    public void validTest21()
	    {
	        System.out.println("in validTest2");
	        String clas=driver.findElement(By.xpath("//input[@id='password']")).getAttribute("type");
	        Assert.assertEquals(clas, "password");
	    }
	    
	    @Test(priority=1)
	    public void validTest31()
	    {
	    	System.out.println("in validTest31");
	    	String clas=driver.findElement(By.xpath("//i")).getAttribute("class");
	        Assert.assertEquals(clas, "fa fa-2x fa-sign-in");
	    }
	    
	    @Test(priority=2)
	    public void validTest41()
	    {
	    	System.out.println("in validTest41"
	    			+ "");
	    	String clas=driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).getAttribute("href");
	        Assert.assertEquals(clas, "http://elementalselenium.com/");
	    }
	    
	    	    
	    @AfterMethod
	    public void afterM2()
	    {
	        System.out.println("in afterM2");
	        
	    }
	    
	    @AfterClass
	    public void AFterC2()
	    {
	        System.out.println("in AFterC2");
	    }
	    
	    @AfterSuite
	    public void AfterS2()
	    {
	        System.out.println("in AfterS2");
	    }
	}