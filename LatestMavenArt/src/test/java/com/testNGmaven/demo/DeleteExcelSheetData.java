package com.testNGmaven.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteExcelSheetData {
	
	RemoteWebDriver driver = null;
	
	@BeforeMethod
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://localhost/crud-using-php-ajax/index.php");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void deleteData() throws InterruptedException {
		
		int trsize = driver.findElements(By.cssSelector("table#content>tr")).size();
		
		for(int i = 0; i<trsize-1;i++) {
			
			Thread.sleep(500);
			driver.findElement(By.cssSelector("table#content>tr:nth-child(2)>td:nth-child(10)>a")).click();
			
		}
		
		
	}
}
