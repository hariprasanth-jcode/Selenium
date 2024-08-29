package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToFrame {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dezlearn.com/nested-iframes-example/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.switchTo().frame(driver.findElement(By.xpath("//div//iframe[@name='demo_parent_iframe']")));
	//driver.findElement(By.xpath("//div[@class='ml-popup w-100 row-form']//button[@class='close']")).click();
WebElement ele1 = driver.findElement(By.xpath("//h4[text()='Parent iframe']/..//div//button"));
ele1.click();
WebElement ele = driver.findElement(By.xpath("//div//iframe[@id='iframe1']"));
driver.switchTo().frame(ele);
WebElement ele2 = driver.findElement(By.xpath("//h4[text()='iframe 2']/..//div//button"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true)", ele2);
ele2.click();
	
}
}
