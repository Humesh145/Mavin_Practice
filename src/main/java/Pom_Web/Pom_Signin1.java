package Pom_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Signin1 {
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;
	private WebDriver driver;

	public WebElement getSignin() {
		return signin;
	}
	
	/*public pom_login(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/

	public Pom_Signin1(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

}
