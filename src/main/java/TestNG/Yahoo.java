package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yahoo {
	
	@Test
	public void LoadURL()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://in.yahoo.com/");
	}
	
}
