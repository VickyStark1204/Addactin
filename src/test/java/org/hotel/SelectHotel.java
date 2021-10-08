package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SelectHotel {
	static WebDriver driver;
	
	@Test
	private void selectHotel() {
		driver.findElement(By.id("//input[@id='radiobutton_0']")).click();
	}
	@Test
	private void submit() {
		driver.findElement(By.id("continue")).click();
		
	}
	
	

}
