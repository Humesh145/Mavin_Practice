package com.Mvn_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_base {

	static String value;

		public static WebDriver driver;
		
		public static WebDriver browserlanch(String name) {
			// TODO Auto-generated method stub
			
			if (name.equalsIgnoreCase("chrome")) {
				
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
					
					
					//"C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
					
					//"C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");	
					
					//System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
					
					
					//"C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");				
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			
						
		}
			return driver; }
		
		public static void select(String type , String data , WebElement element) {
			
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("Index")) {
			
			int value = Integer.parseInt(data);
			s.selectByIndex(value);
			
			
		} else if (type.equalsIgnoreCase("byValue")) {
			
			s.selectByValue(data);
			
		} else if (type.equalsIgnoreCase("byvisibletext")) {
			
			s.selectByVisibleText(data);		
			
			
		} 
		

		}
			

	
		
		public static void elementClick(WebElement element) {
			
			element.click();

		}
		
		public static void inputvalue(WebElement element,String value) {
			
			element.sendKeys(value);

		}
		
		public static void getUrl(String url) {
			
	    driver.get(url);
		}
		
		
		public static void screenShot(String Location) throws Throwable {
			
			TakesScreenshot af = (TakesScreenshot) driver;
			File ag = af.getScreenshotAs(OutputType.FILE);
			File ah = new File(Location);
			FileUtils.copyFile(ag, ah);
			//"C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Screenshot\\Snap1.png"
			
			
					

		}
		
		public static String particular_Data(String path , int Row_Index , int Cell_Index) throws Throwable {
			
			
			File f = new File(path);
			
			FileInputStream fi = new FileInputStream(f);
			
			Workbook b = new XSSFWorkbook(fi);
			
			Sheet sheetAt = b.getSheetAt(0);
			
			Row row = sheetAt.getRow(Row_Index);
			
			Cell cell = row.getCell(Cell_Index);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)){
				
				 value = cell.getStringCellValue();
							
			}
			else if (cellType.equals(CellType.NUMERIC))	{
				double ncv = cell.getNumericCellValue();
				int a= (int) ncv;
				value = String.valueOf(a);
			}
			
			return value;
			
			

		}
	}

