package Com.DrLadsHospital;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DrladsHospital {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost/LadsHospital/");

		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.id("txt_username")).sendKeys("drlad");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("drlad2019");
		
		driver.findElement(By.name("btn_login")).click();
		
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		action.moveToElement(driver.findElement(By.linkText("OPD"))).build().perform();
		
		driver.findElement(By.linkText("OPD")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("OPD Registration")).click();
		
		
		
		
	}
}
