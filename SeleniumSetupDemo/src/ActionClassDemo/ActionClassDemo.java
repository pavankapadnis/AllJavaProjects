package ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///F:/Selenium%20Html/Dropdown.html");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div/a[1]"))).build().perform();
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div/a[2]"))).build().perform();

		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div/a[3]"))).build().perform();

		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div/a[4]"))).build().perform();

		driver.navigate().to("https://jyotidisplay.com/");
		
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		
		driver.navigate().to("https://testingshastra.com/assignments/drag-and-drop");
		
		//driver.findElement(By.xpath("//*[@id=\"menu-item-354\"]/a")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"ul-style\"]/li[6]/a")).click();
		
		action.clickAndHold(driver.findElement(By.xpath("//img[@src='/images/java-fullstack.png']")))
		.release(driver.findElement(By.xpath("//div[@id='trash']")));
		
		
	}

}
