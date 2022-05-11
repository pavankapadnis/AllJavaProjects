package WebTabkeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrmSiteWebtableHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath(
				"//div[@id='mainMenu']//child::ul[@id='mainMenuFirstLevelUnorderedList']//child::li[1]//child::a[@id='menu_admin_viewAdminModule']")));

		act.moveToElement(driver.findElement(By.xpath(
				"//div[@id='mainMenu']//child::ul[@id='mainMenuFirstLevelUnorderedList']//child::li[1]//child::ul//child::li[1]//a[@id='menu_admin_UserManagement']")));

		act.moveToElement(driver.findElement(By.xpath(
				"//div[@id='mainMenu']//child::ul[@id='mainMenuFirstLevelUnorderedList']//child::li[1]//child::ul//child::li[1]//child::ul//child::li[1]//a[@id='menu_admin_viewSystemUsers']")))
				.click().build().perform();

		int row = driver.findElements(By.xpath("//table[@id='resultTable']//child::tbody//child::tr")).size();

		// System.out.println(row);

		int escount = 0;

		int dscount = 0;
		
		int ess = 0;
		
		int admin = 0;

		for (int i = 1; i <= row; i++) {

			String ends = driver
					.findElement(
							By.xpath("//table[@id='resultTable']//child::tbody//child::tr[" + i + "]//child::td[5]"))
					.getText();
			
			String urole = driver
					.findElement(
							By.xpath("//table[@id='resultTable']//child::tbody//child::tr[" + i + "]//child::td[3]"))
					.getText();

			if (urole.contains("ESS")) {
				
				Thread.sleep(1000);
				
				WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']//child::tbody//child::tr[" + i + "]//child::td[1]//child::input[@type='checkbox']"));
				
				boolean check = checkbox.isDisplayed();
				//System.out.println(check);
				if(check==true) {
					driver.findElement(By.xpath("//table[@id='resultTable']//child::tbody//child::tr[" + i + "]//child::td[1]//child::input[@type='checkbox']")).click();
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
		

		System.out.println("Total Enabled user is " + escount);

		System.out.println("Total Disabled User Is " + dscount);
		
		System.out.println("Total ESS user is " + ess);
		
		System.out.println("Total Admin user is " + admin);

		//driver.close();

	}

}
