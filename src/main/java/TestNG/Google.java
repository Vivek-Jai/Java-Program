package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google {
	
	WebDriver driver,a;
	
	@Parameters({"URL"})
	@BeforeSuite
	public void LaunchfirefoxBrowser(String URLname)
	{
	  System.out.println("Before suite executed first");
	  
		System.setProperty("webdriver.gecko.driver","C:\\sel\\Selenium\\driver\\geckodriver.exe");
		a= new FirefoxDriver();
		a.get(URLname);
	}
	
	@BeforeTest
	public void LaunchBrowser()
	
	{
		System.out.println("Before Test executed second");
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@BeforeClass
	public void Started()
	{
		System.out.println("Before class executed third");
	}
	
	@Parameters({"URL1"})
	@BeforeMethod
	public void firstexecute(String URLname)
	{
		System.out.println("Before method executed first before each test method - executed fourth");
		 driver.get(URLname);
	}
	
	@Parameters({"URL2"})
	@Test
	public void LoadURL(String URLname)
	{
		System.out.println("Test method executed fifth");
		
		driver.navigate().to(URLname);
	}
	
	@Parameters({"URL3"})
	@AfterMethod
	public void LaunchMail(String URLname)
	{
		System.out.println("After Method executed after the each test method executed- executed sixth");
		driver.get(URLname);
	}
	
    @AfterClass
	public void closeFirefoxbrowser()
	{
		System.out.println("Afterclass executed eight - seventh");
		a.close();
	}
	
	
	
	@AfterTest
	public void closeChromebrowser()
	{
		System.out.println("After Test executed last");
		driver.close();
	}
	
	

}
