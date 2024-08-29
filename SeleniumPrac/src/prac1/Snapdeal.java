package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://snapdeal.com");
	driver.findElement(By.cssSelector("input[placeholder='Search products & brands']")).sendKeys("SmartWatch");
	driver.findElement(By.className("searchformButton")).click();
	driver.close();
	
}
}
