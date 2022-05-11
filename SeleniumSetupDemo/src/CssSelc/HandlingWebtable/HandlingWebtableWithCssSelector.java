package CssSelc.HandlingWebtable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebtableWithCssSelector {
	
	static WebDriver driver = null;
	
	public static void CssselectorWebtableHandling() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//driver.findElement(By.cssSelector("div.ml-popup.w-100.row-form>button[aria-label='Close']>span[aria-hidden='true']")).click();
		
		List<WebElement> listrow = new ArrayList<WebElement>((driver.findElements(By.cssSelector("table.tg>tbody>tr"))));
		
		listrow.size();
		
		List<WebElement> listcolm = new ArrayList<WebElement>((driver.findElements(By.cssSelector("table.tg>tbody>tr>th"))));
		
		listcolm.size();
		
		for(int i = 0; i<=listrow.size(); i++) {
			
			for(int j = 0; i<=listcolm.size(); j++) {
				
				WebElement elem = driver.findElement(By.cssSelector("table.tg>tbody>tr:nth-child("+i+")>td:nth-child("+j+")"));
				
				String str = elem.getText();
				
				if(str.contains("Tim Watson") || str.contains("Mayur Deshmukh") ||str.contains("Monica Singh") ||str.contains("Chris Porter")) {
					
					driver.findElement(By.cssSelector("table.tg>tbody>tr:nth-child("+i+")>td:nth-child(3)")).click();
					
					driver.findElement(By.cssSelector("table.tg>tbody>tr:nth-child("+i+")>td:nth-child(4)")).click();
					
				}
				
			}
		}
		
	}	

	public static void main(String[] args) {
		
		CssselectorWebtableHandling();
		
	}

}
