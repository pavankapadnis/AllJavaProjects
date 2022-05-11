package JavaSeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSeleniumTestScript {
	
	/*
	 * Agile Scrum video must watch 
	 * https://www.youtube.com/watch?v=7sOKZQsMiwo&t=1s
	 */

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.findElement(By.name("firstname")).sendKeys("firstname");
		
		driver.findElement(By.name("lastname")).sendKeys("lastname");
		
		driver.findElement(By.id("sex-0")).click();
		
		driver.findElement(By.id("exp-2")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("10/10/1998");
		
		driver.findElement(By.id("profession-1")).click();
		
		driver.findElement(By.id("tool-2")).click();
		
		//Select slct = new Select(driver.findElement("continents"));
		
		
	}

}
