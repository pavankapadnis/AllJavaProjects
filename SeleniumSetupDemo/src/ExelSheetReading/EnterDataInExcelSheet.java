package ExelSheetReading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class EnterDataInExcelSheet {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("F:\\Selenium Html\\newexcel1.xls");
		
		HSSFWorkbook work = new HSSFWorkbook();
		
		HSSFSheet sheet1 = work.createSheet("Sheet1");
		
		HSSFSheet sheet2 = work.createSheet("Sheet2");
		
		for(int i = 0; i<5; i++) {
			
			HSSFRow row1 = sheet1.createRow(i);
			
			HSSFRow row2 = sheet2.createRow(i);
			
			for(int j = 0; j<5; j++) {
				
				row1.createCell(j).setCellValue("Sheet 1 Cell Value "+i+" * "+j);
				
				row2.createCell(j).setCellValue("Sheet 2 cell value "+i+" * "+j);
			}
			
		}
		
		work.write(file);
		
		file.close();
		
	}

}
