package SelfHtml.CheckDropDownListSortedOrNot;

import java.util.ArrayList;
import java.awt.AWTException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownListSortedOrNot {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("file:///F:/Selenium%20Html/ExcelSheetValueInForm.html");
		
		driver.manage().window().maximize();
		
		WebElement elem = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select se = new Select(elem);
		
		List<WebElement> options = se.getOptions();
		
		List originalList = new ArrayList();
		
		List tempList = new ArrayList();
		
		for(WebElement e: options) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		
		
		System.out.println(originalList+"\n");
		
		System.out.println(tempList+"\n");
		
		if(originalList==tempList) {
			System.out.println("DropDown List Are Sorted");
		}else {
			
			System.out.println("DropDown List Are Not Sorted");
		}
		
		driver.close();
		
		
		
		
	}

}
