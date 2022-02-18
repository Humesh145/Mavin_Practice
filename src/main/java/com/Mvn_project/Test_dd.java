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

public class Test_dd {
	
	public static void Data() throws Throwable {
		File a = new File("C:\\Users\\Humesh\\eclipse-workspace\\Mvn_project\\Excel\\Book1.xlsx");
		
		FileInputStream b = new FileInputStream(a);
		
		Workbook w = new XSSFWorkbook(b);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(0);
		
		CellType ct = cell.getCellType();
		
		if (ct.equals(CellType.STRING)) {
			
			String scv = cell.getStringCellValue();
			
			System.out.println(scv);
		}
		else if (ct.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
			int ncv1 = (int) ncv;
			System.out.println(ncv1);
							
		}
		
		w.close();

	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		Data();
		System.out.println("*****All data****");
		Multiple_DD();

	}
	
	
	public static void Multiple_DD() throws Throwable {
		File aa = new File("C:\\Users\\Humesh\\eclipse-workspace\\Mvn_project\\Excel\\Book1.xlsx");
		
		FileInputStream bb = new FileInputStream(aa);
		
		Workbook ww = new XSSFWorkbook(bb);
		
		Sheet sheetAt1 = ww.getSheetAt(0);
		
		
		for (int i = 0; i < sheetAt1.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheetAt1.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				CellType ct = cell.getCellType();
				
				if (ct.equals(CellType.STRING)) {
					
					String scv = cell.getStringCellValue();
					
					System.out.println(scv);
				}
				else if (ct.equals(CellType.NUMERIC)) {
					double ncv = cell.getNumericCellValue();
					int ncv1 = (int) ncv;
					System.out.println(ncv1);
									
				}
				ww.close();
				
			}
			
		}
	

	}

}
