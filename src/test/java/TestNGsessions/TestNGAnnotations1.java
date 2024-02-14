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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations1 {
	
	    WebDriver driver;
	    @BeforeSuite //import suggestion gets displayed only after method signature is written
	    public void WebdriverInitiate()
	    {
	        WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/login");
	        
	    }
	    
	    @BeforeTest
	    public void befTest()
	    {
	        System.out.println("in BT");
	    }
	    
	    @BeforeClass
	    public void befclass()
	    {
	        System.out.println("in BC");
	    }
	    
	    @BeforeMethod
	    public void BefM()
	    {
	    	System.out.println("in BM");
	    	driver.get("https://the-internet.herokuapp.com/login");
	        String clas1=driver.findElement(By.xpath("//h2[text()=\"Login Page\"]")).getText();
	        Assert.assertEquals(clas1, "Login Page");
	    }
	    
	    @Test
	    @Parameters({"brow"})
	    public void validTest1(String browname)
	    {
	    	System.out.println("in validTest1");
	    	String clas1=driver.findElement(By.xpath("//input[@id='username']")).getAttribute("type");
	        Assert.assertEquals(clas1, "text");
	        System.out.println(browname);
	        
	    }
	    
	    @Test(enabled=true, priority=1)
	    public void validTest2()
	    {
	        System.out.println("in validTest2");
	        String clas=driver.findElement(By.xpath("//input[@id='password']")).getAttribute("type");
	        Assert.assertEquals(clas, "password");
	    }
	    
	    @Test(priority=1)
	    public void validTest3()
	    {
	    	System.out.println("in validTest3");
	    	String clas=driver.findElement(By.xpath("//i")).getAttribute("class");
	        Assert.assertEquals(clas, "fa fa-2x fa-sign-in");
	    }
	    
	    @Test(priority=2)
	    public void validTest4()
	    {
	    	System.out.println("in validTest4"
	    			+ "");
	    	String clas=driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).getAttribute("href");
	        Assert.assertEquals(clas, "http://elementalselenium.com/");
	    }
	    
	    	    
	    @AfterMethod
	    public void afterM()
	    {
	        System.out.println("in afterM");
	        
	    }
	    
	    @AfterClass
	    public void AFterC()
	    {
	        System.out.println("in AFterC");
	    }
	    
	    @AfterSuite
	    public void AfterS()
	    {
	        System.out.println("in AfterS");
	    }
	}