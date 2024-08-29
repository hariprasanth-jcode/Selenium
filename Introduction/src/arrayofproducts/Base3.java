package arrayofproducts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base3 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.automationexercise.com/#google_vignette");
	List<WebElement> element = driver.findElements(By.xpath("//*[text()='Add to cart']"));
	System.out.println(element.size());
}
}
