package JavaPractice;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotFull {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\sel\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		AShot aSht = new AShot();
        Screenshot sc = aSht.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
    	ImageIO.write(sc.getImage(), "PNG", new File("C:\\sel\\Screenshot\\Gmail.png"));
	}

}
