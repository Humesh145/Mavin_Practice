package com.Mvn_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_DD {
	
	public static void write_dd() throws Throwable {
		
		File f = new File("C:\\Users\\Humesh\\OneDrive\\Desktop\\write_dd.xlsx");
		
		FileInputStream fs = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fs);
		
		w.getSheet("Data").createRow(0).createCell(0).setCellValue("Username");
		w.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
		w.getSheet("Data").createRow(1).createCell(0).setCellValue("humesh");
		w.getSheet("Data").getRow(1).createCell(1).setCellValue("Password");
		
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		w.close();
		
		System.out.println("Sucuessfuly updated");
		

	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		write_dd();
	}

}
