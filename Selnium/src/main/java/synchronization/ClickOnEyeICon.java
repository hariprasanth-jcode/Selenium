package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnEyeICon {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	driver.findElement(By.id("password")).sendKeys("123456");
	WebElement ele = driver.findElement(By.cssSelector("div[class*='showPassword']"));
    Actions a=new Actions(driver);
    a.clickAndHold(ele).perform();
}
}
