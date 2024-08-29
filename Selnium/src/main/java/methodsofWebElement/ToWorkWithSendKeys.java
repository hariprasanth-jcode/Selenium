package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSendKeys {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement element=driver.findElement(By.id("small-searchterms"));
//element.sendKeys("computers",Keys.ENTER);
element.sendKeys("c","o","m",Keys.ENTER);
}
}
