package JavaPractice;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		/*Select sel = new Select(driver.findElementById("ctl00_mainContent_DropDownListCurrency"));
		sel.selectByIndex(0);
		sel.selectByVisibleText("INR");
		sel.selectByValue("USD");*/
		driver.get("https://www.divers-supply.com/");
		driver.findElementByXPath("//*[@id='search']").click();
		driver.findElementByXPath("//*[@id='search']").sendKeys("scuba");
		Thread.sleep(2000);
		for(int i=1;i<7;i++)
		{
		driver.findElementByXPath("//*[@id='search']").sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElementByXPath("//*[@id='search']").sendKeys(Keys.ENTER);
		
		
		

	}

}
