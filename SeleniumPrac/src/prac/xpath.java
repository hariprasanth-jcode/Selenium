package prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/search?q=vivo%20v30%20pro%202024&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		List<WebElement> ele = driver
				.findElements(By.xpath("//div[@class='DOjaWF gdgoEp']//div[contains(@class,'Nx9bqj _4b5DiR')]"));
		for (WebElement webElement : ele) {
			System.out.println(webElement.getText());

		}
	}
}
