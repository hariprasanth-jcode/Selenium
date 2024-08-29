package frames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferingControlFromParentToChild {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	driver.findElement(By.className("blinkingText")).click();
	Set<String> win_id = driver.getWindowHandles();
	for(String id:win_id) {
	    driver.switchTo().window(id);
	}
	System.out.println(driver.getTitle());
	System.out.println(driver.findElement(By.xpath("//p//strong//a")).getText());
	String emailId=driver.findElement(By.xpath("//p//strong//a")).getText();
	List<String> win_id1=new ArrayList(win_id);
	driver.switchTo().window(win_id1.get(0));
	System.out.println(driver.getTitle());
	
	driver.findElement(By.name("username")).sendKeys(emailId,Keys.TAB);
	driver.quit();
	
}
}
