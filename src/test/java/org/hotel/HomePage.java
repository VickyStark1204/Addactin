package org.hotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomePage extends Login {

	static WebDriver driver;
	 
	@Test
	private void location() {
		
		Select S = new Select(driver.findElement(By.xpath("//select[@id='location']")));
		S.selectByVisibleText("London");
	}
	@Test
	private void hotels() {
		Select Hotel = new Select(driver.findElement(By.xpath("//select[@id='hotels']")));
		Hotel.selectByVisibleText("Hotel Sunshine");
	}
	@Test
	private void roomType() {
		Select Room = new Select(driver.findElement(By.xpath("//select[@id='room_type']")));
		Room.selectByVisibleText("Super Deluxe");
	}
	@Test
	private void roomNumber() {
		Select RNum = new Select(driver.findElement(By.xpath("//select[@id='room_nos']")));
		RNum.selectByVisibleText("1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	private void checkIn() {
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("12/04/2022");

	}
	@Test
	private void checkOut() {
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("18/04/2022");
	}
	@Test
	private void adultRoom() {
		Select Adult = new Select(driver.findElement(By.xpath("//select[@id='adult_room']")));
		Adult.selectByIndex(1);
	}
	@Test
	private void childRoom() {
		Select Child = new Select(driver.findElement(By.xpath("//select[@id='child_room']]")));
		Child.selectByIndex(0);
	}
	@Test
	private void btnClick() {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
	}
	
	}


