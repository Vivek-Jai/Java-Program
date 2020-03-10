package FailedTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunFailedTestCase2 {
	
	WebDriver driver;
	
	
	@Test	
	public void titleTest()
		
		{

		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.streetstrider.com/");
		
		
		String ele = driver.getTitle();
		
		String ele1 = "Streettrider: Outdoor Elliptical Bike";
		
		Assert.assertEquals(ele, ele1);
		

		}

}
