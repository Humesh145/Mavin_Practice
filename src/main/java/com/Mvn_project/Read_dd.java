package com.Mvn_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_dd {
	
	public static void read() throws Throwable {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Humesh\\eclipse-workspace\\Mvn_project\\Excel\\Book1.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook b = new XSSFWorkbook(fi);
		
		Sheet sheetAt = b.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(1);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)){
			
			String scv = cell.getStringCellValue();
				
			System.out.println(scv);		
		}
		else if (cellType.equals(CellType.NUMERIC))	{
			double ncv = cell.getNumericCellValue();
			int a= (int) ncv;
			System.out.println(a);
		}
		
		b.close();

	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		read();
	}

}
