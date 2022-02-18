package Pom_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom_Select_Hotel {

	
		private WebDriver driver;
		
		public Adactin_Pom_Select_Hotel(WebDriver driver1) {
			this.driver = driver1;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath="//input[@id='radiobutton_0']")
		private WebElement Radio_button;
		
		@FindBy (xpath="//input[@id='continue']")
		private WebElement Continue;

		public WebElement getRadio_button() {
			return Radio_button;
		}

		public WebElement getContinue() {
			return Continue;
		}
		

	

}
