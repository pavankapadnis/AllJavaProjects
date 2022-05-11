package com.testNGmaven.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngMaven {
	
	RemoteWebDriver driver = null;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://localhost/crud-using-php-ajax/index.php");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "Excel Data")
	//@Parameters ({"fname","lname","gender","country","age","dates","emid" })
	public void testOne(String fname, String lname, String gender, String country, String age, String dates, String emid) throws InterruptedException {
		
		
		driver.findElement(By.cssSelector("a.btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#fname")).sendKeys(fname);
		driver.findElement(By.cssSelector("input#lname")).sendKeys(lname);
		driver.findElement(By.cssSelector("input#gender")).sendKeys(gender);
		driver.findElement(By.cssSelector("input#country")).sendKeys(country);
		driver.findElement(By.cssSelector("input#age")).sendKeys(age);
		driver.findElement(By.cssSelector("input#date")).sendKeys(dates);
		driver.findElement(By.cssSelector("input#empid")).sendKeys(emid);
		driver.findElement(By.cssSelector("button#save")).click();
		
	}
	
}
