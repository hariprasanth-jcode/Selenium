package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDouble_Click {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoapp.skillrary.com/product.php?product=testing");
	driver.findElement(By.id("details-button")).click();
	Thread.sleep(10000);
	driver.findElement(By.id("proceed-link")).click();
	Thread.sleep(4000);
	WebElement ele = driver.findElement(By.id("add"));
	Actions action=new Actions(driver);
	for(int i=1;i<9;i++) {
	action.doubleClick(ele).perform();
	}
	
}
}
