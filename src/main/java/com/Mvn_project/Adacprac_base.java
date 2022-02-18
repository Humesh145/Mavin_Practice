package com.Mvn_project;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adacprac_base {

	public static WebDriver driver;
	public static WebDriver browserlaunch(String name) {
		
		
		
		
		
		if (name.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Driver//chromedriver.exe");
		
			driver = new ChromeDriver();
			
		}
		
		return driver;
	}
	
	public static void close() {
	driver.close();
	
	

	}
		
	public static void quit() {
		driver.quit();

	}
		
	public static void navigateto(String S) {
		driver.navigate().to(S);
		
			
	}

	public static void navigate(String b) {
		
	
	if (b.equalsIgnoreCase ("back")) {
		driver.navigate().back();
	}

	else if (b.equalsIgnoreCase("forward")) {
		driver.navigate().forward();
		
	}
	
	else if (b.equalsIgnoreCase ("refresh:")) {
		driver.navigate().refresh();
	}
	
    	
	}
	
	public static void get(String g) {
		driver.get(g);
	}

	public static void alert(String ab) {
		if (ab.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
			
		}
		
		else if (ab.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}

 public static void sendkey(String sk) {
	 driver.switchTo().alert().sendKeys(sk);
	 
	
	 
}





}

















	









