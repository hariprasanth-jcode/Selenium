package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.id("identify_email")).sendKeys("hariprasanth@1234");
	driver.findElement(By.name("did_submit")).click();
	driver.close();
}
}
