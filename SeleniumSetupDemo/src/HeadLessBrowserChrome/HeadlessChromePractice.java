package HeadLessBrowserChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromePractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		//option.setHeadless(true); <-- Instead of this line we can use following line Also.
		
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		String source = driver.getPageSource();
		
		boolean example = source.contains("WebTable Example");
		
		if(example==true) {
			System.out.println("Test case 01 is passed");
		}else {
			System.out.println("Test case 01 is Failed");
		}
		
	}

}
