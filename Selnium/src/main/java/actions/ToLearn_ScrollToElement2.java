package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToLearn_ScrollToElement2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
driver.get("https://www.naukri.com/");
WebElement ele = driver.findElement(By.xpath("//span[text()='Resume writing']"));
Actions a=new Actions(driver);
//a.scrollToElement(ele).perform();
 ScrollOrigin s = ScrollOrigin.fromElement(ele);
 Thread.sleep(4000);
 //a.scrollFromOrigin(s, 0, 200).click(ele).perform();

 
}
}
