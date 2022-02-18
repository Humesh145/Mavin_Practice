package com.Mvn_project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.Test_data.File_Reader_Manager;

import Pom_Web.Ada_Page_Object_Manager;

public class Adactin_mini extends Adactin_base {
	
    public static WebDriver driver = Adactin_base.browserlanch("Chrome");
	
	static Logger log = Logger.getLogger(Adactin_mini.class);

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//Adactin_Pom_Signin aa= new Adactin_Pom_Signin(driver);
		//Adactin_Pom_Search_Hotel ab=new Adactin_Pom_Search_Hotel(driver);
		//Adactin_Pom_Select_Hotel ac=new Adactin_Pom_Select_Hotel(driver);
		//Adactin_Pom_Book_Hotel ad = new Adactin_Pom_Book_Hotel(driver);
		
		Ada_Page_Object_Manager pom = new Ada_Page_Object_Manager(driver);
		
		PropertyConfigurator.configure("log4j.properties");

		String url = File_Reader_Manager.getInstance_frm().getInstance_CR().get_Url_Data();
		getUrl(url);
		
		log.info("Browser Launch");
		
		
		//String us = particular_Data("C:\\Users\\Humesh\\OneDrive\\Desktop\\write_dd.xlsx", 0, 0);
		
		String us = File_Reader_Manager.getInstance_frm().getInstance_CR().get_Username();
		
		Thread.sleep(2000);
		//WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		inputvalue(pom.getInstanceLogin().getSignin(),us);
		
		//String Pwd = particular_Data("C:\\Users\\Humesh\\OneDrive\\Desktop\\write_dd.xlsx", 1, 0);		
		//WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		String Pwd = File_Reader_Manager.getInstance_frm().getInstance_CR().get_password();
		inputvalue(pom.getInstanceLogin().getPassword(), Pwd);
		
		//WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		elementClick(pom.getInstanceLogin().getLogin());
		
		log.info("Page loged in");
		
		//WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		select("byValue", "London", pom.getInstanceSearchHotel().getLocation());
		
		//WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		select("index", "1", pom.getInstanceSearchHotel().getHotels());
		
		//WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
		select("byvisibletext", "Double", pom.getInstanceSearchHotel().getRoom_type());
		
		//WebElement room_nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		select("index", "1", pom.getInstanceSearchHotel().getRoom_nos());
		
		//WebElement Check_in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		inputvalue(pom.getInstanceSearchHotel().getCheck_in(), "18/01/2022");
		
		//WebElement Check_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		inputvalue(pom.getInstanceSearchHotel().getCheck_out(), "18/01/2022");
		
		//WebElement Adult_count = driver.findElement(By.xpath("//select[@id='adult_room']"));
		select("index", "1", pom.getInstanceSearchHotel().getAdult_room());
		
		//WebElement Child_count = driver.findElement(By.xpath("//select[@id='child_room']"));
		select("index", "1", pom.getInstanceSearchHotel().getChild_room());
		
		
		//WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		elementClick(pom.getInstanceSearchHotel().getSubmit());
		
		log.info("Search hotel completed");
		
		
		//WebElement Radio_button = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		elementClick(pom.getInstanceselectHotel().getRadio_button());
		
		//WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		elementClick(pom.getInstanceselectHotel().getContinue());	
		
		log.info("Acknowleage completed");
		
		//WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
		inputvalue(pom.getInstanceBook_Hotel().getFirst_name(), "Bhooba");
		
		//WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
		inputvalue(pom.getInstanceBook_Hotel().getLast_name(), "Bhooba");
		
		
		//WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		inputvalue(pom.getInstanceBook_Hotel().getAddress(), "Bhooba");
		
		//WebElement cc_details = driver.findElement(By.xpath("//input[@id='cc_num']"));
		inputvalue(pom.getInstanceBook_Hotel().getCc_details(), "1234567812345678");
		
		//WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		select("index", "1", pom.getInstanceBook_Hotel().getCc_type());
		
		
		//WebElement cc_exp_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		select("index", "6", pom.getInstanceBook_Hotel().getCc_exp_month());
		
		//WebElement cc_exp_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		select("byValue", "2021", pom.getInstanceBook_Hotel().getCc_exp_year());
		
		//WebElement cc_cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		inputvalue(pom.getInstanceBook_Hotel().getCc_cvv(), "021");
		
		//WebElement book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
		elementClick(pom.getInstanceBook_Hotel().getBook_now());
		
		Thread.sleep(5000);
		
		//WebElement my_itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		elementClick(pom.getInstanceBook_Hotel().getMy_itinerary());
		
		log.info("Hotel Booked");
		
		screenShot("C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Screenshot\\Snap10.png");
		
		log.info("Screenshoe sucessfully taken");
		
		driver.close();
		
		log.info("Driver ended");
		
	}

}
