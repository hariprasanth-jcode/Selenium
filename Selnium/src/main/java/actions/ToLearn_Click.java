package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearn_Click {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println("before clicking : "+driver.getTitle());
    WebElement ele_01 = driver.findElement(By.partialLinkText("Com"));
    Actions a=new Actions(driver);
    a.click(ele_01).perform();
    System.out.println("After clicking : "+driver.getTitle());
    Thread.sleep(2000);
  
    
}
}
