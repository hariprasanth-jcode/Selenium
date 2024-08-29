package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperAttribute_IC  {
@Test(invocationCount = 2,threadPoolSize = 3)
public void m1() {
	WebDriver driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.id("small-searchterms")).sendKeys("computer",Keys.ENTER);
}
}
