package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToClickOnWishList {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
     
     // Wait for the page to load completely
    // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[name()='svg' and @id='addToWishlist']//*[name()='path']/../../../../..//div//span[text()='BLUSHIS']")));
     JavascriptExecutor js = (JavascriptExecutor)driver;
     WebElement ele = driver.findElement(By.xpath("//*[name()='svg' and @id='addToWishlist']//*[name()='path']/../../../../..//div//span[text()='BLUSHIS']"));

     js.executeScript("arguments[0].scrollIntoView(true)", ele);
     // Find and click the element
     //WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='svg' and @id='addToWishlist']//*[name()='path']/../../../../..//div//span[text()='BLUSHIS']")));
    // ele.click();
	w.until(ExpectedConditions.elementToBeClickable(ele));
	ele.click();
}
}
