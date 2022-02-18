package com.Mvn_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datad {

	public static void main(String[] args) throws Throwable {
		
		System.out.println("***cell data");
		Row_DD();
		System.out.println("***row data");
		cell_dd();
	}
		public static void Row_DD() throws Throwable {
			File aa = new File("C:\\Users\\Humesh\\eclipse-workspace\\Mvn_project\\Excel\\Book1.xlsx");
			
			FileInputStream bb = new FileInputStream(aa);
			
			Workbook ww = new XSSFWorkbook(bb);
			
			Sheet sheetAt1 = ww.getSheetAt(0);
			
			
			for (int i = 0; i < sheetAt1.getPhysicalNumberOfRows(); i++) {
				
				Row row = sheetAt1.getRow(i);
				
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
					
					
				}
				ww.close();
				
				
				

	}
		
		public static  void cell_dd() throws IOException {
File aa = new File("C:\\Users\\Humesh\\eclipse-workspace\\Mvn_project\\Excel\\Book1.xlsx");
			
			FileInputStream bb = new FileInputStream(aa);
			
			Workbook ww = new XSSFWorkbook(bb);
			
			Sheet sheetAt1 = ww.getSheetAt(0);
			
			
			
				
				Row row = sheetAt1.getRow(0);
				for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
				
					Cell cell = row.getCell(i);
					
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
					
					
				}
				ww.close();
				
				

		}

		}
