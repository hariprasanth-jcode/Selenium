package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScorllByElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/apparel-shoes");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.partialLinkText("Denim"));
	Actions a=new Actions(driver);
	Thread.sleep(4000);
	a.scrollToElement(ele).perform();
	
}
}
