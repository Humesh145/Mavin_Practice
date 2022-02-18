package com.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_Priority {
	
	@BeforeMethod
	private void browserlanch() {
System.out.println("browserlanch");


	}
	
	@AfterMethod
	
	private void browserclose() {
		System.out.println("browserclose");


			}
	
	
	@Test(priority = -3 , invocationCount = 2)
	private void women() {
		System.out.println("Women");

	}
	
	@Test(priority = -2)
	private void men() {
		System.out.println("men");

	}
	
	
	@Test(priority = -1)
	private void child() {
		System.out.println("child");

	}



}
