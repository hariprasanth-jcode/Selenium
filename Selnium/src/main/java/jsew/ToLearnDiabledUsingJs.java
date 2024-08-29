package jsew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDiabledUsingJs {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoapp.skillrary.com/");
	driver.findElement(By.id("details-button")).click();
	Thread.sleep(10000);
	driver.findElement(By.id("proceed-link")).click();
	Thread.sleep(4000);
	WebElement ele = driver.findElement(By.xpath("//input[@class='form-control']"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	System.out.println(ele.isEnabled());
	js.executeScript("arguments[0].value='qsp batch';", ele);
	System.out.println(ele.isEnabled());
	Thread.sleep(2000);
}vbvvvbvbv
}
