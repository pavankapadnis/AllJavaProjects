package DropdownListSortedOrNot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownListSortedOrNor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@name='products']"));
		
		Select se = new Select(element);
		
		List origlist = new ArrayList();
		List templist = new ArrayList();
		
		List<WebElement> options = se.getOptions();
		
		for(WebElement e:options) {
			origlist.add(e.getText());
			templist.add(e.getText());
		}
		
		System.out.println("Before sorting both list \n");
		
		System.out.println(origlist);
		
		System.out.println();
		
		System.out.println(templist);
		
		System.out.println();
		
		System.out.println("After Sorting Boyh list \n");
		
		templist.sort(null);
		
		System.out.println(origlist);
		
		System.out.println(templist);
		
		if(origlist==templist) {
			System.out.println("Dropdown List are sorted");
		}else {
			
			System.out.println("Dropdown List are Not sorted");
		}
		
		driver.close();
		
		
	}

}
