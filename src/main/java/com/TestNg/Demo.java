package com.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	
	@BeforeMethod
	private void browserlanch() {
System.out.println("browserlanch");


	}
	
	@AfterMethod
	
	private void browserclose() {
		System.out.println("browserclose");


			}
	
	
	@Test
	private void women() {
		System.out.println("Women");

	}
	
	@Test
	private void men() {
		System.out.println("men");

	}
	
	
	@Test
	private void child() {
		System.out.println("child");

	}

}
