package AuthenticationPopUpHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		
		String source = driver.getPageSource();
		
		boolean ex = source.contains("Congratulations! You must have the proper credentials");
		
		if(ex==true) {
			System.out.println("Test Case 04 is Passed");
		}else {
			System.out.println("Test Case 04 is Failed");
		}
		
		driver.close();
		
	}

}
