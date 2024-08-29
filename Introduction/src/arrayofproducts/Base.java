package arrayofproducts;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] names = { "Brocolli", "Cucumber" };
		addElement(driver,names);
		
		
	}
	
	public static void addElement(WebDriver driver,String[] names) {
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		System.out.println(products.size());

		for (int i = 0; i < products.size(); i++) {
			List name = Arrays.asList(names);
			String[] nameinneed = products.get(i).getText().split(" ");
			String formatted = nameinneed[0].trim();
			if (name.contains(formatted)) {
				// products.get(i).findElement(By.xpath("//button[text()='ADD TO
				// CART']")).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}

		}
	}
}
