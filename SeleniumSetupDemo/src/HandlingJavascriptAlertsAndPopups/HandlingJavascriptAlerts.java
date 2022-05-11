package HandlingJavascriptAlertsAndPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavascriptAlerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		driver.findElement(By.xpath("//input[@id=\"searchBtn\"]")).click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		driver.findElement(By.xpath("//input[@id=\"pnrPrefixWithTktNo\"]")).sendKeys("12345");

		driver.findElement(By.xpath("//input[@id=\"mobileNo\"]")).sendKeys("9234567890");

		driver.findElement(By.xpath("//input[@id=\"searchBtn\"]")).click();

		driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/form/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/form/div[2]/div[1]/div/input[2]")).click();

		alert.accept();

		driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/form/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("/html/body/main/section/div/div/div/div/form/div[2]/div[3]/div/div/div[1]/div/input")).click();

		alert.accept();
	}

}
