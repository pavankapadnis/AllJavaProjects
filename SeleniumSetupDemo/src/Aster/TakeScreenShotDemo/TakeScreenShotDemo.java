package Aster.TakeScreenShotDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenShotDemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.fresherstore.com/phonepe-recruitment/");
		
		/* This method is 1st method to TakeScreenShot. By Aster class.
		
		--> This method take screen shot only viewport. means taking screen shot only visible content.
		
		--> Not take a screen shot whole page means top to bottom of web page. For that 
			purpose there are different method */
		
		File file = driver.getScreenshotAs(OutputType.FILE);
		
		File out = new File("SecondScrenshot.png");
		
		Files.copy(file, out);
		
		
	}

}
