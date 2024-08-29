package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators3 {
public static void main(String[] args) throws InterruptedException {
	
//	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
//    WebDriver driver = new FirefoxDriver();
	//System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	WebDriver driver = new ChromeDriver();
	String password=getPassword(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("hari.mba000@gmail.com");

	driver.findElement(By.name("inputPassword")).sendKeys("Hari@150599");
	
	driver.findElement(By.className("signInBtn")).click();

String text=driver.findElement(By.xpath("//p[@class='error']")).getText();
System.out.println(text);

driver.findElement(By.linkText("Forgot your password?")).click();

driver.findElement(By.xpath("//form/input[@placeholder='Name']")).sendKeys("Hari");
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Hari.mba000@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456");
driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Hari");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.id("chkboxOne")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	driver.quit();
}

public static String getPassword(WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String password=driver.findElement(By.xpath("//form/p")).getText();
	String[] password_array=password.split("'");
	String res=password_array[1].split("'")[0];
	return res;
}
}
