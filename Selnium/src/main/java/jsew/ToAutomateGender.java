package jsew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class ToAutomateGender {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	WebElement e = driver.findElement(By.xpath("//label[text()='Custom']"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()",e);
	WebElement e1 = driver.findElement(By.xpath("//input[@name='custom_gender']"));
	//jse.executeScript("arguments[0].scrollIntoView(true);",e1);
	jse.executeScript("arguments[0].value='Male';",e1);
	
}
}
