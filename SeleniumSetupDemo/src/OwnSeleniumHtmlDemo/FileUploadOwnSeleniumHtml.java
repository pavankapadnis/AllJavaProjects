package OwnSeleniumHtmlDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadOwnSeleniumHtml {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("file:///F:/Selenium%20Html/ExcelSheetValueInForm.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("fname")).sendKeys("Pavan");
		
		driver.findElement(By.name("lname")).sendKeys("Kapadnis");
		
		driver.findElement(By.id("male")).click();
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select selc = new Select(country);
		
		selc.selectByVisibleText("India");
		
		int age = 28;
		
		driver.findElement(By.name("age")).sendKeys(String.valueOf(age));
		
		driver.findElement(By.name("date")).sendKeys("12/12/1998");
		
		int empid = 4242;
		
		driver.findElement(By.name("emid")).sendKeys(String.valueOf(empid));
		
		driver.findElement(By.name("filename")).sendKeys("F:\\FB_IMG_1596948781867.jpg");
		
		
		
	}

}
