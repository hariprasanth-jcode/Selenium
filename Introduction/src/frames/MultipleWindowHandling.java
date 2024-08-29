package frames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
driver.findElement(By.xpath("//a[text()='Click Here']")).click();
Set<String> win_id = driver.getWindowHandles();
for(String id:win_id) {
	driver.switchTo().window(id);
	}
Thread.sleep(2000);
System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());

}
}
