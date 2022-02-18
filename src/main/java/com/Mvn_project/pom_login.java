package com.Mvn_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_login {

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

	public pom_login(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}


	
}
