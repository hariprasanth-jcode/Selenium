package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithWindowHandles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Facebook")).click();
	//String id = driver.getWindowHandle();
	Set<String> all_id = driver.getWindowHandles();
	
	for(String wid:all_id) {
		driver.switchTo().window(wid);
		System.out.println(driver.getTitle());
	}
	
	
	Thread.sleep(1000);
	
}
}
