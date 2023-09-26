package com.utils;

import java.io.File; 
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class signuputils {
	
	 @DataProvider
	 
		public  String [][] signupdata() throws Exception {
		File file=new File("./src/main/java/com/testdata/newaddress.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(stream);
		XSSFSheet sheet=book.getSheetAt(0);
		int rows=sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(1).getLastCellNum();
		String [][]data=new String [rows-1][columns];
		
		for(int i=0;i<rows-1;i++) {
			
		for(int j=0;j<columns;j++) {
			DataFormatter df=new DataFormatter();
			data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			
		}
			
		}
		
		return data;
			
		}
		

}
