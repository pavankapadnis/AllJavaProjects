package HeadlessBrowserFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefoxPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\A_java\\Jar Files\\geckodriver.exe");
		
		FirefoxOptions option = new FirefoxOptions();
		
		option.setHeadless(true);
		
		WebDriver driver = new FirefoxDriver(option);
		
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		String source = driver.getPageSource();
		
		boolean example = source.contains("WebTable Example");
		
		
		if(example == true) {
			System.out.println("Test case 01 is Passed");
		}else{
			System.out.println("Test Case 01 is Failed");
		}
		
		
		
		
	}

}
