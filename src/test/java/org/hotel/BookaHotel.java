package org.hotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BookaHotel extends SelectHotel {

	static WebDriver driver;

	@Test
	private void firstName() {
		driver.findElement(By.id("first_name")).sendKeys("Vicky");
	}

	@Test
	private void lastName() {
		driver.findElement(By.id("last_name")).sendKeys("Vicky@12");
	}
	@Test
	private void address() {
		driver.findElement(By.id("address")).sendKeys("Vellore");
	}
	@Test
	private void creditCard() {
		driver.findElement(By.id("cc_num")).sendKeys("1232 3231 2123 1232");
	}
	@Test
	private void ccType() {
		Select S1 = new Select(driver.findElement(By.id("cc_type")));
		S1.selectByIndex(2);
	}
	@Test
	private void month() {
		Select S1 = new Select(driver.findElement(By.id("cc_exp_month")));
		S1.selectByIndex(2);
	}
	@Test
	private void year() {
		Select S1 = new Select(driver.findElement(By.id("cc_exp_year")));
		S1.selectByIndex(2);
	}
	@Test
	private void ccv() {
		driver.findElement(By.id("cc_cvv")).sendKeys("212");
	}
	@Test
	private void btnbook() {
		driver.findElement(By.id("book_now")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
