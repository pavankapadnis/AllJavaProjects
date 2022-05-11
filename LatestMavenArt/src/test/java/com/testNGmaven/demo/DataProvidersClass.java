package com.testNGmaven.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.testng.annotations.DataProvider;

public class DataProvidersClass {
	
	
	@DataProvider(name="Excel Data")
	public static Iterator<String[]>  getData() throws IOException {
		ArrayList<String[]> sendData = TestngMavenSecond.readExcelSheet();
		return sendData.iterator();
	}
}
