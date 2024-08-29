package locatorsUsingContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithXpath_Contains2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/apparel-shoes");
	driver.findElement(By.xpath("//*[text()='Blue and green Sneaker']/../../../..//input[@value='Add to cart']")).click();
	
}
}
