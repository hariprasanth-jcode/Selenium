package synchronization;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitStmt1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	String[] items= {"Brocolli","Cucumber","Beetroot"};
	add(driver, items);
	driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

	driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[text()='Apply']")).click();
	driver.quit();
	
}
public static void add(WebDriver driver,String[] items) {
	List<String> itemsneeded = Arrays.asList(items);
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	for(int i=0;i<products.size();i++) {
		String[] prod1 = products.get(i).getText().split(" ");
		String formatted=prod1[0].trim();
		if(itemsneeded.contains(formatted)) {
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}
	}
}
}
