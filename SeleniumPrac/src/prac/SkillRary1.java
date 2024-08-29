package prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRary1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://www.skillrary.com/");
	driver.navigate().to("https://www.netflix.com/in/");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.findElement(By.linkText("Sign Up")).click();
	//driver.manage().window().maximize()

	
}
}
