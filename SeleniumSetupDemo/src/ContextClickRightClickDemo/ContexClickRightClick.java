package ContextClickRightClickDemo;

import java.awt.*;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexClickRightClick {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@id='hot-spot']"))).contextClick().build().perform();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Robot robot = new Robot();
		
		
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}
