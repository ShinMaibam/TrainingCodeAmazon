package com.pritam.uilityhelper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingIntoExcel {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileOutputStream fos;
	static String filename = "C:\\Users\\Hayabusa\\Documents\\Serenity Selenium Automation\\ExcelData\\myTestOutput.xlsx";
	static String sheetName = "Output";
	static ExcelData_Input exceldata=new ExcelData_Input();
	
	public static void main(String[] args) throws IOException{
		fos=new FileOutputStream(filename);
		wb=new XSSFWorkbook();
		sheet=wb.createSheet(sheetName);
		Vector dataHolder=exceldata.readXLSXFile();
		for (int i=0; i<dataHolder.size(); i++)
		{
			Vector cellStoreVector=(Vector)dataHolder.elementAt(i);
			row=sheet.createRow(i);
			for (int j=0; j<cellStoreVector.size(); j++)
			{
				cell=(XSSFCell) cellStoreVector.elementAt(j);
				String stringcellVal=cell.toString();
				int val = Integer.valueOf(stringcellVal);
				if(val <= 102)
				{
					cell=row.createCell(0);
					cell.setCellValue(stringcellVal);
					cell=row.createCell(1);
					cell.setCellValue("LESS or EQUAL");
				}else
				{
					cell=row.createCell(0);
					cell.setCellValue(stringcellVal);
					cell=row.createCell(1);
					cell.setCellValue("MORE");
				}				
			}
		}
		wb.write(fos);
		fos.close();
		System.out.println("Output excel is created with validationd data!!");
	}
	
	
	
	

}
