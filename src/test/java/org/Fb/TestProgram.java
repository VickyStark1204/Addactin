package org.Fb;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestProgram {
	
	static WebDriver driver;
	
	@BeforeSuite
	private void beforesuit() {
		System.out.println("Before Suit");
	}
	@AfterSuite
	private void afterSuit() {
		System.out.println("afterSuit");
	}
	@BeforeTest
	private void beforetest() {
		System.out.println("Before Test");
	}
	@AfterTest
	private void afterTest() {
		System.out.println("AfterTest");
	}
	@BeforeClass
	private void beforeclass() {
		System.out.println("BeforClass");
	}
	@AfterClass
	private void afterclass() {
		System.out.println("After class");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("AfterMethod");
	}
@Test
	private void test() {
		System.out.println("TestScript");
	}
}
