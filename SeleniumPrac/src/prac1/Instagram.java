package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	Thread.sleep(6000);
	driver.findElement(By.name("username")).sendKeys("Hari");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("12343456789");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button/div[text()='Log in']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
