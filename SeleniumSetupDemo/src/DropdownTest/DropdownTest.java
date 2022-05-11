package DropdownTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///F:/Selenium%20Html/Dropdown.html");
		
			WebElement sel = driver.findElement(By.xpath("//form[@class='py-5']/div/select"));
			
			Select select = new Select(sel);
			select.selectByVisibleText("Service 6");
		
	}

}
