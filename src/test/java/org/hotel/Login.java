package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	static WebDriver driver;
	@BeforeClass
	private void loginPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	
	}
	@AfterClass
	private void afterclas() {
		driver.quit();
	}
	@Test
	private void userName() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("VickyStark");	
	}
	
	@Test
	private void passWord() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vicky@12");
	}
	@Test
	private void submit() {
		driver.findElement(By.id("//input[@id='login']")).click();
	}
}
