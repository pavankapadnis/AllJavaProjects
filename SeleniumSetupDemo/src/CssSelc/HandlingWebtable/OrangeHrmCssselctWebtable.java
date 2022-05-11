package CssSelc.HandlingWebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrmCssselctWebtable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");

		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");

		driver.findElement(By.cssSelector("input.button")).click();

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.cssSelector("div#mainMenu>ul#mainMenuFirstLevelUnorderedList>li:nth-of-type(1)>a")));

		act.moveToElement(driver.findElement(By.cssSelector("div#mainMenu>ul#mainMenuFirstLevelUnorderedList>li:nth-of-type(1)>a+ul>li:nth-of-type(1)>a")));

		act.moveToElement(driver.findElement(By.cssSelector("div#mainMenu>ul#mainMenuFirstLevelUnorderedList>li:nth-of-type(1)>a+ul>li:nth-of-type(1)>ul>li>a")))
				.click().build().perform();

		int row = driver.findElements(By.cssSelector("table.table>tbody>tr")).size();

		System.out.println("Total no. od Rows "+row+"\n");

		int escount = 0;

		int dscount = 0;
		
		int ess = 0;
		
		int admin = 0;

		for (int i = 1; i <= row; i++) {

			String ends = driver
					.findElement(
							By.cssSelector("table.table>tbody>tr:nth-child("+i+")>td:nth-child(5)"))
					.getText();
			
			String urole = driver
					.findElement(
							By.cssSelector("table.table>tbody>tr:nth-child("+i+")>td:nth-child(3)"))
					.getText();

			if (urole.contains("ESS")) {
				
				Thread.sleep(1000);
				
				WebElement checkbox = driver.findElement(By.cssSelector("table.table>tbody>tr:nth-child("+i+")>td:nth-child(1)>input[type='checkbox']"));
				
				boolean check = checkbox.isDisplayed();
				//System.out.println(check);
				if(check==true) {
					driver.findElement(By.cssSelector("table.table>tbody>tr:nth-child("+i+")>td:nth-child(1)>input[type='checkbox']")).click();
				}

				ess++;

			} else {
				
				admin++;

			}

			if (ends.contains("Enabled")) {

				escount++;

			} else {

				dscount++;

			}

		}
		

		System.out.println("Total Enabled user is " + escount + "\n");

		System.out.println("Total Disabled User Is " + dscount + "\n");
		
		System.out.println("Total ESS user is " + ess + "\n");
		
		System.out.println("Total Admin user is " + admin + "\n");

		driver.close();
		
		
		
		
		
	}

}
