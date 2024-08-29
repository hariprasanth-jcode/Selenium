package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkInTestNg {
@Test(priority = 1)
public void m1() {
     WebDriver driver = new ChromeDriver();
     driver.get("https://demowebshop.tricentis.com/");
     driver.findElement(By.id("small-searchterms")).sendKeys("computer",Keys.ENTER);
}
@Test(priority = -3)
public void m2() {
	WebDriver driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/login");
}
@Test(priority=1)
public void m3() {
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.shoppersstack.com/");
}
}
