package ExelSheetReading;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillingUsingExcelSheetValues {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("file:///F:/Selenium%20Html/ExcelSheetValueInForm.html");
		
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("F:\\ExampleExcel.xls");
		
		HSSFWorkbook work = new HSSFWorkbook(file);
		
		HSSFSheet sheet = work.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		//System.out.println(rowcount);
		
		int cell = sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<=rowcount; i++) {
			
			HSSFRow row = sheet.getRow(i);
			
			HSSFRow curntrow = sheet.getRow(i);
			
			int id = (int)curntrow.getCell(0).getNumericCellValue();
			
			String fname = curntrow.getCell(1).getStringCellValue();
			driver.findElement(By.name("fname")).sendKeys(fname);
			
			
			String lname = curntrow.getCell(2).getStringCellValue();
			driver.findElement(By.id("lname")).sendKeys(lname);
			
			
			String gender = curntrow.getCell(3).getStringCellValue();
			if(gender.equalsIgnoreCase("male")) {
				driver.findElement(By.id("male")).click();
			}else if(gender.equalsIgnoreCase("female")) {
				driver.findElement(By.id("female")).click();
			}
			
			
			String country = curntrow.getCell(4).getStringCellValue();
			WebElement contr = driver.findElement(By.name("country"));
			Select select = new Select(contr);
			select.selectByVisibleText(country);
			
			
			int age = (int)curntrow.getCell(5).getNumericCellValue();
			driver.findElement(By.name("age")).sendKeys(String.valueOf(age));
			
			
			String date = curntrow.getCell(6).getStringCellValue();
			driver.findElement(By.id("date")).sendKeys(date);
			
			
			int Employid = (int)curntrow.getCell(7).getNumericCellValue();
			driver.findElement(By.name("emid")).sendKeys(String.valueOf(Employid));
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@type='reset']")).click();
			Thread.sleep(1000);
			
			System.out.println("Successful Submit Form At "+i);
			
			
		}
		
		driver.close();
		
		
	}

}
