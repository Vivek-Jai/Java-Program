package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook {
	
	@Test(dataProvider = "testing", dataProviderClass= TestDataProvider.class)
	public void LoadURL(String URL)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(URL);
	}
	
	/*@DataProvider 
	public Object [][] getData()
	{
		Object [][] data = new Object[1][1];
		
		data[0][0]= "https://www.facebook.com/";
		
		return data;
	}*/
}
