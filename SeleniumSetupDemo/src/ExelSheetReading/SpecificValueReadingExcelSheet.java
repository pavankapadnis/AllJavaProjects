package ExelSheetReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SpecificValueReadingExcelSheet {

	public static void main(String[] args) throws IOException {
		
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
			System.out.print(id+"  ");
			
			String fname = curntrow.getCell(1).getStringCellValue();
			System.out.print(fname+"  ");
			
			String lname = curntrow.getCell(2).getStringCellValue();
			System.out.print(lname+"  ");
			
			String gender = curntrow.getCell(3).getStringCellValue();
			System.out.print(gender+"  ");
			
			String country = curntrow.getCell(4).getStringCellValue();
			System.out.print(country+"  ");
			
			int age = (int)curntrow.getCell(5).getNumericCellValue();
			System.out.print(age+"  ");
			
			String date = curntrow.getCell(6).getStringCellValue();
			System.out.print(date+"  ");
			
			int Employid = (int)curntrow.getCell(7).getNumericCellValue();
			System.out.print(Employid+"  ");
			
			System.out.println();
		}
		
		
		
		
	}

}
