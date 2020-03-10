package FailedTestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFail {
	
	
WebDriver driver;
	
	@Test
	public void fail()
	
	{

	System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	
	driver.findElement(By.xpath("(//a[@class='a']/span)[18]")).click();
	
	

	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("D:\\sample.png"));
		}
		
		
	}

}
