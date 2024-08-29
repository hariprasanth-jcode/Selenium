package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait1 {
public static void main(String[] args) {
	//https://the-internet.herokuapp.com/dynamic_loading/1
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	
	WebElement ele1 = driver.findElement(By.cssSelector("div[id='finish'] h4"));
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	
	WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

		@Override
		public WebElement apply(WebDriver t) {
		   if(ele1.isDisplayed()) {
			   return ele1;
		   }
		  return null;
		}
	});
	System.out.println(foo.getText());
	
	
}
}
