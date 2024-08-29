package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElementOnAmazonLogin {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//div[@class='nav-search-field ']//input"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
	a.contextClick(ele).build().perform(); 
}
}
