package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		
		try
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		driver.quit();
		
		}
		
		catch ( ElementNotFoundException e)
		{
			e.printStackTrace();
			
		}
		
		finally
		
		{
			
			System.out.println(driver.getTitle());
		}

}
}
