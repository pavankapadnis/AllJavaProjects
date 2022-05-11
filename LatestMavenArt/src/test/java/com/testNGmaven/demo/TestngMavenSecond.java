package com.testNGmaven.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.BeforeSuite;

public class TestngMavenSecond {
	
	@BeforeSuite
	public static ArrayList<String[]> readExcelSheet() throws IOException {
		
		List<String[]> exdata = new ArrayList<String[]>();
		FileInputStream file = new FileInputStream("F:\\ExampleExcel.xls");
		HSSFWorkbook work = new HSSFWorkbook(file);
		HSSFSheet sheet = work.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		System.out.println(row);
		int col = sheet.getRow(0).getLastCellNum();
		
		for(int i = 1; i<5; i++) {
			
			String fname = sheet.getRow(i).getCell(1).getStringCellValue();
			String lname = sheet.getRow(i).getCell(2).getStringCellValue();
			String gender = sheet.getRow(i).getCell(3).getStringCellValue();
			String country = sheet.getRow(i).getCell(4).getStringCellValue();
			String age = String.valueOf( sheet.getRow(i).getCell(5).getNumericCellValue());
			String dates = sheet.getRow(i).getCell(6).getStringCellValue();
			String emid = String.valueOf( sheet.getRow(i).getCell(7).getNumericCellValue());
			
			String [] values = {fname,lname,gender,country,age,dates,emid};
			
			exdata.add(values);
			
		}
		
		return (ArrayList<String[]>) exdata;
		
	}
}
