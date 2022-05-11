package FirstSeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	}
}
