package com.utils;

import java.io.File; 
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.Base.Testbase;

public class sognup2tUtils extends Testbase{
	
	private static final String filepath="./src/main/java/com/testdata/equarzFile.xlsx";
	
	 @DataProvider
	 
		public static String [][] signupdata(String sheetName) throws Exception {
		File file=new File(filepath);
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(stream);
		XSSFSheet sheet=book.getSheet(sheetName);
		
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
