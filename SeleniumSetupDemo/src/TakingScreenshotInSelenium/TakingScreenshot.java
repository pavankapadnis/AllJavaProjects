package TakingScreenshotInSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		driver.navigate().to("https://www.amazon.in/");

		File file = driver.getScreenshotAs(OutputType.FILE);
		
		File out = new File("FirstScrenshot.png");
		
		Files.copy(file, out);

	}
}
