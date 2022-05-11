import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RandomRepeatPracticeClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		/*
		WebElement elem = driver.findElement(By.cssSelector("ul#primary-menu>li:nth-child(6)"));
		act.moveToElement(elem).click().build().perform();
		WebElement listClick = driver.findElement(By.cssSelector("div.card-body>ul#ul-style>li:nth-child(6)"));
		
		act.moveToElement(listClick).click().build().perform();
		*/  
		WebElement img1 = driver.findElement(By.cssSelector("ul#gallery>li:nth-child(1)>img"));
		WebElement img2 = driver.findElement(By.cssSelector("ul#gallery>li:nth-child(2)>img"));
		WebElement img3 = driver.findElement(By.cssSelector("ul#gallery>li:nth-child(3)>img"));
		WebElement img4 = driver.findElement(By.cssSelector("ul#gallery>li:nth-child(4)>img"));
		WebElement toimg = driver.findElement(By.cssSelector("div#trash"));
		act.moveToElement(img1).clickAndHold().moveToElement(toimg).release().build().perform();
		act.moveToElement(img2).clickAndHold().moveToElement(toimg).release().build().perform();
		act.moveToElement(img3).clickAndHold().moveToElement(toimg).release().build().perform();
		act.moveToElement(img4).clickAndHold().moveToElement(toimg).release().build().perform();
		
		
		
		
		
	}

}
