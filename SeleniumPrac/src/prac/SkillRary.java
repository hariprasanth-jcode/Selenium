package prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRary {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com");
   // driver.findElement(By.partialLinkText("LOGIN")).click();
    driver.findElement(By.partialLinkText("SIGNUP")).click();
//	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hari.mba000@gmail.com");
//	driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Hari@150599");
//	driver.findElement(By.cssSelector("button[name='login']")).click();
	
}
}
