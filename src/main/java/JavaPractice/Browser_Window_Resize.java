package JavaPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Window_Resize {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d = new Dimension(420,600);
		
		driver.manage().window().setSize(d);
		
		
		

	}

	private static Object javascriptExecutor(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

}
