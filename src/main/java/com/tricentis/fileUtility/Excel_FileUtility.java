package com.tricentis.fileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_FileUtility {

	public String getDataFromExcel(String sheetName,int rowNum,int celNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./TestData/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data =wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
		wb.close();
	    return data;	
	}
	 public int getRowCount(String sheetName) throws Throwable, IOException 
	 {
		 FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 int rowCount=wb.getSheet(sheetName).getLastRowNum();
		 wb.close();
		 return rowCount;
	 }
	 public void writeDataBackToExcel(String sheetName,int rowNum,int celNum,String data) throws Throwable
	 {
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(celNum);
		
		FileOutputStream fos= new FileOutputStream("./testData/TestData.xlsx");
		wb.write(fos);
		wb.close();
	 }
}
