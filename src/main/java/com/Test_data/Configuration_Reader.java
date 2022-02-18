package com.Test_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\Humesh\\eclipse-workspace\\Mvn_project\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
					
	}

	public String get_Url_Data() {
		
		String url = p.getProperty("url");
		
		return url;		
		
	}	
	
	public String get_Username() {

		String username = p.getProperty("Username");
		 
		return username;	

	}
	
	public String get_password() {
		
    String password = p.getProperty("password");
		
		return password;	
		

	}
	
	public String get_Location() {
   String location = p.getProperty("location");
		
		return location;	

	}
	
	
	
	
}
