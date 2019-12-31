package JavaPractice;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver ;
		
        System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://uat.southernlabware.com/");
		
		driver.manage().window().maximize();
		
		ru.yandex.qatools.ashot.Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir")+"/Errorscreenshots/ScreenshotName.png"));
		
		
		
		
		
		driver.quit();

	}

}
