package WebTabkeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHnadlingDemo {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///F:/Selenium%20Html/table.html");
		
		int row = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		
		int col = driver.findElements(By.xpath("//html/body/table/tbody/tr[2]/td")).size();
		
		System.out.println("Number of rows is = "+row);
		System.out.println("Number of coloumn is = "+col);
		
		int count=0;
		
		for(int i = 2; i<=5;i++) {
			
			for(int j = 1; j<=4; j++) {
				
				String st = driver.findElement(By.xpath("//html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				if(st.equals("Swanson") || st.equals("Peter")) {
					WebElement we = driver.findElement(By.xpath("//html/body/table/tbody/tr["+i+"]/td[1]/input"));
					we.click();
				}
				//System.out.print(st+" ");
				
			}
			
			String st = driver.findElement(By.xpath("//html/body/table/tbody/tr["+i+"]/td[6]")).getText();
			
			if(st.equals("Enabled")) {
				count++;
			}
		}
		
		System.out.println("Total no pf enabled users is = "+count);
		 
		
		//driver.close();
		
		
	}
}
