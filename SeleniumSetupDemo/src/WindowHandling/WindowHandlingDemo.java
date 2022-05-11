package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[href='http://www.selenium.dev']>button.btn.btn-info")).click();
		
		Set<String> set = driver.getWindowHandles();
		
		for(String i:set) {
			
			String title = driver.switchTo().window(i).getTitle();
			
			System.out.println("Window Tile = "+title);
			
			System.out.println("Window id = "+i);
			
			if(title.contains("Selenium")){
				
				driver.switchTo().window(i);
				
				driver.findElement(By.cssSelector("a[href='https://selenium.dev/selenium-ide/']")).click();
				
				//driver.switchTo().window("Frames & windows");
				
				driver.close();
				
			}
			
			
			
		}
		
		
	}

}
