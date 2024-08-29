package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Conformation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
	driver.get("https://licindia.in/");
	driver.findElement(By.xpath("//a[contains(text(), ' Pay Premium ') ]")).click();
	Alert a=driver.switchTo().alert();
	a.dismiss();
}
}
