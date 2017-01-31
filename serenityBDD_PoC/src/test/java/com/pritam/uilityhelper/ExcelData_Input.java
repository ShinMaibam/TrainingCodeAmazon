package com.pritam.uilityhelper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData_Input {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;
	static String filename = "C:\\Users\\Hayabusa\\Documents\\Serenity Selenium Automation\\ExcelData\\myTestData.xlsx";
	public static Vector cellvectorholder= new Vector();
	
	public static Vector readXLSXFile() throws IOException{
		fis=new FileInputStream(filename);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("myData");
		
		Iterator rowIter=sheet.rowIterator();
		while(rowIter.hasNext())
		{
			row=(XSSFRow) rowIter.next();
			Vector cellStoreVector=new Vector();
			cell=row.getCell(1); //Define desire column index here
			cellStoreVector.addElement(cell);
			cellvectorholder.addElement(cellStoreVector);			
		}
		return cellvectorholder;	
	}
	
	public static Vector readXLSXFile_AllColumn() throws IOException{
		fis=new FileInputStream(filename);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("myData");
		
		Iterator rowIter=sheet.rowIterator();
		while(rowIter.hasNext())
		{
			row=(XSSFRow) rowIter.next();
			Vector cellStoreVector=new Vector();
			Iterator cellIter = row.cellIterator();
			while (cellIter.hasNext())
			{
				cell=(XSSFCell) cellIter.next();
				cellStoreVector.addElement(cell);
				cellvectorholder.addElement(cellStoreVector);			
				/*if(cell.getCellType()== XSSFCell.CELL_TYPE_STRING)
				{
					System.out.println(cell.getStringCellValue()+ " ");
				}else if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
				{
					System.out.println(cell.getNumericCellValue()+" ");
				}*/	
			}
			//System.out.println();			
		}
		return cellvectorholder;			
	}
	
	
	
}
