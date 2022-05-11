package HeadLessBrowserChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadLessBrowserTesting {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		option.setHeadless(true);

		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	}

}
