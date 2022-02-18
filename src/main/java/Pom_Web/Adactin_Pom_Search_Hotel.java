package Pom_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom_Search_Hotel {
	
private WebDriver driver; 
	
	public Adactin_Pom_Search_Hotel(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy (xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy (xpath="//select[@id='room_type']")
	private WebElement room_type;
	
	@FindBy (xpath="//select[@id='room_nos']")
	private WebElement room_nos;
	
	@FindBy (xpath="//input[@id='datepick_in']")
	private WebElement Check_in;
	
	@FindBy (xpath="//input[@id='datepick_out']")
	private WebElement Check_out;
	
	@FindBy (xpath="//select[@id='adult_room']")
	private WebElement adult_room;
	
	@FindBy (xpath="//select[@id='child_room']")
	private WebElement child_room;
	
	@FindBy (xpath="//input[@id='Submit']")
	private WebElement Submit;

	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheck_in() {
		return Check_in;
	}

	public WebElement getCheck_out() {
		return Check_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	
	
	
	
	

}
