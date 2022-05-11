

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@href=\"/gp/new-releases/?ref_=nav_em_cs_newreleases_0_1_1_3\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@href=\"/gp/new-releases/books/ref=zg_bsnr_nav_0\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//ElementNotInteractableException: element not interactable: element has zero size appears
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[contains(text(),\"Mathematics for Class 10\")]")));    
		driver.findElement(By.xpath("//div[contains(text(),\"Mathematics for Class 10\")]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]")).click();
		
		driver.close();
		//driver.findElement(By.partialLinkText("Mathematics for Class 10 - Examination")).click();
	}
}
