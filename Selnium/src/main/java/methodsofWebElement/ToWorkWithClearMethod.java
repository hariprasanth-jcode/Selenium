package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithClearMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement ele = driver.findElement(By.id("small-searchterms"));
	ele.sendKeys("T Shirt");
	Thread.sleep(2000);
	ele.clear();
	ele.sendKeys("pant",Keys.ENTER);
}
}
