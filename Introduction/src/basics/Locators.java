package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) throws Exception {
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("inputUsername")).sendKeys("hari.mba000@gmail.com");

	driver.findElement(By.name("inputPassword")).sendKeys("Hari@150599");
	
	driver.findElement(By.className("signInBtn")).click();

	String text = driver.findElement(By.cssSelector("p[class='error']")).getText();
	System.out.println(text);
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Hari");
    driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rahulshettyacademy");
//    Thread.sleep(5000);
//    driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
//    Thread.sleep(5000);
//    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
    
    driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456");
    
    driver.findElement(By.xpath("//form/div/button[2]")).click();
    
   String text1= driver.findElement(By.xpath("//form/p")).getText();
   System.out.println(text1);
   driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[text()='Go to Login']")).click();
	//driver.close();
   
   
	
	
}
}
