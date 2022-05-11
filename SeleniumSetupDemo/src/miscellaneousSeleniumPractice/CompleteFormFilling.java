package miscellaneousSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteFormFilling {

	public static void fillform() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Pavan");
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Kapadnis");
		
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("AP Nampur, Devganga Nivas, Nalkas Road, Gurudatta Nagar, Chatrapati chowk Nampur. tal-Satana dist Nashik");
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("pavankapadnis@gmail.com");
		
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("12345678");
		
		driver.findElement(By.cssSelector("input[id='imagesrc']")).sendKeys("F:\\FB_IMG_1596948781867.jpg");
		
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		
		driver.findElement(By.cssSelector("input[value='Cricket']")).click();
		
		driver.findElement(By.cssSelector("input[value='Movies']")).click();
		
		/*
		WebElement mulsel = driver.findElement(By.cssSelector("multi-select"));
		
		Select sel = new Select(mulsel);
		
		sel.selectByIndex(8);
		sel.selectByIndex(2);
		sel.selectByIndex(4);
		sel.selectByIndex(1);
		sel.selectByIndex(5);
		sel.selectByIndex(6);
		sel.deselectByIndex(2);
		sel.deselectByIndex(4);
		sel.deselectByIndex(1);
		sel.deselectByIndex(5);
		*/
		
		driver.findElement(By.cssSelector("div.ui-autocomplete-multiselect.ui-state-default.ui-widget")).click();
		
		driver.findElement(By.cssSelector("ul.ui-autocomplete>li:nth-child(2)")).click();
		
		driver.findElement(By.cssSelector("ul.ui-autocomplete>li:nth-child(4)")).click();
		
		
		WebElement selsk = driver.findElement(By.cssSelector("select[id='Skills']"));
		
		Select selsks = new Select(selsk);
		
		selsks.selectByVisibleText("Java");
		
		WebElement selctcontry = driver.findElement(By.cssSelector("select[id='countries']"));
		
		
		//driver.findElement(By.cssSelector("span[role='combobox']")).click();
		
		//driver.findElement(By.cssSelector("ul[id='select2-country-results']>li:nth-child(6)")).click();
		
		WebElement year = driver.findElement(By.cssSelector("select[id='yearbox']"));
		
		
		Select selyear = new Select(year);
		
		selyear.selectByVisibleText("1994");
		
		
		WebElement month = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
		
		
		Select selmonth = new Select(month);
		
		selmonth.selectByVisibleText("March");
		
		WebElement day = driver.findElement(By.cssSelector("select[id='daybox']"));
		
		
		Select selday = new Select(day);
		
		selday.selectByVisibleText("9");
		
		driver.findElement(By.cssSelector("input[id='firstpassword']")).sendKeys("pavan1234");
		
		driver.findElement(By.cssSelector("input[id='secondpassword']")).sendKeys("pavan1234");
		
		driver.findElement(By.cssSelector("button[id='Button1']")).click();
		
	}

	public static void main(String[] args) {
		
		fillform();

	}

}
