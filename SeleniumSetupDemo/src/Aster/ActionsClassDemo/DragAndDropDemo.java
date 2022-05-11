package Aster.ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		
		WebElement source = driver.findElement(By.xpath("//ul[@id='gallery']//child::li[1]"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']")); 
		
		Actions action = new Actions(driver);
		
		//Both merhods are working fine.
		
		//action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		
		action.dragAndDrop(source, target).build().perform();
		
		
		
	}

}
