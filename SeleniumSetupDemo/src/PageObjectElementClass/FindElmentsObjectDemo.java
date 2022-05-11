package PageObjectElementClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElmentsObjectDemo {

	WebDriver driver = null;

	public WebElement enterFname(WebDriver driver) {

		this.driver = driver;
		WebElement fname = driver.findElement(By.name("fname"));
		return fname;

	}

	public WebElement enterlname(WebDriver driver) {

		this.driver = driver;
		WebElement lname = driver.findElement(By.name("lname"));
		return lname;

	}

	public WebElement enterGender(WebDriver driver) {

		this.driver = driver;
		WebElement gender = driver.findElement(By.id("male"));
		return gender;

	}
	
	public WebElement enterDate(WebDriver driver) {

		this.driver = driver;
		WebElement date = driver.findElement(By.name("date"));
		return date;

	}
	
	public WebElement enterImgae(WebDriver driver) {

		this.driver = driver;
		WebElement image = driver.findElement(By.name("filename"));
		return image;

	}

	public static void main(String[] args) {

	}

}
