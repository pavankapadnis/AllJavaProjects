package ExelSheetReading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableValueAddIntoExcelSheet {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		driver.manage().window().maximize();
		
		FileOutputStream file = new FileOutputStream("F:\\Selenium Html\\ValueFromWebTable.xls");
		
		HSSFWorkbook work = new HSSFWorkbook();
		
		HSSFSheet sheet = work.createSheet("Sheet1");
		
		for(int i = 2; i<8; i++) {
			
			HSSFRow row = sheet.createRow(i);
			
			for(int j = 1; j<=2; j++) {
				
				String value = driver.findElement(By.xpath("//table[@class='tg']//child::tr["+i+"]//child::td["+j+"]")).getText();
				
				row.createCell(j).setCellValue(value);
				
			}
			
		}
		
		work.write(file);
		
		file.close();
		
	}

}
