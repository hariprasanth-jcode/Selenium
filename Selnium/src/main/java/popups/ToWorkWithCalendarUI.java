package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWorkWithCalendarUI {
	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://in.via.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        // Click on the "No thanks!" button
	        new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='No thanks!']")))
	            .click();

	        // Click on the return date element
	        new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'element') and contains(@class, 'return-element')]//div[contains(@class, 'vc-cell')]//div[contains(@class, 'vc-selected-cell')]")))
	            .click();

	        // Clean up by closing the browser
	        driver.quit();

	}
}
