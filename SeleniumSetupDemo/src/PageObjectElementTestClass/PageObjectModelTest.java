package PageObjectElementTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectElementClass.*;

public class PageObjectModelTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("file:///F:/Selenium%20Html/ExcelSheetValueInForm.html");
		
		driver.manage().window().maximize();
		
		FindElmentsObjectDemo elem = new FindElmentsObjectDemo();
		
		elem.enterFname(driver).sendKeys("Pavan");
		elem.enterlname(driver).sendKeys("Kapadnis");
		elem.enterGender(driver).click();
		elem.enterDate(driver).sendKeys("09/03/1994");
		elem.enterImgae(driver).sendKeys("F:\\\\FB_IMG_1596948781867.jpg");
		
		
		
	}

}
