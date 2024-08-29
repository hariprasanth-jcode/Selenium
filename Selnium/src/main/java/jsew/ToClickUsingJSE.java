package jsew;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickUsingJSE {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	 List<WebElement> ele = driver.findElements(By.xpath("//span[@class='_5k_3']/span/label"));
	System.out.println(ele);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='hari';", driver.findElement(By.name("firstname")));
	 Thread.sleep(2000);
	js.executeScript("arguments[0].value='prasanth';", driver.findElement(By.name("lastname")));
	 Thread.sleep(2000);
	js.executeScript("arguments[0].value='1234567890';", driver.findElement(By.name("reg_email__")));
	 Thread.sleep(2000);
	 js.executeScript("arguments[0].value='hari1234@';", driver.findElement(By.name("reg_passwd__")));
	 Thread.sleep(2000);
for(int i=0;i<ele.size();i++) {
 Thread.sleep(2000);
 js.executeScript("arguments[0].click();",ele.get(i));
}
	


	
	
}
}
