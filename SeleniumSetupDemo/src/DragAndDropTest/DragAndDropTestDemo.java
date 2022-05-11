package DragAndDropTest;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTestDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement inter = driver.findElement(By.xpath("//div[@class='navbar-collapse collapse navbar-right']//child::ul/li[6]//child::a[@href='Interactions.html']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(inter).build().perform();
		
		WebElement dragDrop = driver.findElement(By.xpath("//div[@class='navbar-collapse collapse navbar-right']//child::ul/li[6]//child::ul/li[1]//child::a[contains(text(), 'Drag and Drop')]"));
		
		action.moveToElement(dragDrop).build().perform();
		
		WebElement stat = driver.findElement(By.xpath("//div[@class='navbar-collapse collapse navbar-right']//child::ul/li[6]//child::ul//child::li//child::ul//child::li[1]"));
		
		action.moveToElement(stat).click().build().perform();
		
		WebElement source = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement target = driver.findElement(By.xpath("//div[@class='dragged']"));
		
		
		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		
		System.out.println("Performed");
	
		
		
		
	}

}
