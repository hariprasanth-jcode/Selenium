package synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		driver.get(url);

		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] items = { "Brocolli", "Cucumber", "Beetroot" };
		add(driver, items);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		ewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		ewait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		driver.quit();

	}

	public static void add(WebDriver driver, String[] items) {
		List<String> itemsneeded = Arrays.asList(items);
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			String[] prod1 = products.get(i).getText().split(" ");
			String formatted = prod1[0].trim();
			if (itemsneeded.contains(formatted)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
	}
}
