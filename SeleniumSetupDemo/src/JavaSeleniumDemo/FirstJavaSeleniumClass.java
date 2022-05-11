package JavaSeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstJavaSeleniumClass {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		System.setProperty("webdriver.gecko.driver", "F:\\A_java\\Jar Files\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		//Here chromedriver is a class And webdriver is a Interface.
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/LadsHospital/");
		
		driver.quit();
	}
}
