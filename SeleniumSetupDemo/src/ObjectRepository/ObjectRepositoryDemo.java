package ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepositoryDemo {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fl = new FileInputStream("F:\\A_java\\Eclipse\\SeleniumSetupDemo\\src\\ObjectRepository\\Config.properties");
		
		prop.load(fl);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

			driver = new ChromeDriver();
			
		}else if(browserName.equals("FF")) {
			
			System.setProperty("webdriver.gecko.driver", "F:\\A_java\\Jar Files\\geckodriver.exe");

			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		
		
		
		String url = prop.getProperty("url");
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("name_xpath"))).sendKeys(prop.getProperty("name"));
		
		String title = driver.getTitle();
		
		System.out.println("Title of current url is "+ title);
		
		driver.close();
		
		if (title.equals("Google")) {
			
			System.out.println("Test case 01 is Passed");
			
		}
		else {
			
			System.out.println("Test case 01 is Failed");
			
		}
		
	}

}
