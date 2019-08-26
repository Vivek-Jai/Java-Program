package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Twitter {
	WebDriver driver;
	
	@Test
	public void LoadURL()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://twitter.com/login");
	}
	
	@AfterSuite
	public void closeTwitterbrowser()
	{
		driver.close();
	}

}
