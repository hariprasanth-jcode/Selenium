package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSendKeysMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.id("FirstName"))
	.sendKeys("Hari",Keys.TAB,"Prasanth",Keys.TAB,"Hari.mba00@gmail.com",Keys.TAB,"Hari@123",Keys.TAB,"Hari@123",Keys.TAB,Keys.ENTER);
}
}
