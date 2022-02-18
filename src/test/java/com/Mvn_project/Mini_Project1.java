package com.Mvn_project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project1 extends Mini_Pro_Base {

	public static void main(String[] args, Object getSignin) throws Throwable  {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();*/
		
		browserlanch("Chrome");
		
		getUrl("http://automationpractice.com/index.php");
		
		pom_login a = new pom_login(driver);

		//driver.get("http://automationpractice.com/index.php");
		
		//WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		elementClick(a.getSignin());
		
		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		inputvalue(email, "mpini@iurruewr.com");
		
		WebElement pasw = driver.findElement(By.id("passwd"));
		pasw.sendKeys("Poda@123");		
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		elementClick(submit);
		
		
		WebElement u = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		elementClick(u);

		WebElement v = driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
		elementClick(v);

		//span[text()= 'Add to cart']
		

		WebElement x = driver.findElement(By.xpath("//span[text()= 'Add to cart']"));
		elementClick(x);

		//a[@title= 'Proceed to checkout']

		Thread.sleep(5000);


		WebElement y = driver.findElement(By.xpath("//a[@title= 'Proceed to checkout']"));
		elementClick(y);
		
		Thread.sleep(3000);		



		//a[@title= 'Proceed to checkout'])[2]


		WebElement z = driver.findElement(By.xpath("(//a[@title= 'Proceed to checkout'])[2]"));
		elementClick(z);

		//button[@type='submit'])[2]
				
				WebElement aa = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				elementClick(aa);
				
				//input[@type='checkbox']
				
				WebElement ab = driver.findElement(By.xpath("//input[@type='checkbox']"));
				elementClick(ab);
				
				
						
						WebElement ac = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
						elementClick(ac);
				
						//a[ @title= 'Pay by bank wire']
						Thread.sleep(2000);
				
						WebElement ad = driver.findElement(By.xpath("//a[@class='bankwire']"));
						elementClick(ad);
						
						//button[ @type= 'submit'])[2]
												
						Thread.sleep(2000);
								
								WebElement ae = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
								elementClick(ae);
								
								TakesScreenshot af = (TakesScreenshot) driver;
								File ag = af.getScreenshotAs(OutputType.FILE);
								File ah = new File("C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Screenshot\\Snap.png");
								FileUtils.copyFile(ag, ah);
												
driver.close();

			}

		
	}

