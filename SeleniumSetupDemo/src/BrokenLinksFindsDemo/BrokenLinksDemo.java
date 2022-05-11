package BrokenLinksFindsDemo;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are present in this page = "+links.size());
		
		for(int i=0; i<links.size(); i++) {
			
			WebElement element = links.get(i);
			
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection urlcon = (HttpURLConnection) link.openConnection();
			
			urlcon.connect();
			
			int rescode = urlcon.getResponseCode();
			
			if(rescode<=400) {
				
				System.out.println(url+" = Broken Links");
			}
			else {
				
				System.out.println(url+" = Valid Link");
			}
			
		}
		
		driver.close();
		
		
	}

}
