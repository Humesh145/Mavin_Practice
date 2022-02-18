package Pom_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Adactin_Pom_Signin {
	
	
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement signin;
	public WebElement getSignin() {
		return signin;
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	private WebDriver driver; 
	
	public Adactin_Pom_Signin(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver, this);
	}
	

	}
