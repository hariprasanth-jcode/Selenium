package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	driver.findElement(By.id("APjFqb")).sendKeys("HariPrasanth");
	Thread.sleep(6000);
	driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
	
}
}
