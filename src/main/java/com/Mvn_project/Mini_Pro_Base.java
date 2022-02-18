package com.Mvn_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Pro_Base {

	public static WebDriver driver;
	
	public static WebDriver browserlanch(String name) {
		// TODO Auto-generated method stub
		
		if (name.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");	
				
				//System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				
				
				//"C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");				
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
	}
		return driver;}
	
	public static void elementClick(WebElement element) {
		
		element.click();

	}
	
	public static void inputvalue(WebElement element,String value) {
		
		element.sendKeys(value);

	}
	
	public static void getUrl(String url) {
		
    driver.get(url);
	}
	
	public static void screenShot(String location) throws Throwable {
		
		TakesScreenshot af = (TakesScreenshot) driver;
		File ag = af.getScreenshotAs(OutputType.FILE);
		File ah = new File(location);
		FileUtils.copyFile(ag, ah);
		

	}
	

}
