package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Logout extends BookaHotel  {
static WebDriver driver;
@Test
private void logOut() {
driver.findElement(By.id("logout")).click();

}
}
