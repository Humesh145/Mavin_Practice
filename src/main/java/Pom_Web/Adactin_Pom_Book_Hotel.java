package Pom_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom_Book_Hotel {
	
private WebDriver driver; 
	
	public Adactin_Pom_Book_Hotel(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//input[@id='first_name']")
	private WebElement first_name;
	
	@FindBy (xpath="//input[@id='last_name']")
	private WebElement last_name;
	
	@FindBy (xpath="//textarea[@id='address']")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}

	@FindBy (xpath="//input[@id='cc_num']")
	private WebElement cc_details;
	
	@FindBy (xpath="//select[@id='cc_type']")
	private WebElement cc_type;
	
	@FindBy (xpath="//select[@id='cc_exp_month']")
	private WebElement cc_exp_month;
	
	@FindBy (xpath="//select[@id='cc_exp_year']")
	private WebElement cc_exp_year;
	
	@FindBy (xpath="//input[@id='cc_cvv']")
	private WebElement cc_cvv;
	
	@FindBy (xpath="//input[@id='book_now']")
	private WebElement book_now;
	
	@FindBy (xpath="//input[@id='my_itinerary']")
	private WebElement my_itinerary;
	
	

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getCc_details() {
		return cc_details;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	
	
	
	
}
