package com.qa.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellLib {
public String getExcelData(String sheet, int row, int cell) throws Exception{
	FileInputStream fis=new FileInputStream("./src/main/resources/testData/testData.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
public void setExcelData(String sheet,int row, int cell, String data) throws Exception{
	FileInputStream fis=new FileInputStream("./src/main/resources/testData/testData.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./testData.xlsx");
	wb.write(fos);
	wb.close();
}
}
