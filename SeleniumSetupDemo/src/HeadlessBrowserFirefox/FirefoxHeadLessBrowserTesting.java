package HeadlessBrowserFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadLessBrowserTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\A_java\\Jar Files\\geckodriver.exe");
		
		FirefoxOptions option = new FirefoxOptions();
		
		option.setHeadless(true);

		WebDriver driver = new FirefoxDriver(option);
		
		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
