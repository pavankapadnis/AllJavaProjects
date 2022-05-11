package JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		//driver.findElement(By.xpath("//input[@id=\"searchBtn\"]")).click();
		
		String text1 = generateAlert(driver);
		
		System.out.println(text1);
		
	}
	
	//To get all inner text of webpage.
	public static String generateAlert(WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String text = js.executeScript("return document.documentElement.innerText;").toString();
		return text;
	}
	
}
