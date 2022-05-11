package ExelSheetReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelSheetReadingDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("F:\\ExampleExcel.xls");
		
		HSSFWorkbook work = new HSSFWorkbook(file);
		
		HSSFSheet sheet = work.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		int cell = sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<=rowcount; i++) {
			
			HSSFRow row = sheet.getRow(i);
			

			for(int j =0;j<cell;j++) {
				
				String value = row.getCell(j).toString();
				
				System.out.print(value+"         ");
			}
			
			System.out.println();
		}
		
		
	}

}
