package JavaPractice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String el = null;
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.uboxes.com");
		
		List<WebElement> links =driver.findElementsByTagName("a");
		List<WebElement> img =driver.findElementsByTagName("img");
		
		System.out.println(links.size());
		System.out.println(img.size());
		
		/*for(int i=0; i<=links.size()-1;i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}*/
		
		for(int i=0; i<img.size();i++)
			
		{
			
			System.out.println(img.get(i).getAttribute("src"));		}
		 
		}
	 

}
