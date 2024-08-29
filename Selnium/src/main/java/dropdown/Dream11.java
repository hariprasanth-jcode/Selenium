package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.dream11.com/");
//	driver.switchTo().frame(0);
//	driver.findElement(By.id("regEmail")).sendKeys("9004573496",Keys.ENTER);
	WebElement ele = driver.findElement(By.id("send-sms-iframe"));
	driver.switchTo().frame(ele);
	driver.findElement(By.id("regEmail")).sendKeys("9004573496");
	driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	driver.findElement(By.id("hamburger")).click();
	

}
}
