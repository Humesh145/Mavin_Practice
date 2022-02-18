package Pom_Web;

import org.openqa.selenium.WebDriver;

public class Ada_Page_Object_Manager {
	
	public WebDriver driver;
	
	private Adactin_Pom_Signin login ;
	
	private Adactin_Pom_Search_Hotel search_Hotel;
	
	private Adactin_Pom_Select_Hotel selectHotel;
	
	private Adactin_Pom_Book_Hotel Book_Hotel;
	
	public Ada_Page_Object_Manager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public Adactin_Pom_Signin getInstanceLogin() {
		if (login == null) {
			
			login = new Adactin_Pom_Signin(driver);
			
		}
        return login;
	}
		
	
	public Adactin_Pom_Search_Hotel getInstanceSearchHotel() {
		if (search_Hotel == null) {
			
			search_Hotel = new Adactin_Pom_Search_Hotel(driver);
			
		}
		return search_Hotel;
	}
	
	public Adactin_Pom_Select_Hotel getInstanceselectHotel() {
		
		if (selectHotel == null) {
			
		selectHotel = new Adactin_Pom_Select_Hotel(driver);
		
		}
		
		return selectHotel;

	}
	
	public Adactin_Pom_Book_Hotel getInstanceBook_Hotel() {
		if (Book_Hotel == null) {
			
			Book_Hotel = new Adactin_Pom_Book_Hotel(driver);
						
		}
		
		return Book_Hotel;

	}
	
	
	
	
	
	
	
	
	

}
	